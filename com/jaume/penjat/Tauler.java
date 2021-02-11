package com.jaume.penjat;

public class Tauler {
    private char[] paraulaSecreta;
    private int intents;

    private Integer totalIntents;

    public void inicialitzarPartida(String paraula, Integer intents){
        setParaulaSecreta(paraula.toCharArray());
        setIntents(intents);
        setTotalIntents(intents);

    }

    public String imprimirVides(){
        if (intents>1) {
            return "Et queden " + intents + " vides de " + getTotalIntents();
        }
        return "Et queda 1 vida de " + getTotalIntents();
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
    public Integer getTotalIntents() {
        return totalIntents;
    }

    public void setTotalIntents(Integer totalIntents) {
        this.totalIntents = totalIntents;
    }
}
