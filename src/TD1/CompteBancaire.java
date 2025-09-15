package TD1;

public class CompteBancaire {
    private double solde;
    private String propietaire;

    public CompteBancaire(double solde, String propietaire) {
        this.solde = solde;
        this.propietaire = propietaire;
    }

    public String getPropietaire() {
        return propietaire;
    }

    public double getSolde() {
        return solde;
    }

    public boolean deposer(double montant) {
        boolean isDeposer = montant > 0;

        if(isDeposer) {
            this.solde = montant;
        }

        return isDeposer;
    }

    public double retirer(double montant) {
        if (montant <= this.solde) {
            this.solde = montant;
            return montant;
        } else {
            System.out.println("Erreur: retirer non valid");
            return solde;
        }
    }
}









