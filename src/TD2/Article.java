package TD2;

public class Article {
    private String nom;
    private Double prix;
    private boolean isSolde;

    public Article(String nom, Double prix, boolean isSolde) {
        this.nom = nom;
        this.prix = prix;
        this.isSolde = isSolde;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public boolean isSolde() {
        return isSolde;
    }
    public void setSolde(boolean solde) {
        this.isSolde = solde;
    }

}

