import java.util.ArrayList;



public class Pays {

		//ATTRIBUTS
		private String nom;
		private String langue;
		private String monnaie;
		private String capitale;
		private static int compteurPays = 0;
		private Capitale saCapitale;
		private ArrayList <Ville> lesVilles;
		
		
		
		
		
		//CONSTRUCTEURS
		public Pays(){
			compteurPays = compteurPays + 1;
			this.lesVilles = new ArrayList<Ville>();
		}
		
		
		
		public Pays(String nom, String langue){
			this.nom = nom;
			this.langue = langue;
		}
		
		
		//ACCESSEURS
		//CAPITALE
		public Capitale getSaCapitale(){
			return saCapitale;
		}
		public void  setSaCapitale(Capitale saCapitale){
			this.saCapitale = saCapitale;
			
		}
		
		
		//NOM
		public String getNom() {
			return nom.toUpperCase();
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		

		//LANGUE
		public String getLangue(){
			return langue.toUpperCase();
		}
		public void setLangue(String langue){
			this.langue = langue;
		}
		
		
		//MONNAIE
		public String getMonnaie(){
			return monnaie.toUpperCase();
		}
		public void setMonnaie(String monnaie){
			this.monnaie = monnaie;
		}
		
		
		//CAPITALE
		public String getCapitale(){
			return capitale.toUpperCase();
		}
		public void setCapitale(String capitale){
			this.capitale = capitale;
		}
		
		
		
		
		
		//COMPTEUR PAYS
		public static int getCompteurPays(){
			return compteurPays;
		}
		
		//AJOUTER UNE VILLE
		public void ajouterUneVille(Ville uneVille){
			this.lesVilles.add(uneVille);
		}
		
		//SUPPRIMER UNE VILLE
		public void supprimerUneVille(Ville uneVille){
			this.lesVilles.remove(uneVille);
		}
		
		//RECHERCHER UNE VILLE
		public String rechercherUneVille(Ville uneVille){
			String chaine = "";
			
			
			
			
			
			
			return chaine;
		}
		//TO STRING
		public String toString(){
			String chaine = " ";
			chaine += "Nom: " + majNom() + "\n" + "Langue: " + majLangue()  + "\n" + "Monnaie: " + majMonnaie() + "\n";
			chaine += "Capitale:" + majCapitale() + "\n"; 
			chaine += "Nombre d'habitants: " + saCapitale.getNbHabitants() + "\n";
			chaine += "Superficie:" + saCapitale.getSuperficie() + "km²" + "\n";
			return chaine;
		}
		
		
		
		//STRING majNom
		private String majNom(){
			String chaine = this.nom.toLowerCase();
			String maj = chaine.replaceFirst(".",(chaine.charAt(0)+"").toUpperCase());
			return maj;
		}
		
		
		//STRING majLangue
		private String majLangue(){
			String chaine = this.langue.toLowerCase();
			String maj = chaine.replaceFirst(".",(chaine.charAt(0)+"").toUpperCase());
			return maj;
		}
		
		
		//STRING majMonnaie
		private String majMonnaie(){
			String chaine = this.monnaie.toLowerCase();
			String maj = chaine.replaceFirst(".",(chaine.charAt(0)+"").toUpperCase());
			return maj;
		}
		
		
		//STRING majCapitale
		private String majCapitale(){
			String chaine = this.saCapitale.getNom().toLowerCase();
			String maj = chaine.replaceFirst(".",(chaine.charAt(0)+"").toUpperCase());
			return maj;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
