package com.workshop.startercass.web;

import com.workshop.startercass.repository.domain.PersonDomain;
import com.workshop.startercass.svc.DataSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class Controller {

    @Autowired
    DataSvc dataSvc;

    @GetMapping(value = "/users/{id}", produces = "application/json")
    public PersonDomain getUser(@PathVariable String id)
    {
        return dataSvc.getPerson(id);
    }

    @PostMapping(value="/users")
    public PersonDomain createUser(@RequestBody PersonDomain personDomain)
    {
        return dataSvc.createPerson(personDomain);
    }

    @DeleteMapping(value="/users/{id}")
    public String deleteUser(@PathVariable String id)
    {
        return dataSvc.deletePerson(id);
    }

    @GetMapping(value="users/test", produces ="application/json")
    public PersonDomain testMethod(){
        return new PersonDomain(UUID.randomUUID(),"Dave","Testman");
    }


}
