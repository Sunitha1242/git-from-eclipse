package com.cg.practice;

import java.util.List;
import java.util.Scanner;
/* Sunitha mobile services needs to store their customer details in the company portal. the details are customer first and last name, phone number and email address. Help the company develop an application to maintain details of their customer systematically.
you are provided with a class Contact with the following attributes as private.
String firstName
String lastName
long phoneNumber
String emailId

A four argument constructor and appropriate getters and setters to store and retrieve the details are also provided.

Create a class with phonebook with a private attribute
list phonebook = new ArrayList();
write the getters and setters

write the following in the phonebook class
1.public void addContact(contact contactobj)- This method should add contact object to the phonebook list
2.public List<contacts> viewAllContacts()-This method should return the list of all contacts available.
3.public Contact viewContactGivenPhone(long phoneNumber)-This method should return the contact details which has the phoneNumber as parameter.
4.public boolean removeContact(long phoneNumber)- This method should remove the contact details which has the phoneNumber as parameter.If removed return true.
Else if the phoneNumber not available return false.

write a class with the main method .Create the menu as shown in Sample Input and Output and invoke the corresponding methods as per the choice provided .

Sample Input and Output:

Menu
1.Add contact
2.Display all concts
3.Search contact by phone
4.Remove contact
5.Exit
Enter your choice:
*/

public class PhoneBookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneBook phonebook = new PhoneBook();

		while (true) {
			System.out.println("Menu");
			System.out.println("1. Add contact");
			System.out.println("2. Display all contacts");
			System.out.println("3. Search contact by phone");
			System.out.println("4. Remove contact");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter First Name: ");
				String firstName = scanner.nextLine();
				System.out.print("Enter Last Name: ");
				String lastName = scanner.nextLine();
				System.out.print("Enter Phone Number: ");
				long phoneNumber = scanner.nextLong();
				scanner.nextLine(); // Consume the newline character
				System.out.print("Enter Email Address: ");
				String emailId = scanner.nextLine();
				Contact newContact = new Contact(firstName, lastName, phoneNumber, emailId);
				phonebook.addContact(newContact);
				System.out.println("Contact added successfully!");
				break;
			case 2:
				List<Contact> allContacts = phonebook.viewAllContacts();
				System.out.println("All Contacts:");
				for (Contact contact : allContacts) {
					System.out.println(contact);
					System.out.println();
				}
				break;
			case 3:
				System.out.print("Enter Phone Number to search: ");
				long searchPhoneNumber = scanner.nextLong();
				scanner.nextLine(); // Consume the newline character
				Contact foundContact = phonebook.viewContactGivenPhone(searchPhoneNumber);
				if (foundContact != null) {
					System.out.println("Contact found:");
					System.out.println(foundContact);
				} else {
					System.out.println("Contact not found.");
				}
				break;
			case 4:
				System.out.print("Enter Phone Number to remove: ");
				long removePhoneNumber = scanner.nextLong();
				scanner.nextLine(); // Consume the newline character
				boolean removed = phonebook.removeContact(removePhoneNumber);
				if (removed) {
					System.out.println("Contact removed successfully.");
				} else {
					System.out.println("Contact not found.");
				}
				break;
			case 5:
				System.out.println("Exiting the application.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
