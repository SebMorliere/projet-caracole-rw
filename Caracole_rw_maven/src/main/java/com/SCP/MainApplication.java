package com.SCP;

import com.SCP.caracole.CaracoleHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ComponentScan("com.SCP.caracole")
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(MainApplication.class, args);

        GameHandler gh = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println();
            System.out.println("*** *** *** ***");
            System.out.println("Caracole - Menu : ");
            System.out.println("[0] : check (gameType)");
            System.out.println("[1] : définir le type de jeu en caracole (gameType)");
            System.out.println("[2] : si (gameType) est défini, générer le deck avec gameHandler.start()");
            System.out.print("*** CHOIX >>>");

            String command = br.readLine();
            switch (command) {
                case "0":
                    System.out.println("<<0>>");
                    String msg;
                    if (gh == null) {
                        msg = "null";
                    } else {
                        msg = gh.getClass().toString();
                    }
                    System.out.println("(gameType) gh.getClass: " + msg);;
                    break;
                case "1":
                    System.out.println("<<1>>");
                    gh = new CaracoleHandler();
                    System.out.println("set (gameType) to caracole: " + gh.getClass());;
                    break;
                case "2":
                    System.out.println("<<2>>");
                    if (gh != null) {
                        System.out.println("(gameType) is " + gh.getGameType() + "!");
                        gh.start();
                    }
                    break;
                default:
                    break;
            }
        }
    }

}