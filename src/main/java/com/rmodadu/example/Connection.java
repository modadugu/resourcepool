package com.rmodadu.example;

public class Connection {

	private int counter;
	private boolean active;
	/**
	 *  Connection object creation
	 * @param userName
	 * @param password
	 */
	public Connection(String userName, String password) {
		this.active = true;
		System.out.println("New connection object is created : " + userName);
	}

	/**
	 * Execute object in connection class
	 */
	public void execute() {

		System.out.println("Execution in progress");
		counter++;
	}

	/**
	 * @return
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	
	
	
}
