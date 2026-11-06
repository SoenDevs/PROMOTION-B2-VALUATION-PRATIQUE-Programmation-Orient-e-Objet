package Classes;

public class AppareilConnecte {
    String piece;

    public AppareilConnecte(String nom){
        this.piece = nom;
    }

    public void diagnostiquer(){
        System.out.println("L'appareil situé dans "+ piece +" fonctionne normalement.");
    }
}
