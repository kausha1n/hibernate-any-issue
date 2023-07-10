package com.example.anytest.repo;

import com.example.anytest.model.PropertyHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyHolderRepo extends JpaRepository<PropertyHolder, Long> {
}
