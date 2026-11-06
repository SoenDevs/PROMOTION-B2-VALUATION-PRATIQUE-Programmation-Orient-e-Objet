import Classes.*;

public class Main {

    public static void main(String[] args) {

        // Exercice 1 !

        ArticleStock article = new ArticleStock("Clavier Mécanique");
        article.approvisionner(15);
        System.out.println(article.getQuantite());
        article.expedier(6);
        System.out.println(article.getQuantite());
        article.expedier(12);
        System.out.println(article.getQuantite());


        // Exercice 2 : 

        AppareilConnecte appc = new AppareilConnecte("Couloir");
        Thermostat term = new Thermostat("Salon");
        CameraSecurite cam = new CameraSecurite("Entrée");

        appc.diagnostiquer();
        term.diagnostiquer();
        term.activerModeEco();
        cam.diagnostiquer();

        // Exercice 3

        ChambreHotel chh = new ChambreHotel("CH-101", 85.0, 12.5);
        chh.decrire();
        // System.out.println(chh.calculerPrixSejour(2));
        AppartementLocatif appl = new AppartementLocatif("APT-4B", 110.0, 50);
        appl.decrire();
        // System.out.println(appl.calculerPrixSejour(2));

        // Exercice 4
        Smartphone sm = new Smartphone("Pixel pro", 5000);
        sm.obtenirFicheTechnique();

        // Exercice 5
        JournalEvenements journal1 = JournalEvenements.getInstance("journal1");
        journal1.setNiveauAlerte("CRITIQUE");
        JournalEvenements journal2 = JournalEvenements.getInstance("journal1");
        System.out.println(journal2.getNiveauAlerte());
        System.out.println(journal1 == journal2);
    }
};
