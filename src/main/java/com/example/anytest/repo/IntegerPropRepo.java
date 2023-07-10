package com.example.anytest.repo;

import com.example.anytest.model.properties.IntegerProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegerPropRepo extends JpaRepository<IntegerProperty, Long> {
}
