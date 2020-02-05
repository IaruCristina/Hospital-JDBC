package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Angajat;

public class AngajatCRUD {


	DatabaseConnection dbc = new DatabaseConnection();

	Statement st;

	{
		try {
			st = dbc.createConn();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
	Scanner sc = new Scanner(System.in);

	public void save() throws SQLException {
		Angajat angajat = new Angajat();
		System.out.println("ID angajat: ");
		angajat.setId_angajat(sc.nextInt());
		System.out.println("Nume angajat: ");
		angajat.setNume_angajat(sc.next());
		System.out.println("Functie angajat: ");
		angajat.setFunctie_angajat(sc.next());
		System.out.println("Varsta angajat: ");
		angajat.setVarsta_angajat(sc.nextInt());
		String sql = "  INSERT INTO `spital`.`angajat` (`id_angajat`, `nume_angajat`, `functie_angajat`, `varsta_angajat`) VALUES "
				+ "(" + angajat.getId_angajat() + ", '" + angajat.getNume_angajat() + "', '"
				+ angajat.getFunctie_angajat() + "', " + angajat.getVarsta_angajat() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id angajat : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`angajat` WHERE (`id_angajat` = " + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.angajat;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_angajat")+ " "+rs.getString("nume_angajat")+ " " + rs.getString("functie_angajat") + " "+rs.getInt("varsta_angajat"));
		}
	}
}
