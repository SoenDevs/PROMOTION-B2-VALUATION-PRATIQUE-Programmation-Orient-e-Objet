package Classes;

/**
 * Petit texte vite fait :
 * la batterie est l'enfant de la class Smartphone, de ce fait, sans Smartphone, 
 * elle ne peut exister. Sans un parent, on ne peut pas naitre.
 */
public class Smartphone {
    String modele;
    BatterieInterne batterie;

    public Smartphone(String model, int capacite){
        this.modele = model;
        batterie = new BatterieInterne(capacite);
    }

    public void obtenirFicheTechnique(){
        System.out.println("Smartphone "+modele+" équipé d'une batterie scellée de "+batterie.getCapaciteMah()+" mAh.");
    }
}
