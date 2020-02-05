package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Personal;

public class PersonalCRUD {


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
		
		Personal pers = new Personal();
		System.out.println("ID personal: ");
		pers.setId_personal(sc.nextInt());
		System.out.println("ID departament: ");
		pers.setId_departament(sc.nextInt());
		System.out.println("ID pacient: ");
		pers.setId_pacient(sc.nextInt());
		System.out.println("ID angajat: ");
		pers.setId_angajat(sc.nextInt());
		
		//INSERT INTO `spital`.`personal` (`id_personal`, `id_departament`, `id_pacient`, `id_angajat`) VALUES ('1', '1', '1', '1');



		String sql = " INSERT INTO `spital`.`personal` (`id_personal`, `id_departament`, `id_pacient`, `id_angajat`) VALUES "
				+ "(" + pers.getId_personal() + ", " + pers.getId_departament() + ", "
				+ pers.getId_pacient() + ", " + pers.getId_angajat() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id personal : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`personal` WHERE (`id_personal` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.personal;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_personal")+ " "+rs.getInt("id_departament")+ " " + rs.getInt("id_pacient")+ " " +
		rs.getInt("id_angajat"));
		}
	}
}
