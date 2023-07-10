package com.example.anytest.model;

import com.example.anytest.model.properties.IntegerProperty;
import com.example.anytest.model.properties.Property;
import com.example.anytest.model.properties.StringProperty;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.*;

@Entity
@Table(name = "property_holder")
@Setter
@Getter
@NoArgsConstructor
public class PropertyHolder {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "property_type", insertable = false, updatable = false)
    private String propertyType;

    @Any
    @AnyKeyJavaClass(Long.class)
    @AnyDiscriminator(DiscriminatorType.STRING)
    @AnyDiscriminatorValues({
            @AnyDiscriminatorValue(discriminator = "I", entity = IntegerProperty.class),
            @AnyDiscriminatorValue(discriminator = "S", entity = StringProperty.class)
    })
    @Column(name = "property_type")
    @JoinColumn(name = "id", updatable = false, insertable = false)
    @Cascade(CascadeType.ALL)
    private Property property;
}