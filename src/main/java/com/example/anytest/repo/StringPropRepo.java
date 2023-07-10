package com.example.anytest.repo;

import com.example.anytest.model.properties.StringProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringPropRepo extends JpaRepository<StringProperty, Long> {
}
