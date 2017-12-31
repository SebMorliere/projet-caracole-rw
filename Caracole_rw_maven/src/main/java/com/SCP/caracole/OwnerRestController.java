package com.SCP.caracole;

import com.SCP.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owners/")
public class OwnerRestController {
    @Autowired
    private OwnerRepository ownerRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Owner saveOwner(@RequestBody Owner owner) {
        ownerRepository.save(owner);
        return owner;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Owner> getOwner() {
        return ownerRepository.findAll();
    }
}
