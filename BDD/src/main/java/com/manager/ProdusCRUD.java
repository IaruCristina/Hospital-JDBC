package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Produs;

public class ProdusCRUD {


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
		Produs prod = new Produs();
		System.out.println("ID produs: ");
		prod.setId_produs(sc.nextInt());
		System.out.println("Nume produs: ");
		prod.setNume_produs(sc.next());
		System.out.println("ID furnizor: ");
		prod.setId_furnizor(sc.nextInt());
		System.out.println("Pret produs: ");
		prod.setPret_produs(sc.nextFloat());
		System.out.println("Cantitate produs: ");
		prod.setCantitate_produs(sc.nextInt());
		
		//INSERT INTO `spital`.`produs` (`id_produs`, `nume_produs`, `id_furnizor`, `pret_produs`, `cantitate_produs`) VALUES 
		//('1', 'manusi', '1', '100', '50');

		String sql = " INSERT INTO `spital`.`produs` (`id_produs`, `nume_produs`, `id_furnizor`, `pret_produs`, `cantitate_produs`) VALUES "
				+ "(" + prod.getId_produs() + ", '" + prod.getNume_produs() + "', "
				+ prod.getId_furnizor() + ", " + prod.getPret_produs() + ", " + prod.getCantitate_produs() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id produs : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`produs` WHERE (`id_produs` = " + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.produs;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_produs")+ " "+rs.getString("nume_produs")+ " " + rs.getInt("id_furnizor") +
					" "+rs.getFloat("pret_produs")+ " " + rs.getInt("cantitate_produs"));
		}
	}
}
