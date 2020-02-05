import java.util.*;
public class Afn {
	
	public ArrayList <String> etats;
	public ArrayList <Character> alphabet;
	public ArrayList <String> etatsFinaux;
	public String etatInitial;
	public String [][] fctTransition;
	
	Scanner sc=new Scanner(System.in);
	
	public Afn(){

		alphabet= new ArrayList <Character> ();
		etats= new ArrayList <String> () ;
		etatsFinaux= new ArrayList <String>() ;
	}
	
	public String Getetatinitial(){
		return this.etatInitial ;
	}
	
	public void Setetatinitial(String etatI){
		this.etatInitial=etatI;
		
	}
	

	
//**********************gestiunea starilor ***************************//
	
	public void menuEtat(){
		System.out.println("choix 1: ajouter un état:    ");
		System.out.println("Option 2: Show states:     ");

		System.out.println("Option 3: Exit menu ");
	}
	
	public void ajouterEtats(){
		int  n;
		String e;
		System.out.println("Choose your state numbers S:  ");
		// ajouter exception d' int apres 
		n=sc.nextInt();
		for(int i=0;i<n;i++){
				e="s"+i;	
				etats.add(e);
		}	
	}
	

	 
	 public void afficherEtats(){
		 int taille=etats.size();
		 for(int i=0;i<taille;i++){
			 System.out.print(etats.get(i)+", ");
		 }
		 System.out.println();
	 }
	 
	//**********************gestiunea alfabetului ***************************//	
		public void menuAlphabet(){
			System.out.println("Choose your convenient options :");
			System.out.println("Option 1: Add symbol ");
		
			System.out.println("Option 2: Show your alfabeth");
			System.out.println("Option 3: Exit menu");
		}
		

		
		
		public void ajouterSymbole(){
			char s; // simbolul de intrare dat de utilizator
			int i; //
			System.out.print("Choose a symbol you wanna add (char):   ");
			s=sc.next().charAt(0);
			
			if(alphabet.size()!=0){
				i=alphabet.indexOf(s);
				
				if(i!=-1){  // if(alphabet.contains(s)
				 System.out.println("ERROR . Existent symbol !");}
				
				else{
					alphabet.add(new Character(s));
				System.out.println(s+"was added ");}
					}
			else{
				alphabet.add(new Character(s));
				System.out.println("Your symbol to be added is :   "+s);}
		}
		
		
		public void afficherAlphabet(){
			 int size=alphabet.size();
			 for(int i=0;i<size;i++){
				 System.out.print(alphabet.get(i)+"\t");
			 }
		}
		
		
			
		//**********************gestiunea starilor finale  ***************************//			
	
		public void saisirEtatFinaux()
		{
			String f;
			int n;
		
				System.out.println(" Grab your final states: ");
				n=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				System.out.print("Select your final state "+(1+i)+" : ");
				f=sc.next();
				etatsFinaux.add(f);
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
		
		
		//********************** Initial State  ***************************//			

		public void afficherEtatsInitial(){
			  System.out.println("Your initial state for AFN is : S0 ");
			}
	
		//********************** fonction de transition  ***************************//			
		public void remplirFonctionTrans(){
			fctTransition= new String[etats.size()][alphabet.size()+1];
			String var;
			ArrayList <String> tab;
			int r;
			int y;
			for(int i=0;i<etats.size();i++){
				String s=etats.get(i);
				for(int j=0;j<alphabet.size()+1;j++){
					if(j==alphabet.size()){
						System.out.println("Result for ("+s+",'epsilon')");
						System.out.println("\r\n" + 
								"choose either 'empty' or 'one or more states' (0/1) :  ");
					}else{
						char a=alphabet.get(j);
						System.out.println("Give a result for ("+s+","+a+")");
						System.out.println("choose: 'empty' or 'one or more states' (0/1) : ");
					}
						int rep=sc.nextInt();
						if(rep == 0){
						fctTransition[i][j]="vide";
						}
							
						if(rep == 1){
							 tab=new ArrayList <String> ();
							System.out.println("enter the number of states");
							 r=sc.nextInt();
							System.out.println("give the result of this transition state by state:   ");
							int l;
							for(l=1;l<=r;l++){
								System.out.print("give the state"+l+" :   ");
								do{
									var=sc.nextLine();
									 y =etats.indexOf(var);
								}while(y==-1);
							tab.add(var);
							}
	
							String chaine="{";
	
							for( l=0;l<tab.size();l++){
								if(l <tab.size()-1)
									chaine=chaine+tab.get(l)+",";
								else
									chaine=chaine+tab.get(l)+"}";	
							}
							fctTransition[i][j]=chaine;
						}
					}
				}
			}
			   
		 
		public void afficherFctTrans(){
				System.out.print("\t");
				afficherAlphabet();
				System.out.print("\n");
			for(int i=0;i<etats.size();i++){
				System.out.print(etats.get(i)+"\t");
			for(int j=0;j<alphabet.size()+1;j++){
	
			System.out.print(fctTransition[i][j]+"\t");
			
			}
			System.out.print("\n");	
			}
		}
		
		
		
		public boolean testEpsilon(){
			boolean test=true;
			int i,j;
			j=alphabet.size();	
			for(i=0;i<etats.size();i++){
				if(fctTransition[i][j]!= "vide"){
				test=false;
				i=etats.size();	}
			}
			return test;
			}
		
		
		
		
}
