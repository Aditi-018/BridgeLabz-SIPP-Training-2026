interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {
        String text = post.toLowerCase();
        return text.contains("hate") ||
               text.contains("abuse") ||
               text.contains("badword");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is prohibited.");
    }
}

public class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        String text = post.toLowerCase();
        return text.contains("buy now") ||
               text.contains("click here") ||
               text.contains("free money");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "Hello everyone!",
                "Buy now and get 50% off!",
                "I hate this service.",
                "Click here to win free money.",
                "Have a great day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (moderator.checkOffensiveContent(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}