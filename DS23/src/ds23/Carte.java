package ds23;

public class Carte {

    protected int cout;
    public Carte(int cout) {
    	this.cout = cout;
        System.out.println("Création d'une nouvelle carte.");
    }
    @Override
    public String toString() {

        return "Carte avec coût : " + cout;

    }

}
