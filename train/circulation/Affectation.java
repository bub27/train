package train.circulation;

import train.topologie.Itineraire;
import train.topologie.TypeGare;
import train.Train;
import train.vehicule.Wagon;
import train.vehicule.Voiture;

public class Affectation {
    private Itineraire itineraire;
    private Train train;

    public Affectation(Itineraire monItineraire, Train monTrain) {
	TypeGare typeItineraire = monItineraire.getType();
	Class typeTrain = monTrain.getType();
	if (compatible(typeItineraire, typeTrain)) {
	    itineraire = monItineraire;
	    train = monTrain;
	}
	else {
	    throw new RuntimeException("Incohérence train/trajet");
	}
    }

    private boolean compatible(TypeGare typeItineraire, Class typeTrain) {
	boolean marchandiseCorrect = typeItineraire == TypeGare.MARCHANDISE && typeTrain == Wagon.class;
	boolean voyageurCorrect = typeItineraire == TypeGare.VOYAGEUR && typeTrain == Voiture.class;
	return marchandiseCorrect || voyageurCorrect;
    }
}
