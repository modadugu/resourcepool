package com.rmodadu.example;

import com.rmodadu.pool.ObjectFactory;

public class ConnectionFactory implements ObjectFactory<Connection> {

	private String password;
	private String userName;

	public ConnectionFactory(String userName, String password) {
		super();

		this.userName = userName;
		this.password = password;
	}

	public Connection createNew() {
		return new Connection(userName, password);
	}
}
