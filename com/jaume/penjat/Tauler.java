package com.jaume.penjat;

public class Tauler {
    private char[] ParaulaSecreta;
    private Integer intents;

    public void inicialitzarPartida(String paraula, int intents) {
        setParaulaSecreta(paraula.toCharArray());
        setIntents(intents);

    }

    public char[] getParaulaSecreta() {
        return ParaulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        ParaulaSecreta = paraulaSecreta;
    }


    public Integer getIntents() {
        return intents;
    }

    public void setIntents(Integer intents) {
        this.intents = intents;
    }

}