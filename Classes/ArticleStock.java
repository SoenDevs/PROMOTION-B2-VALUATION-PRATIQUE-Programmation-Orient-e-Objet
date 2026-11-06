package Classes;

public class ArticleStock {
    private String nom;
    private int quantite;

    public ArticleStock(String nom){
        this.nom = nom;
        this.quantite = 0;
    };

    public   ArticleStock(String nom, int quantite){
        this.nom = nom;
        this.quantite = quantite;
    };

    public String getNom(){
        return this.nom;
    };

    public int getQuantite(){
        return this.quantite;
    };

    public void approvisionner(int nb){
        if ( nb>0 ){
            this.quantite += nb;
        }else {
            System.out.println("la quantitée, ne peut être négative.");
        }
    };

    public void expedier(int nb){
        if (nb <= this.quantite){
            this.quantite -= nb;
            System.out.println("Expédition de "+nb+" unités validée.");
        }else {
            System.out.println("Erreur : stock insuffisant pour expédier "+ nb +" unités.");
        }
    };
}
