package train.topologie;

public class Gare {
    public enum TYPE_GARE {
	MARCHANDISE,
	VOYAGEUR};

    private String ville;
    private TYPE_GARE type;
    public Gare(String nom, TYPE_GARE monType) {
	ville = nom;
	type = monType;
    }

    @Override
    public String toString() {
	return "Gare " + ville + "["+type+"]";
    }

    public TYPE_GARE getType() {
	return type;
    }
}
