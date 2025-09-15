package TD1;

public class Voiture {
    public String marque;
    public String modele;
    public int annee;
public Voiture(String marque, String modele, int annee) {
    this.marque=marque;
    this.modele=modele;
    this.annee=annee;
}
    public void afficheinfo(){
        System.out.println("Voiture de marque "+marque);
        System.out.println("Voiture de modele "+modele);
        System.out.println("Voiture annee "+annee);





    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

}
