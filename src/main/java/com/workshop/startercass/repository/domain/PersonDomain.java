package com.workshop.startercass.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Table(value="person_table")
public class PersonDomain {
    @PrimaryKeyColumn(name="id", type=PrimaryKeyType.PARTITIONED)
    UUID id;

    @Column("first_name")
    String firstName;

    @Column("last_name")
    String lastName;

}
