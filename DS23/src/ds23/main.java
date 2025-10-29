package ds23;

public class main {
    public static void main(String[] args) {
        System.out.println("**************** Pépinière GREEN HANDS ****************");
        Pépinière pépinière = new Pépinière();

        Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
        Arbre chêne = new Arbre("Chêne", 200, 60, 49.99, "Caduque");
        Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Persistant");

        rose.setNom("Rose");

        System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());

        pépinière.ajoutPlante(rose);
        pépinière.ajoutPlante(tulipe);
        pépinière.ajoutPlante(chêne);
        pépinière.ajoutPlante(sapin);

        pépinière.afficherInventaire();

        System.out.println("Total Absorption CO2 : " + pépinière.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres caduques dans la pépinière : " + pépinière.compterArbresCaduques());
    }

}
