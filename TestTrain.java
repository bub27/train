import train.Train;

import train.vehicule.Vehicule;
import train.vehicule.Motrice;
import train.vehicule.Voiture;
import train.vehicule.Wagon;
import train.topologie.TypeGare;
import train.topologie.Gare;
import train.topologie.Itineraire;

public class TestTrain
{

	public static void main(String[] arg) throws Exception
	{
		Train t1 = new Train();

		t1.ajouterVehicule ( new Motrice (  110, 12,   5) );
		t1.ajouterVehicule ( new Voiture ( 40.3,  8,  65) );
		t1.ajouterVehicule ( new Voiture ( 40.3,  8,  80) );
		try {
		    // ajout impossible
		    t1.ajouterVehicule ( new Wagon   ( 25.5,  8, 250) );
		    throw new Exception("On ne devrait pas arriver là");
		}
		catch(RuntimeException re) {
		    System.err.println("ajout 0 impossible : normal");
		}
		try {
		    // ajout impossible
		    t1.ajouterVehicule ( new Motrice (  110, 12,   5) );
		    throw new Exception("On ne devrait pas arriver là");
		}
		catch(RuntimeException re) {
		    System.err.println("ajout 1 impossible : normal");
		}


		System.out.println ( t1 );

		Train t2 = new Train();
		try {
		    // ajout impossible
		    t2.ajouterVehicule ( new Voiture ( 40.3,  8,  65) );
		    throw new Exception("On ne devrait pas arriver là");
		}
		catch(RuntimeException re) {
		    System.err.println("ajout 2 impossible : normal");
		}
		try {
		    // ajout impossible
		    t2.ajouterVehicule ( new Wagon   ( 25.5,  8, 250) );
		    throw new Exception("On ne devrait pas arriver là");
		}
		catch(RuntimeException re) {
		    System.err.println("ajout 3 impossible : normal");
		}

		System.out.println ( t2 );

		Gare g1 = new Gare("Le Havre", TypeGare.VOYAGEUR);
		Gare g2 = new Gare("Rouen", TypeGare.VOYAGEUR);
		Gare g3 = new Gare("Depot du Havre", TypeGare.MARCHANDISE);
		
		Itineraire i1 = new Itineraire(g1, g2);
		System.out.println(i1);

		try {
		    Itineraire i2 = new Itineraire(g1, g3);
		    throw new Exception("Problème à la création d'un itinéraire");
		}
		catch(RuntimeException re) {
		    System.err.println("Itineraire logiquement illégal");
		}
	}
}
