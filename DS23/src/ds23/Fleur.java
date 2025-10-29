package ds23;

public class Fleur extends Plante{
    private String couleur;
    private int moisF;
    public Fleur(String nom,double hauteur,int age, double prix,String couleur, int moisF){
        super(nom,hauteur,age,prix);
        this.couleur=couleur;
        this.moisF=moisF;
    }
    public String toString() {
        return ("Nom: "+this.nom+" :Hauteur: "+this.hauteur+" cm :Age: "+this.age+" :Prix: "+this.prix+ " dinars :Couleur: "+this.couleur);
    }
    public void description(){
        System.out.println(toString());
    }
    public void fleurir(){
        if (moisF==4 || moisF==5 || moisF==6){
            System.out.println("la fleur est en fleurs.");
        }
        else{
            System.out.println("la fleur n'est pas en fleurs.");
        }
    }
    public String getCouleur() {
        return couleur;
    }
}
