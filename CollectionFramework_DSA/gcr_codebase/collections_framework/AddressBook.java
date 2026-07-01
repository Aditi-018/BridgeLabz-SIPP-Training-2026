import java.util.*;

// Contact class
class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Name : " + name +
               "\nPhone: " + phone +
               "\nEmail: " + email + "\n";
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.\n");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added successfully.\n");
    }

    // Search Contact
    static void searchContact(String name) {
        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found.\n");
    }

    // Delete Contact
    static void deleteContact(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact deleted successfully.\n");
        } else {
            System.out.println("Contact not found.\n");
        }
    }

    // Display Contacts Sorted by Name
    static void displayContacts() {
        Collections.sort(contacts);

        System.out.println("----- Contact List -----");

        for (Contact c : contacts)
            System.out.println(c);
    }

    // Main Method
    public static void main(String[] args) {

        addContact("Alice", "9876543210", "alice@gmail.com");
        addContact("Bob", "9123456780", "bob@gmail.com");
        addContact("Charlie", "9988776655", "charlie@gmail.com");

        // Duplicate phone number
        addContact("David", "9876543210", "david@gmail.com");

        System.out.println("Searching Bob:");
        searchContact("Bob");

        System.out.println("Deleting Alice:");
        deleteContact("Alice");

        displayContacts();
    }
}