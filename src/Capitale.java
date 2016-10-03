
public class Capitale extends Pays {
	//WALLAHWAKBAR apoijfdolakfpo*gksmlm
	//ONTEST
	//COUCOUBENJAMIN
	//ATTRIBUTS
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	
	public Capitale(){
		
	}
	//ACCESSEURS
	//NOM 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	
	
	//NOMBRE HABITANTS
	public int getNbHabitants(){
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants){
		this.nbHabitants = nbHabitants;
	}
	
	
	//SUPERFICIE 
	public int getSuperficie(){
		return superficie;
	}
	public void setSuperficie(int superficie){
		this.superficie = superficie;
	}
	
	
	
	//TO STRING
	public String toString(){
		String chaine = " ";
		chaine += "Nom : " + this.nom + "\n" + "Nombre d'habitants :  " + this.nbHabitants  + "\n" + "Superficie : " + this.superficie + "km²";
		return chaine;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
                                   