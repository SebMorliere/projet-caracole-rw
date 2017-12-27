package gameClient;

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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CaracoleApplication {

    class Message {
        private String message;

        public Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    @RequestMapping(path = "/echo/{message}", method= RequestMethod.GET)
    public Message echo(@PathVariable("message") String message) {
        return new Message(message);
    }

    public static void main(String[] args) {
        SpringApplication.run(CaracoleApplication.class, args);
    }
}