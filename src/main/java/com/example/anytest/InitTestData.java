package com.example.anytest;

import com.example.anytest.model.PropertyHolder;
import com.example.anytest.model.properties.IntegerProperty;
import com.example.anytest.model.properties.StringProperty;
import com.example.anytest.repo.IntegerPropRepo;
import com.example.anytest.repo.PropertyHolderRepo;
import com.example.anytest.repo.StringPropRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitTestData {
    @Autowired
    PropertyHolderRepo propertyHolderRepo;

    @Autowired
    IntegerPropRepo integerPropRepo;

    @Autowired
    StringPropRepo stringPropRepo;

    @Bean
    CommandLineRunner run() {
        return args -> {
            IntegerProperty ageProperty = new IntegerProperty();
            ageProperty.setId(2L);
            ageProperty.setName("age");
            ageProperty.setValue(23);


            StringProperty nameProperty = new StringProperty();
            nameProperty.setId(1L);
            nameProperty.setName("name");
            nameProperty.setValue("John Doe");


            PropertyHolder namePropertyHolder = new PropertyHolder();
            namePropertyHolder.setId(1L);
            namePropertyHolder.setPropertyType("S");
            namePropertyHolder.setProperty(nameProperty);

            PropertyHolder agePropertyHolder = new PropertyHolder();
            agePropertyHolder.setId(2L);
            agePropertyHolder.setPropertyType("I");
            agePropertyHolder.setProperty(ageProperty);

            propertyHolderRepo.save(namePropertyHolder);
            propertyHolderRepo.save(agePropertyHolder);
            stringPropRepo.save(nameProperty);
            integerPropRepo.save(ageProperty);
        };
    }
}
