package com.example.kryds;

// Kryds er et reduceret Kryds-og-bolle spil med kun eet felt,
// hvilket selvfølgeli gør det trivielt at vinde een på stribe.
// App'en skal vise et simpelt spiil med brug af MVC-arkitektur.
// EK okt. 22.

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class KrydsController {

    // Brættet består kun af eet felt og en overskrift
    @FXML
    private Button felt1;

    @FXML
    private Label overskrift;

    // Modellen findes i klasserne Spil og Felt
    Spil mitSpil;

    @FXML
    void onFelt1klik(ActionEvent event) {
        // Check om træk er tilladt
        // id=0 er første felt (der jo kun eet)
        if (mitSpil.checkTilladt(0)) {
            felt1.setText("X");
            // hvis der var flere felter ville der være flere parametre til
            // opdaterBræt
            mitSpil.opdaterBræt(felt1.getText());
        }
        if (mitSpil.vinderFundet())
            // check om vinderkondition er opfyldt og udråb vinder
            overskrift.setText("X har vundet");
    }

    // Sæt nyt spil(=ny model) op med et nyt bræt
    public void initialize() {
         mitSpil = new Spil();
    }

}
