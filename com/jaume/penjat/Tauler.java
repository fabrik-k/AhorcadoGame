package com.jaume.penjat;

public class Tauler {
    private char[] paraulaSecreta;
    private Integer intents;
    private Integer totalIntents;
    private boolean guanyador = false;
    private String[] palabraEndevinada;
    private String ver = null;

    public void inicialitzarPartida(String paraula, Integer intents) {
        setParaulaSecreta(paraula.toCharArray());
        setIntents(intents);
        setTotalIntents(intents);
        setPalabraEndevinada(paraula);
    }

    public String imprimirVides() {
        if (intents > 1) {
            return "Et queden " + intents + " vides de " + getTotalIntents();
        }
        return "Et queda 1 vida de " + getTotalIntents();
    }

    public boolean hasGuanyat() {
        return guanyador;
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

    public boolean isGuanyador() {
        return guanyador;
    }

    public void setGuanyador(boolean guanyador) {
        this.guanyador = guanyador;
    }

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String paraula) {
        palabraEndevinada = new String[paraula.length()];
        for (int i = 0; i < paraula.length(); i++) {
            palabraEndevinada[i] = "_";
        }
    }

    public String verificar(String letra) {
        if (letra.length() > 1) {
            ver = "Lletra incorrecte";
        } else {
            for (int i = 0; i < paraulaSecreta.length; i++) {
                if (paraulaSecreta[i] == letra.charAt(0)) {
                    palabraEndevinada[i] = letra;
                }
            }
        }
        return ver;
    }

    public String imprimir() {
        String current = "";
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                current = current + "_";
            } else {
                current = current + palabraEndevinada[i];
            }
        }
        return current;
    }
}