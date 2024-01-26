package FirstOopCode;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Compte C1 = new Compte();
      
      System.out.println(C1.toString());
    	
      Compte C2 = new Compte(12,"Ahmed");
      
      
      System.out.println(C2.toString());
      
      C1.deposer(500);
      C2.deposer(1000);
      
      System.out.println(C1.toString());
      System.out.println(C2.toString());
      
      
      C1.virerVers(10,C2);
      
      System.out.println("Compte 1 :"+ C1.toString());
      System.out.println("Compte 2 : " + C2.toString());
      
	} 
	
	

}
 