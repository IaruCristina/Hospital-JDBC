package jdbccon;

import java.sql.SQLException;
import java.util.Scanner;

import com.manager.AngajatCRUD;
import com.manager.DepartamentCRUD;
import com.manager.PacientCRUD;

public class Main {

	public static void main(String[] args) throws SQLException { // word+ctrl+space
//		
		System.out.println("1. Angajat 2.Departament 3.Pacient");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		while(option!=0) {
		switch (option) {
		case 0:
		break;
		case 1:

			System.out.println("1.Save 2.Read 3.Delete");
			int option1 = sc.nextInt();
			
			switch (option1) {
			case 1:
				AngajatCRUD emp = new AngajatCRUD();
				emp.save();
				
				break;
			case 2:
				AngajatCRUD emps = new AngajatCRUD();
				emps.read();
				break;
			case 3:
				AngajatCRUD emps2 = new AngajatCRUD();
				emps2.delete();
				break;
			default:
				System.out.println("Invalid input");
				option1 = sc.nextInt();
				break;
			}
			option = sc.nextInt();
			break;
		case 2:

			System.out.println("1.Save 2.Read 3.Delete");
			option1 = sc.nextInt();
			switch (option1) {
			case 1:
				DepartamentCRUD dep = new DepartamentCRUD();
				dep.save();
				break;
			case 2:
				DepartamentCRUD depa = new DepartamentCRUD();
				depa.read();
				break;
			case 3:
				DepartamentCRUD depar = new DepartamentCRUD();
				depar.delete();
				break;
			default:
				System.out.println("Invalid input");
				option1 = sc.nextInt();
				break;
			}
			option = sc.nextInt();
			break;
		case 3:
			
			System.out.println("1.Save 2.Read 3.Delete");
			option1 = sc.nextInt();
			switch (option1) {
			case 1:
				PacientCRUD pac = new PacientCRUD();
				pac.save();
				break;
			case 2:
				PacientCRUD paci = new PacientCRUD();
				paci.read();
				break;
			case 3:
				PacientCRUD pacient = new PacientCRUD();
				pacient.delete();
				break;
			default:
				System.out.println("Invalid input");
				option1 = sc.nextInt();
				break;
			}
			option = sc.nextInt();
			break;
		}
	}
  }
}
