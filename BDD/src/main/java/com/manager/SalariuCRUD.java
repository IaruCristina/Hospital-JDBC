package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Salariu;

public class SalariuCRUD {


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
		
		Salariu sal = new Salariu();
		System.out.println("ID salariu: ");
		sal.setId_salariu(sc.nextInt());
		System.out.println("ID angajat: ");
		sal.setId_angajat(sc.nextInt());
		System.out.println("ID spor: ");
		sal.setId_spor(sc.nextInt());
		System.out.println("Ani vechime: ");
		sal.setAni_vechime(sc.nextInt());
		System.out.println("Venit brut: ");
		sal.setVenit_brut(sc.nextFloat());
		System.out.println("Venit net: ");
		sal.setVenit_net(sc.nextFloat());
		//INSERT INTO `spital`.`salariu` (`id_salariu`, `id_angajat`, `id_spor`, `ani_vechime`, `venit_brut`, `venit_net`) VALUES 
		//('1', '1', '1', '2', '100', '150');


		String sql = " INSERT INTO `spital`.`salariu` (`id_salariu`, `id_angajat`, `id_spor`, `ani_vechime`, `venit_brut`, `venit_net`) VALUES "
				+ "(" + sal.getId_salariu()+ ", " + sal.getId_angajat() + ", "
				+ sal.getId_spor() + ", " + sal.getAni_vechime() + ", " + sal.getVenit_brut() + ", " + sal.getVenit_net() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id salariu : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`salariu` WHERE (`id_salariu` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.salariu;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_salariu")+ " "+rs.getInt("id_angajat")+ " " + rs.getInt("id_spor")+ " " +
		rs.getInt("ani_vechime") + " "+rs.getFloat("venit_brut") + " " + rs.getFloat("venit_net"));
		}
	}
}
