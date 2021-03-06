package train;

import train.vehicule.Vehicule;
import train.vehicule.Motrice;

import java.util.LinkedList;

public class Train
{
	private static String prochaineImmatriculation = "AAA";
	private String immatriculation;
        private Class typeTrain = null;

	private LinkedList<Vehicule> lkVehicule;


	public Train()
	{
		immatriculation = prochaineImmatriculation;
		incrementerImmatriculation ();

		lkVehicule = new LinkedList<Vehicule>();
	}

	public double calculerPoidsEnChargeMaxi()
	{
		double charge=0;

		for ( Vehicule v : lkVehicule )
			charge += v.getPoidsEnChargeMaxi();



		return charge;
	}

	public double calculerPoidsTotalAVide()
	{
		double poids=0;

		for ( Vehicule v : lkVehicule ) {
			poids += v.getPoidsAVide();
		}
		return ((int)(poids*100))/100;
	}

    public int calculerNbRoues() {
	    int nbRoues = 0;
	    for (Vehicule v: lkVehicule) {
		nbRoues += v.getNbRoues();
	    }
	    return nbRoues;
	}

	public void ajouterVehicule(Vehicule v) throws RuntimeException
	{
	    if (lkVehicule.size() == 0 && ! (v instanceof Motrice)) {
		throw new RuntimeException("Le premier véhicule doit etre une motrice");
	    }
	    if (lkVehicule.size() >  0 &&   (v instanceof Motrice)) {
		throw new RuntimeException("Une seule motrice par train !");
	    }

	    if (estCorrect(v)) {
		lkVehicule.add(v);
	    }
	    else {
		throw new RuntimeException("train pas homogène");
	    }

	}

    public boolean estCorrect(Vehicule v) {
	Class type = v.getClass();
	if (type == Motrice.class) {
	    return true;
	}
	if (typeTrain == null) {
	    typeTrain = type;
	    return true;
	}
	return (type == typeTrain);
    }

    public Class getType() {
	return typeTrain;
    }

	public String toString()
	{
		String s="Train " + immatriculation 
		    + " poids total en charge Maxi " + calculerPoidsEnChargeMaxi() + " t," 
		    + " poids total à vide " + calculerPoidsTotalAVide() + " t, "
		    + " avec " + calculerNbRoues() + " roues\n";

		for ( Vehicule v : lkVehicule )  s+= "   " + v + "\n";

		return s;

	}


	private static void incrementerImmatriculation()
	{
		int cpt;
		char car;
		String nvImmat ="";
		boolean bContinue = true;

		cpt = 1;

		while ( bContinue )
		{
			car = prochaineImmatriculation.charAt( prochaineImmatriculation.length() - cpt );
			if ( car == 'Z' )
			{
				car = 'A';
				cpt++;
			}
			else
			{
				car++;
				bContinue = false;
			}

			nvImmat = car + nvImmat ;

		}

		for (int i=0;i< prochaineImmatriculation.length() - cpt;i++)
		{
			nvImmat = prochaineImmatriculation.charAt(i) + nvImmat;
		}

		prochaineImmatriculation = nvImmat;

	}

}
