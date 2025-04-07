public class AutoCarro extends Auto {
    private double tara;

    public AutoCarro(int id, String marca, String modello, double prezzo, int annoImmatricolazione,
                     double tara) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.tara = tara;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("Auto Carro:");
        System.out.println("- ID: " + id);
        System.out.println("- Marca: " + marca);
        System.out.println("- Modello: " + modello);
        System.out.println("- Prezzo: " + prezzo + "€");
        System.out.println("- Anno: " + annoImmatricolazione);
        System.out.println("- Tara: " + tara + " quintali");
    }
}