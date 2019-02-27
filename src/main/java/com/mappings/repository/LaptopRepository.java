package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.models.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {

}
