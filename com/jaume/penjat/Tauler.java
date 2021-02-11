package com.jaume.penjat;

public class Tauler {
    private char[] ParaulaSecreta;
    private int intents;

    public void inicialitzarPartida(String paraula, int intents){
        setParaulaSecreta(paraula.toCharArray());
        setIntents(intents);

    }

    public char[] getParaulaSecreta() {
        return ParaulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        ParaulaSecreta = paraulaSecreta;
    }


    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }
}
