package Classes;

public class ChambreHotel extends Hebergement {
    private int supplementPetitDejeuner;

    public ChambreHotel(String Ref, double Tarif, double Prix) {
        super(Ref, Tarif);
        int supplementPetitDejeuner = (int) Prix;
    };

    @Override
	public int calculerPrixSejour(int nbNuits) {
		int LAREPONSE = (this.tarifJournalier + this.supplementPetitDejeuner) * nbNuits;
        return LAREPONSE;
	};
}
