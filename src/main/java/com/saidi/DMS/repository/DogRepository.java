package com.saidi.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saidi.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}

/**
* S558642 Saidi Reddy Cheemalamarri
*/