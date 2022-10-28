import java.sql.Timestamp;

public class macchina {
    private String targa;
    Timestamp ingeresso, uscita;

    public macchina(String targa, long ingresso) {
        this.targa = targa;

        this.ingeresso = new Timestamp(ingresso);
        System.out.println("ingresso veicolo " + targa + "al timestamp" + this.ingresso.getTime());

        
    }

    public void setUscita(Timestamp uscita) {
        this.uscita = uscita;
    }

    public String getTarga(String next) {
        return targa;
    }

    public Timestamp getIngeresso() {
        return ingeresso;
    }

    public Timestamp getUscita() {
        return uscita;
    }
}
