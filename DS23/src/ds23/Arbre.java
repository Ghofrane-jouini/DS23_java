package ds23;

public class Arbre extends Plante{
    private String type_Feuillage;
    static double AbsorMoyenne=22;
    public Arbre(String nom, double hauteur, int age, double prix,String type_Feuillage){
        super(nom,hauteur,age,prix);
        this.type_Feuillage=type_Feuillage;
    }
    public void setType_Feuillage(String type_Feuillage) {
        this.type_Feuillage = type_Feuillage;
    }
    public String getType_Feuillage() {
        return type_Feuillage;
    }
    public String toString() {
        return ("Nom: "+this.nom+" :Hauteur: "+this.hauteur+" cm :Age: "+this.age+" :Prix: "+this.prix+ " dinars :Type_Feuillage: "+this.type_Feuillage);
    }
    public void description(){
        System.out.println(toString());
    }
    public double absorptionCO2(){
        double absorptionCO2 = AbsorMoyenne;
        if (hauteur>5000){
            absorptionCO2=absorptionCO2+3;
        }
        return absorptionCO2;
    }
}

