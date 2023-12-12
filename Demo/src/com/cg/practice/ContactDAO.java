package com.cg.practice;

public class ContactDAO {

	private static ContactDAO instance = null;

	private ContactDAO() {

	}

	public static ContactDAO getInstance() {
		if (instance == null) {
			instance = new ContactDAO();
		}
		return instance;

	}


}
