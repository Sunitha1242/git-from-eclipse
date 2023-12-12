package com.cg.practice;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	    private List<Contact> phonebook = new ArrayList<>();

	    // Add contact to the phonebook
	    public void addContact(Contact contactObj) {
	        phonebook.add(contactObj);
	    }

	    // Return the list of all contacts available
	    public List<Contact> viewAllContacts() {
	        return phonebook;
	    }

	    // Return contact details based on phone number
	    public Contact viewContactGivenPhone(long phoneNumber) {
	        for (Contact contact : phonebook) {
	            if (contact.getPhoneNumber() == phoneNumber) {
	                return contact;
	            }
	        }
	        return null; // Contact not found
	    }

	    // Remove contact based on phone number
	    public boolean removeContact(long phoneNumber) {
	        for (Contact contact : phonebook) {
	            if (contact.getPhoneNumber() == phoneNumber) {
	                phonebook.remove(contact);
	                return true; // Contact removed successfully
	            }
	        }
	        return false; // Contact not found
	    }

	    // Getters and setters for Phonebook attribute
	    public List<Contact> getPhonebook() {
	        return phonebook;
	    }

	    public void setPhonebook(List<Contact> phonebook) {
	        this.phonebook = phonebook;
	    }
	}




