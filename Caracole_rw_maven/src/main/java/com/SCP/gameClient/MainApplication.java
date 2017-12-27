package com.SCP.gameClient;

// phases attendues :
// - connection utilisateur (ou creation de compte)
// - creer une nouvelle partie (ou rejoindre une existante)
// +    - creation :
//      - choix du type de jeu
//      - configuration du jeu
//      - inviter des joueurs (ou ouvrir au public)
//      - lancer le salon d'attente des joueurs
//      - autoriser à lancer le jeu quand au moins 2 joueurs
//      - lancer le jeu
//
// +    - rejoindre :
//      - sur salon publique ou sur invitation

import com.SCP.caracole.Owner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        Owner ownerTest = new Owner("1", "test", "pnj");
        System.out.println("onwer: " + ownerTest.toString());
        SpringApplication.run(MainApplication.class, args);
    }
}