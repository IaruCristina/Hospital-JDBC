package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Furnizor;

public class FurnizorCRUD {


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
		
		Furnizor fur = new Furnizor();
		System.out.println("ID furnizor: ");
		fur.setId_furnizor(sc.nextInt());
		System.out.println("ID angajat: ");
		fur.setId_angajat(sc.nextInt());
		System.out.println("Adresa furnizor: ");
		fur.setAdresa_furnizor(sc.next());
		System.out.println("Nume furnizor: ");
		fur.setNume_furnizor(sc.next());
		System.out.println("Nr.Telefon furnizor: ");
		fur.setNr_telefon_furnizor(sc.next());
		//INSERT INTO `spital`.`furnizor` (`id_furnizor`, `id_angajat`, `adresa_furnizor`, `nume_furnizor`, `nr_telefon_furnizor`) VALUES
		//('1', '1', 'carpatilor', 'pop', '0728957489');

		String sql = "  INSERT INTO `spital`.`furnizor` (`id_furnizor`, `id_angajat`, `adresa_furnizor`, `nume_furnizor`, `nr_telefon_furnizor`) VALUES"
				+ "(" + fur.getId_furnizor()+ ", " + fur.getId_angajat() + ", '"
				+ fur.getAdresa_furnizor() + "', '" + fur.getNume_furnizor() + "', '" + fur.getNr_telefon_furnizor() + "'); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id furnizor : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`furnizor` WHERE (`id_furnizor` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.furnizor;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_furnizor")+ " "+rs.getInt("id_angajat")+ " " +
		rs.getString("adresa_furnizor") + " "+rs.getString("nume_furnizor") + " " + rs.getString("nr_telefon_furnizor"));
		}
	}
}
