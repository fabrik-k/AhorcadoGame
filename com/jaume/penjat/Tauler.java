package com.jaume.penjat;

public class Tauler {
    private char[] paraulaSecreta;
    private int intents;

    public void inicialitzarPartida(String paraula, int intents){
        setParaulaSecreta(paraula.toCharArray());
        setIntents(intents);
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }


    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }
}
