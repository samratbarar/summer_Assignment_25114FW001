package summer_Assignment_25114FW001.Day_28;

import java.util.*;

// Write a program to Create contact management system.

class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    public Contact(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phoneNumber + " | Email: " + email + " | Address: " + address;
    }

}

class ContactSystem {
    private HashMap<String, Contact> contacts;
    private final String CONTACT_NOT_FOUND = "Contact not found";

    public ContactSystem() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
        System.out.println("Contact added successfully");
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name));
        } else {
            System.out.println(CONTACT_NOT_FOUND);
        }
    }

    public void updateContact(String name, String phone, String email, String address) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);

            contact.setPhoneNumber(phone);
            contact.setEmail(email);
            contact.setAddress(address);

            System.out.println("Contact updated successfully");
        } else {
            System.out.println(CONTACT_NOT_FOUND);
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println(CONTACT_NOT_FOUND);
        }
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }

        System.out.println("--- All Contacts ---");

        for (String name : contacts.keySet()) {
            System.out.println(contacts.get(name));
        }

        System.out.println("--- End ---");
    }
}

public class Question_112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContactSystem cs = new ContactSystem();

        while (true) {
            System.out.println("\n--- Contact Management Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Show All Contacts");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    Contact contact = new Contact(name,phone,email,address);
                    cs.addContact(contact);
                }
                case 2 -> {
                    System.out.print("Enter name: ");
                    cs.searchContact(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("New Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("New Email: ");
                    String email = sc.nextLine();

                    System.out.print("New Address: ");
                    String address = sc.nextLine();

                    cs.updateContact(name,phone,email,address);
                }
                case 4 -> {
                    System.out.print("Enter name: ");
                    cs.deleteContact(sc.nextLine());
                }
                case 5 -> {
                    cs.showContacts();
                }
                case 6 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}