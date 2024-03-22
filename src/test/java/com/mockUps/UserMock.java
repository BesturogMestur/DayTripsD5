package com.mockUps;

import com.data.UserTable;
import com.model.Booking;
import com.model.User;
import com.model.UserInt;

public class UserMock implements UserInt {
	private String id;
	private char[] password;
	private String fName;
	private String lName;
	private Booking[] booked;
	private UserTable table;

	public UserMock() throws Exception {
		this.table = new UserTable();
	}

	public void find(String id, char[] password) throws Exception {
		this.table.getCon();
		if (isValid(id, password)) {
			this.id = id;
			this.password = password;
			setValues();
		}
		this.table.disCon();

		if (id != null) {
			setBooking();
		}
	}

	private void setValues() {
		fName = this.table.getFName(this.id);
		lName = this.table.getLName(this.id);
	}

	private boolean isValid(String id, char[] password) {
		return this.table.isValid(id, String.valueOf(password));
	}

	private void setBooking() {
		// Implement setBooking method
	}

	public void add(String id, char[] password, String fName, String lName) throws Exception {
		this.table.getCon();
		this.table.add(id, String.valueOf(password), fName, lName);
		this.table.disCon();
	}

	@Override
	public void find(String id, char password) {

	}

	@Override
	public void add(String id, char password, String fName, String lName) {

	}

	@Override
	public boolean isPwValed(char password) {
		return false;
	}

	@Override
	public void del() {
		// Implement del method
	}

	@Override
	public String getId() {
		return null; // Implement getId method
	}

	@Override
	public void delUser() {
		// Implement delUser method
	}
}
