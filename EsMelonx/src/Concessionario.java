import java.util.*;

public class Concessionario {
    private List<Auto> autoveicoli;

    public Concessionario() {
        autoveicoli = new ArrayList<>();
    }

    public void aggiungiAuto(Auto auto) {
        autoveicoli.add(auto);
    }

    public void rimuoviAuto(int id) {
        autoveicoli.removeIf(auto -> auto.getId() == id);
    }

    public Auto leggiAuto(int id) {
        for (Auto auto : autoveicoli) {
            if (auto.getId() == id) return auto;
        }
        return null;
    }

    public void aggiornaAuto(int id, Auto nuovaAuto) {
        for (int i = 0; i < autoveicoli.size(); i++) {
            if (autoveicoli.get(i).getId() == id) {
                autoveicoli.set(i, nuovaAuto);
                return;
            }
        }
    }

    public List<Auto> ricerca(String marca) {
        List<Auto> trovate = new ArrayList<>();
        for (Auto auto : autoveicoli) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                trovate.add(auto);
            }
        }
        return trovate;
    }

    public void visualizzaDaAnno(int anno) {
        for (Auto auto : autoveicoli) {
            if (auto.getAnnoImmatricolazione() >= anno) {
                auto.mostraDettagli();
                System.out.println();
            }
        }
    }

    public void mostraTuttiConValoreAttuale() {
        for (Auto auto : autoveicoli) {
            auto.mostraDettagli();
            System.out.printf("- Valore attuale (2025): %.2f€\n", auto.calcolaValoreAttuale());
            System.out.println();
        }
    }
}