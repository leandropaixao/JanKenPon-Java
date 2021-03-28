public class Francais implements  ILangue{
    @Override
    public String menu() {
        String str = "==== Bienvenue dans le jeu JanKenPon ====\n"
        .concat("S'il vous plaît, choisir une option:\n")
        .concat("1 - Pierre (JAN)\n")
        .concat("2 - Papier (KEN)\n")
        .concat("3 - Ciseaux (PON)\n")
        .concat("4 - Sortir\n")
        .concat("5 - Changer la langue (FR-CA -> PT-BR)\n")
        .concat("Votre option: ");

        return str;
    }

    @Override
    public String optionIncorrect() {
        return "Option incorrect";
    }

    @Override
    public String victoire() {
        return "Félicitations! Vous avez gangé.";
    }

    @Override
    public String defaite() {
        return "Ohhhh! Malheureusement, vous n'avez pas gagné.";
    }

    @Override
    public String cravate() {
        return "Ohhhh! Une cravate!";
    }

    @Override
    public String joueur() {
        return "Option de joueur ";
    }

    @Override
    public String machine() {
        return "Option Machine ";
    }

    @Override
    public String sortir() {
        return "À bientôt!";
    }

    @Override
    public String erreur(){
        return "Erreur d'application, elle sera fermée.";
    }
}
