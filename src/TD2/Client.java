package TD2;

public class Client {
    private String nom;
    private String prenom;
    private String ville;
    private Banque ComptePv;
    private Banque CompteEP;

    public Client(String nom, String prenom, String ville, Banque ComptePv, Banque CompteEP) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.ComptePv = ComptePv;
        this.CompteEP = CompteEP;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Banque getCompteEP() {
        return CompteEP;
    }
    public Banque getComptePv() {
        return ComptePv;
    }



    @Override
    public String toString() {
        return ("Client"+" " + prenom +" de "+ ville + "\n" +" "+ "ComptePrivé " + ComptePv + "\n " + "CompteEpargne " +CompteEP );
    }

}


