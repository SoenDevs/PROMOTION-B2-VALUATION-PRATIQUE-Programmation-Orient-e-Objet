package Classes;

public abstract class Hebergement {
    protected String reference;
    protected int tarifJournalier;

    public Hebergement(String Ref, double Tarif){
        this.reference = Ref;
        this.tarifJournalier = (int) Tarif;
    };
    public abstract int calculerPrixSejour( int nbNuits);

    public void decrire(){
        System.out.println("Hébergement "+reference+" Tarif de base : "+tarifJournalier+" €/nuit");
    }
}
