package Ex_get_set;

public class Voiture {
    private String marque;
    private String modele;
    private int km;
    private double essence;

    public Voiture(String marque, String modele, int km, double essence) {
        this.marque = marque;
        this.modele = modele;
        this.km = km;
        this.essence = essence;
    }

    public Voiture() {
        this("aucun", "aucun", 0, 0.0);
    }

    public int getKm() {
        return km;

    }

    public void setKm(int km) {
        if (km >= 0) {
            this.km = km;
            System.out.println("la voiture a " + this.km + "km");
        } else {
            System.out.println("Erreur, km nég impossible");

        }
    }

    public double getEssence() {
        return essence;
    }

    public void setEssence(double essence) {
        if (essence >= 0 && essence <= 60) {
            this.essence = essence;
            System.out.println("La voiture possède" + this.essence + " " + "litres");
        } else {
            System.out.println("Pas possible, l'essence doit être entre 0 et 60");
        }
    }

    public boolean conduire(int kilometresparcourus) {
        boolean result = false;
        int nbConsommer = kilometresparcourus / 10;
        if ((essence - nbConsommer) <= 0) {
            System.out.println("Voyage interrompu");
            result = true;
        } else {
            essence = essence - nbConsommer;
            km += kilometresparcourus;
        }
        return result;
    }

    public String toString() {
        return ("le véhicule a parcouru " + km + "km" + " et contient " + essence + " l");
    }

}

