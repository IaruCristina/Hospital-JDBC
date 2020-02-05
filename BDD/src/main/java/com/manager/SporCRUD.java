package com.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.DatabaseConnection;
import com.model.Spor;

public class SporCRUD {


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
		
		Spor sp = new Spor();
		System.out.println("ID spor: ");
		sp.setId_spor(sc.nextInt());
		System.out.println("S. vechime: ");
		sp.setS_vechime(sc.nextFloat());
		System.out.println("S. calculator: ");
		sp.setS_calculator(sc.nextFloat());
		System.out.println("S. garda: ");
		sp.setS_garda(sc.nextFloat());
		System.out.println("S. toxicitate: ");
		sp.setS_toxicitate(sc.nextFloat());
		
		//INSERT INTO `spital`.`spor` (`id_spor`, `s_vechime`, `s_calculator`, `s_garda`, `s_toxicitate`) VALUES 
		//('2', '100', '120', '120', '100');



		String sql = " INSERT INTO `spital`.`spor` (`id_spor`, `s_vechime`, `s_calculator`, `s_garda`, `s_toxicitate`) VALUES "
				+ "(" + sp.getId_spor()+ ", " + sp.getS_vechime() + ", "
				+ sp.getS_calculator() + ", " + sp.getS_garda() + ", " + sp.getS_toxicitate() + "); ";
		st.executeUpdate(sql);
	}

	public void delete() throws SQLException {
		System.out.println(" Id spor : ");
		int deleteID = sc.nextInt();
		String sql = "DELETE FROM `spital`.`spor` WHERE (`id_spor` =" + deleteID + ");";
		st.executeUpdate(sql);
	}

	public void read() throws SQLException {
		String sql = "SELECT * FROM spital.spor;";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_spor")+ " "+rs.getFloat("s_vechime")+ " " + rs.getFloat("s_calculator")+ " " +
		rs.getFloat("s_garda") + " "+rs.getFloat("s_toxicitate"));
		}
	}
}
