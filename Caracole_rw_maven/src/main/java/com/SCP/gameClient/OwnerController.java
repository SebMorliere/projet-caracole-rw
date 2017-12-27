package com.SCP.gameClient;

import com.SCP.caracole.Owner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {
    @RequestMapping(path = "/users/", method = RequestMethod.POST)
    public Owner getOwner (@RequestBody Owner owner) {
        return owner;
    }
}
