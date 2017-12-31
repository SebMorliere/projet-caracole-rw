package com.SCP.testControllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/{msg}")
public class MessageRestController {

    class Message {
        private String message;

        public Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public Message echoMessage(@PathVariable("msg") String message) {
        return new Message(message);
    }
}
