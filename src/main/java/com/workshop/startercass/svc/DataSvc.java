package com.workshop.startercass.svc;

import com.workshop.startercass.repository.PersonRepository;
import com.workshop.startercass.repository.domain.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataSvc {

    @Autowired
    PersonRepository dataRepository;

    public PersonDomain createPerson(PersonDomain personDomain)
    {
        return dataRepository.save(personDomain);
    }

    public PersonDomain getPerson(String id)
    {
        UUID key = UUID.fromString(id);
        return dataRepository.findByid(key);
    }

    public String deletePerson(String id)
    {
        dataRepository.delete(getPerson(id));
        return ("Deleted " + id);

    }
}
