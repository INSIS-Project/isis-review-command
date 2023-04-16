package com.isep.acme.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isep.acme.model.Rating;

import java.util.Optional;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {

	@Query("SELECT r FROM Rating r WHERE r.rate=:rate")
	Optional<Rating> findByRate(Double rate);

}
