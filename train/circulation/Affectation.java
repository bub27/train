package train.circulation;

import train.topologie.Itineraire;
import train.topologie.TypeGare;
import train.Train;

public class Affectation {
    private Itineraire itineraire;
    private Train train;

    public Affectation(Itineraire monItineraire, Train monTrain) {
	TypeGare typeItineraire = monItineraire.getType();
    }
}
