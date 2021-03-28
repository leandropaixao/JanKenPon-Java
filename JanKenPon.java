public enum JanKenPon {
    JAN(1),KEN(2),PON(3), SORTIR(4), LANGUE(5);

    private int valor;
    JanKenPon(int valor) {
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public static JanKenPon getValor(int valor){
        for (JanKenPon jkp : values()) {
            if (jkp.getValor() == valor){
                return jkp;
            }
        }
        return null;
    }
}