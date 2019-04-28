package com.rmodadu.example;

import com.rmodadu.pool.Validator;

public final class ConnectionValidator implements Validator<Connection> {
	public boolean isValid(Connection con) {
		if (con == null) {
			return false;
		}

		return con.getCounter() < 10 && con.isActive();

	}

	public void invalidate(Connection con) {
		con.setActive(false);

	}
}
