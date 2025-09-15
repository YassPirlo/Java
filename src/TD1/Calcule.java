package TD1;

import java.sql.SQLOutput;

public class Calcule {
    private double largeur;
    private double longueur;

    public Calcule(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double calculerSurface(){
        return largeur*largeur;

    }
    public double calculerPerimetre(){
        return (2*(largeur+longueur));
    }
    public double rslt =calculerPerimetre();

    public double getRslt() {
        return rslt;

    }

    @Override
    public String toString() {
        return "le périmètre est de:"+calculerSurface();

    }
}
