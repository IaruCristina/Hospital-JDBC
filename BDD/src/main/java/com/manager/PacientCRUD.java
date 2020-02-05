package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Pacient;

public class PacientCRUD {


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
		
		Pacient pac = new Pacient();
		System.out.println("ID pacient: ");
		pac.setId_pacient(sc.nextInt());
		System.out.println("Nume pacient: ");
		pac.setNume_pacient(sc.next());
		System.out.println("Varsta pacient: ");
		pac.setVarsta_pacient(sc.nextInt());
		System.out.println("Boala pacient: ");
		pac.setBoala_pacient(sc.next());
		System.out.println("Tratament pacient: ");
		pac.setTratament_pacient(sc.next());
		
		//INSERT INTO `spital`.`pacient` (`id_pacient`, `nume_pacient`, `varsta_pacient`, `boala_pacient`,
				//`tratament_pacient`) VALUES ('1', 'popescu', '20', 'adhd', 'pauza');
		String sql = "  INSERT INTO `spital`.`pacient` (`id_pacient`, `nume_pacient`, `varsta_pacient`, `boala_pacient`,`tratament_pacient`) VALUES "
				+ "(" + pac.getId_pacient()+ ", '" + pac.getNume_pacient() + "', "
				+ pac.getVarsta_pacient() + ", '" + pac.getBoala_pacient() + "', '" + pac.getTratament_pacient() + "'); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id pacient : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`pacient` WHERE (`id_pacient` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.pacient;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_pacient")+ " "+rs.getString("nume_pacient")+ " " +
		rs.getInt("varsta_pacient") + " "+rs.getString("boala_pacient") + " " + rs.getString("tratament_pacient"));
		}
	}
}
