package Classes;

public class AppartementLocatif extends Hebergement {
    private int fraisMenageFixes;

    public AppartementLocatif(String Ref, double Tarif, double Prix) {
        super(Ref, Tarif);
        int fraisMenageFixes = (int) Prix;
    };

    @Override
	public int calculerPrixSejour(int nbNuits) {
		int LAREPONSE = this.tarifJournalier * nbNuits + this.fraisMenageFixes;
        return LAREPONSE;
	};
}
