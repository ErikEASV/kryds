package com.example.kryds;

import java.util.LinkedList;

// Dette er modellen
public class Spil {
    // Spille brættet repræsenteres ved objekter for hvert felt.
    // og en liste så felterne kan findes med et indeks.
    // Det er også nemmere at checke vinderkondition, når man har en liste
    // man kan løbe igennem.
    private Felt f0;
    private LinkedList<Felt> bræt = new LinkedList<Felt>();

    // Nyt spil med eet felt
    public Spil() {
        f0 = new Felt();
        bræt.add(f0);
    }

    public boolean checkTilladt(int id) {
        // Check at det felt der skal rykkes til er tomt
        if (bræt.get(id).tomt())
            return true;
        else
            return false;
    }

    public void opdaterBræt(String s0) {
        // hvis der er flere felter, så vil der være flere parametre
        // og besked til hvert enkelt felt: "fn.sæt(sn)"
        f0.sæt(s0);
    }

    public boolean vinderFundet() {
        // Vinderkonditionen er een på stribe, så vi checker
        // bræts brikker for at se om der er een på stribe.
        for (Felt f : bræt)
            if (f.brik().equals("X"))
                return true;
        return false;
    }
}
