package FirstOopCode;

public class Compte {
	   
	//Attrs
       private int solde=0;
       private String nomTitulaire;
      
     //Methods  
       public void retirer(int montant)
       {
    	   solde = solde - montant;
       }
        
       public void deposer(int montant)
       {
    	   solde = solde + montant;
       }
       
       public void virerVers(int montant,Compte destination)
       {
    	   this.retirer(montant);
    	   destination.deposer(montant);
       }
       
       
       //Cntructors:
       public Compte() {}
       public Compte(int solde,String nomTitulaire) {
    	   if(solde >0)
    	   {
    		   this.solde = solde;
        	   this.nomTitulaire = nomTitulaire;
    	   }
    	   else
    		   System.out.print("Solde Ngatif entrer un solde positif");
       }
       
      public String getNomTitulaire()
      {
    	  return nomTitulaire;
      }
      
      public void setNomTitulaire(string nomTitulaire)
      {
    	   this.nomTitulaire= nomTitulaire;
      }
       
      public int  getSolde()
      { 
    	  return solde;
      }
      
      public void setSolde(int solde)
      {
    	   this.solde= solde;
      }
    
      @Override
      public String toString()
      {
   	   return "-Solde :" + this.getSolde() + "-Nom de titulaire : " + this.getNomTitulaire();
      }
      
}
