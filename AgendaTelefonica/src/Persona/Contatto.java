package Persona;


public class Contatto {
    public enum tipo{abitazione,cellulare,aziendale};
    public String nome, cognome, telefono;
    public tipo utilizzo;

    public String anagrafica(){

        //utilizzando il metodo to string si tarsformano tutti i tipi di dati in stringa
        return String.format("Nome"+ nome+"congome"+cognome+"Telefono"+telefono+"utilizzo"+utilizzo.toString());
    }
}
