
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CLASSE PAYS
		Pays monPays = new Pays();
		Capitale maCapitale = new Capitale();
		
		//PAYS FRANCE
		maCapitale.setNom("paris");
		maCapitale.setNbHabitants(30000000);
		maCapitale.setSuperficie(10000);
		monPays.setNom("france");
		monPays.setLangue("français");
		monPays.setMonnaie("euro");
		monPays.setSaCapitale(maCapitale);

		System.out.println(monPays.toString());
		
		/*PAYS CANADA
		Pays monPays2 = new Pays();
		monPays2.setNom("canada");
		monPays2.setLangue("franco-anglais");
		monPays2.setMonnaie("dollar");
		monPays2.setCapitale("ottawa");
		System.out.println(monPays2.toString());*/
		
		System.out.println(Pays.getCompteurPays());
		
		
		
	}

}
