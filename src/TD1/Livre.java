package TD1;

public class Livre {
    public String auteur;
    public String titre;
public Livre(String auteur, String titre) {
    this.auteur = auteur;
    this.titre = titre;

}
public String livreInfo(){
    return "Auteur :" + auteur +" "+ "Titre :"+ titre;

}

}
