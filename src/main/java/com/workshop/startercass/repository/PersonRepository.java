package com.workshop.startercass.repository;

import com.workshop.startercass.repository.domain.PersonDomain;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends CassandraRepository<PersonDomain, UUID> {

    PersonDomain findByid(final UUID id);
}
