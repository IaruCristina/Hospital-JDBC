package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Departament;

public class DepartamentCRUD {


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
		
		Departament dep = new Departament();
		System.out.println("ID departament: ");
		dep.setId_departament(sc.nextInt());
		System.out.println("Nume departament: ");
		dep.setNume_departament(sc.next());
		System.out.println("Etaj departament: ");
		dep.setEtaj_departament(sc.next());
		System.out.println("Nr.aparate departament: ");
		dep.setNumar_aparate(sc.nextInt());
		System.out.println("Capacitate departament: ");
		dep.setCapacitate_departament(sc.nextInt());
		//INSERT INTO `spital`.`departament` (`id_departament`, `nume_departament`, `etaj_departament`, `numar_aparate`,
		//`capacitate_departament`) VALUES ('1', 'ginecologie', '2', '20', '100');
		String sql = "  INSERT INTO `spital`.`departament` (`id_departament`, `nume_departament`, `etaj_departament`, `numar_aparate`,`capacitate_departament`) VALUES "
				+ "(" + dep.getId_departament()+ ", '" + dep.getNume_departament() + "', '"
				+ dep.getEtaj_departament() + "', " + dep.getNumar_aparate() + ", " + dep.getCapacitate_departament() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id departament : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`departament` WHERE (`id_departament` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.departament;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_departament")+ " "+rs.getString("nume_departament")+ " " +
		rs.getString("etaj_departament") + " "+rs.getInt("numar_aparate") + " " + rs.getInt("capacitate_departament"));
		}
	}
}
