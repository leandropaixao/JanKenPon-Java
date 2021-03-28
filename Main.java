import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sci = new Scanner(System.in);
        Random rand = new Random();

        JanKenPon option = null;
        int resultat = 0;

        ILangue langue = new Francais();

        try {
            do {
                ecrire(langue.menu());

                option = JanKenPon.getValor(sci.nextInt());

                if (option == null) {
                    ecrire(langue.optionIncorrect());
                    ecrire("");
                } else if (option == JanKenPon.LANGUE) {
                    if (langue.getClass() == Francais.class){
                        langue = new Portugues();
                    } else {
                        langue = new Francais();
                    }
                } else if (option.getValor() < 4) {

                    int choixRand = rand.nextInt(3);
                    choixRand += 1;

                    var optionMachine = JanKenPon.getValor(choixRand);

                    resultat = option.getValor() + optionMachine.getValor();

                    if ((option == JanKenPon.JAN && resultat == 4) ||
                        (option == JanKenPon.KEN && resultat == 3) ||
                        (option == JanKenPon.PON && resultat == 5)) {
                        ecrire(langue.victoire());
                    } else if ((option.getValor() - optionMachine.getValor()) == 0) {
                        ecrire(langue.cravate());
                    } else {
                        ecrire(langue.defaite());
                    }

                    ecrire(langue.joueur() + option);
                    ecrire(langue.machine() + optionMachine);
                    ecrire("");
                }

            } while (option != JanKenPon.SORTIR);

            ecrire(langue.sortir());

        }catch (Exception e) {
            ecrire(langue.erreur());
            e.printStackTrace();
        } finally {
            sci.close();
        }
    }

    static void ecrire(Object obj){
        System.out.println(obj);
    }
}