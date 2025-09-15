package TD1;

import java.sql.SQLOutput;

public class Main {
        public static void main(String[] args) {
            Voiture v1 = new Voiture("Peaugot", "208", 2020);
            v1.afficheinfo();

            System.out.println(" ");

            Voiture v2 = new Voiture("Mercedes", "classe_a", 2020);
            v2.afficheinfo();
            Calcule C = new Calcule(10.5, 20);
            double rslt = C.calculerSurface();
            System.out.println(rslt);
            System.out.println("Aire= L*l="+ rslt);
            System.out.println(C);


            Livre l1 = new Livre("Victor_Hugo","Les_Misérables");
            System.out.println(l1.livreInfo());
            Livre l2 = new Livre("Baudelaire","inconnu");
            System.out.println(l2.livreInfo());

            CompteBancaire cb1 = new CompteBancaire(0,"Yassine");
            System.out.println(cb1.getPropietaire());
            System.out.println(cb1.getSolde());
            System.out.println(cb1.deposer(50));
            System.out.println(cb1.retirer(70));
            System.out.println(cb1.deposer(200));
            System.out.println(cb1.getSolde());

            if(cb1.deposer(50)) {
                System.out.printf("argent deposer");
            }else {
                System.out.printf("argent non deposer");
            };
            System.out.println(cb1.getSolde());

            //start: lancer le programme bancaire
            //afficher le menu

        }}



















