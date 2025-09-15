package Ex_get_set;

public class MainBis {
    public static void main(String[] args) {
        Voiture voiture1=new Voiture();
        System.out.println(voiture1);
        voiture1.conduire(50);
        System.out.println(voiture1);
        voiture1.setEssence(50);
        System.out.println(voiture1);
        voiture1.conduire(50);
        System.out.println(voiture1);
        while (!voiture1.conduire(20)){
            System.out.println(voiture1);
        }
    }
}
