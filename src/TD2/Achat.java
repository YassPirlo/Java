package TD2;

public class Achat {
    private Article article;
    private int qty;

    public Achat(Article article, int Qty) {
        this.article = article;
        this.qty = Qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        qty = qty;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
