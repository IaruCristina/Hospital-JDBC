import java.util.*;

public class Afd extends Afn {
	
	public ArrayList <String> etats;
	public ArrayList <Character> alphabet;
	public ArrayList <String> etatsFinaux;
	public String etatInitial;
	public String [][] fctTransition;
	
	Scanner sc=new Scanner(System.in);
	
	public Afd(){

		alphabet= new ArrayList <Character> ();
		etats= new ArrayList <String> () ;
		etatsFinaux= new ArrayList <String>() ;
	}
	
	public void afficherAlphabet(){
		 int size=alphabet.size();
		 for(int i=0;i<size;i++){
			 System.out.print(alphabet.get(i)+"\t");
		 }
	}
	
	public void afficherEtats(){
		 int taille=etats.size();
		 for(int i=0;i<taille;i++){
			 System.out.print(etats.get(i)+", ");
		 }
		 System.out.println();
	 }
	
	public void afficherEtatsFinaux(){
		 int taille= etatsFinaux.size();
		 for(int i=0;i<taille;i++){
			 System.out.print(etatsFinaux.get(i)+"\t");
		 }
		 System.out.print("\n");
	}
	public void afficherEtatsInitial(){
		  System.out.println("Initial state of AFD is : S0 ");
		}
	
	//********************** fonction de transition  ***************************//			
	
	
	public void fonctionTrans(){
	int i,j;
	String etatTest;
	char c;
	String f;
	fctTransition = new String[etats.size()][alphabet.size()];
	for(i=0;i<etats.size();i++){
		etatTest=etats.get(i);
		for (j=0;j<alphabet.size();j++){
				c=alphabet.get(j);
				
				System.out.print("f("+etatTest+","+c+")=");
				
				f=sc.nextLine();
				fctTransition[i][j]=f;
			}
		}	
	}
	
	public void afficherFctTrans(){
		System.out.print("\t");
		afficherAlphabet();
		System.out.print("\n");
	for(int i=0;i<etats.size();i++){
		System.out.print(etats.get(i)+"\t");
	for(int j=0;j<alphabet.size();j++){

	System.out.print(fctTransition[i][j]+"\t");
	
	}
	System.out.print("\n");	
	}
}
	
	
	
}
