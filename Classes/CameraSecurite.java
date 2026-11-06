package Classes;

public class CameraSecurite extends AppareilConnecte {
    public CameraSecurite(String nom) {
        super(nom); 
    }

    public void diagnostiquer(){
        System.out.println("La caméra de "+ piece +" filme en haute définition.");
    };
}
