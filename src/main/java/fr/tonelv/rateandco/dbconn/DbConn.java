package fr.tonelv.rateandco.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	private static DbConn instance = null;
	private DbConn()
	{
		
	}
	public static DbConn getInstance() {
		 if (instance == null) {
	            
	        }

	        instance = new DbConn();

	        return instance;
	}
	
	public Connection getConnection()
	{
		
        Connection connexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException var6) {
            System.out.println("Erreur lors de l'initialisation de la connexion !!");
            System.out.println("Problème de connexion : Echec de chargement du driver JDBC/ODBC");
            System.out.println(var6.getMessage());
            var6.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/doranco?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";

        try {
            connexion = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException var5) {
            String error = "Impossible d'établir une connexion à la base de donnée";
            System.out.println(error + " : URL = " + url);

            System.out.println(var5.getMessage());
            var5.printStackTrace();
        }


      
        return connexion;
		
	}

}
