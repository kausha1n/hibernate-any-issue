package com.example.anytest.model.properties;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "string_property")
@Setter
@Getter
public class StringProperty implements Property<String> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`value`")
    private String value;
}