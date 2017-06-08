package train.topologie;

public class Itineraire {
    private Gare gareDepart;
    private Gare gareArrivee;

    public Itineraire(Gare gare1, Gare gare2) throws RuntimeException {
	TypeGare type1 = gare1.getType();
	TypeGare type2 = gare2.getType();
	if (type1 != type2) {
	    throw new RuntimeException("Les gares ne sont pas du meme type");
	}
	gareDepart = gare1;
	gareArrivee = gare2;
    }

    public TypeGare getType() {
	return gareDepart.getType();
    }

    @Override
    public String toString() {
	return "Trajet [" + gareDepart.getType() + "] entre "
	    + gareDepart.getNom() + " et " + gareArrivee.getNom();
    }
}
