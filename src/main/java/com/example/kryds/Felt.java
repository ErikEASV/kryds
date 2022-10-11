package com.example.kryds;

public class Felt {
    private String felt = " ";

    public void sæt(String s) {
        felt = s;
    }

    public boolean tomt() {
        return (felt.equals(" "));
    }

    public String brik() {
        return felt;
    }

}
