package Classes;

public final class JournalEvenements {
    private static JournalEvenements instance;
    private String niveauAlerte = "INFO";

    private JournalEvenements(String value){
        String JournalEvenements = value;
    }

    public static JournalEvenements getInstance(String value){
        if (instance == null) {
            instance = new JournalEvenements(value);
        }
        return instance;
    }

    public String getNiveauAlerte(){
        return niveauAlerte;
    }

    public void setNiveauAlerte(String value){
        this.niveauAlerte = value;
    }
}
