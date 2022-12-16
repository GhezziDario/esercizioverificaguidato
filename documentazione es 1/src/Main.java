import java.util.Scanner;

/** si
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nStudenti = in.nextInt();

        studente studenti[] = new studente[nStudenti];

        for (int i = 0 ; i < nStudenti ; i++){
            System.out.println("isnerisci nome studente");
            studenti[i].setNome(in.next());
            System.out.println("inserisci cognome studente");
            studenti[i].setCognome(in.next());



        }



    }
}