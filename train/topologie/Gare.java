package train.topologie;

public class Gare {
    private String ville;
    private TypeGare type;
    public Gare(String nom, TypeGare monType) {
	ville = nom;
	type = monType;
    }

    @Override
    public String toString() {
	return "Gare " + ville + "["+type+"]";
    }

    public TypeGare getType() {
	return type;
    }

    public String getNom() {
	return ville;
    }
}
