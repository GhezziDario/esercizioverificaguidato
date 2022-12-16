import java.util.Scanner;

public class studente {
    Scanner in = new Scanner(System.in);
    private String nome, cognome;
    private voti vot[] = new voti[5];

    public studente(String nome, String cognome, voti[] vot) {
        this.nome = nome;
        this.cognome = cognome;
        this.vot = vot;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void insVoto(voti[] vot) {
        for (int i = 0; i < vot.length; i++) {
            System.out.println("inserisci materia");
            vot[i].setMateria(in.next());
            System.out.println("inserisci voto");
            vot[i].setVoto(in.nextInt());
            System.out.println("inserisci data");
            vot[i].setData(in.next());
        }
    }
}
