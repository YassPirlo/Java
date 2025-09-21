package TD2;
import java.util.ArrayList;

public class Caddie {
    private ArrayList<Achat> listeAchat;
    public Caddie() {
        listeAchat = new ArrayList<>();
    }
    public ArrayList<Achat> getListeAchat() {
        return listeAchat;
    }
}