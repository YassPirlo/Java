package TD2;

public class Main {
    public static void main(String[] args) {
        Banque b1=new Banque(1000,0.01);
        // creer deuxieme banque
        Banque b2=new Banque(2000,0.02);
        // Creer un client ()
        Client C1=new Client("Vitullo","Yassine","Bruxelles", b1,b2);
        System.out.println("Données avant le bouclement des comptes");
        System.out.println(C1);
        System.out.println("Données  après le bouclement des comptes");
        C1.getCompteEP().appliquerInterets();
        C1.getComptePv().appliquerInterets();
        System.out.println(C1);




    }
}