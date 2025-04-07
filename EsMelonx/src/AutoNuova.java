public class AutoNuova extends Auto {
    private String alimentazione;
    private int cavalli;

    public AutoNuova(int id, String marca, String modello, double prezzo, int annoImmatricolazione,
                     String alimentazione, int cavalli) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.alimentazione = alimentazione;
        this.cavalli = cavalli;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("Auto Nuova:");
        System.out.println("- ID: " + id);
        System.out.println("- Marca: " + marca);
        System.out.println("- Modello: " + modello);
        System.out.println("- Prezzo: " + prezzo + "€");
        System.out.println("- Anno: " + annoImmatricolazione);
        System.out.println("- Alimentazione: " + alimentazione);
        System.out.println("- Cavalli: " + cavalli);
    }
}