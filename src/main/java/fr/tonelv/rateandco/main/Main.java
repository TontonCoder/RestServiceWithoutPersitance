package fr.tonelv.rateandco.main;

import java.sql.Connection;

import fr.tonelv.rateandco.dbconn.DbConn;

public class Main {

	public static void main(String[] args) {
		Connection conn = DbConn.getInstance().getConnection();
		

	}

}
