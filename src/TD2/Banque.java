package TD2;

public class Banque {
    private double taux;
    private double solde;



    public Banque(double solde, double taux) {
        this.taux = taux;
        this.solde = solde;
    }
    public double getTaux() {
        return taux;
    }
    public double  getSolde() {
        return solde;
    }
    public void appliquerInterets(){
        solde = solde + solde * taux;
    }

    public String toString(){
        return (solde  + " franc");
    }
}
