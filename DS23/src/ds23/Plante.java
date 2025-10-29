package ds23;

public class Plante {
	 protected String nom;
	    protected double hauteur;
	    protected int age;
	    protected double prix;
	    public Plante(String nom, double hauteur, int age, double prix) {
	        this.nom = nom;
	        this.hauteur = hauteur;
	        this.age = age;
	        this.prix = prix;
	    }
	    public String getNom() {
	        return nom;
	    }
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    public String toString() {
	        return ("Nom: "+this.nom+" :Hauteur: "+this.hauteur+" cm :Age: "+this.age+" :Prix: "+this.prix+" dinars");
	    }
	    public void description(){
	        System.out.println(toString());
	    }

}
