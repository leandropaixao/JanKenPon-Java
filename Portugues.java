public class Portugues implements ILangue{
    @Override
    public String menu() {
        String str = "==== Bem-vindo ao jogo JanKenPon ====\n"
        .concat("Por favor, escolha uma opção:\n")
        .concat("1 - Pedra (JAN)\n")
        .concat("2 - Papel (KEN)\n")
        .concat("3 - Tesoura (PON)\n")
        .concat("4 - Sair\n")
        .concat("5 - Mudar o idioma (PT-BR -> FR-CA)\n")
        .concat("Sua opção: ");

        return str;
    }

    @Override
    public String optionIncorrect() {
        return "Opção incorreta";
    }

    @Override
    public String victoire() {
        return "Parabéns! Você ganhou.";
    }

    @Override
    public String defaite() {
        return "Ohhhh! Infelizmente, você não ganhou.";
    }

    @Override
    public String cravate() {
        return "Ohhhh! Um empate!";
    }

    @Override
    public String joueur() {
        return "Opção do jogador ";
    }

    @Override
    public String machine() {
        return "Opção da máquina ";
    }

    @Override
    public String sortir() {
        return "Até mais!";
    }

    @Override
    public String erreur(){
        return "Erro na aplicação, ela será fechada.";
    }
}
