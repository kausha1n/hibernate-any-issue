package com.example.anytest.model;

import com.example.anytest.model.properties.IntegerProperty;
import com.example.anytest.model.properties.Property;
import com.example.anytest.model.properties.StringProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "property_holder")
@Setter
@Getter
@NoArgsConstructor
public class PropertyHolder {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "property_type")
    private String propertyType;

    @Any(metaColumn = @Column(name = "property_type"))
    @AnyMetaDef(metaType = "string", idType = "long", metaValues = {
            @MetaValue(value = "S", targetEntity = StringProperty.class),
            @MetaValue(value = "I", targetEntity = IntegerProperty.class)
    })
    @JoinColumn(name = "id", updatable = false, insertable = false)
    @Cascade(CascadeType.ALL)
    private Property property;
}