enum TipoContratto{abitazione, cellulare, aziendale};

public class Contatto {

    public String nome;
    public String cognome;
    public String telefono;
    public TipoContratto tipo;


    public String Stampa(){
        return String.format("Nome: %s Cognome: %s Telefono: %s Tipo: %s", nome, cognome, telefono, tipo.toString());
    }
}
