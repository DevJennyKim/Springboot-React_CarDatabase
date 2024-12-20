package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
	// Search by brand
	List<Car> findByBrand(@Param("brand") String brand);

	// Search by color
	List<Car> findByColor(@Param("color") String color);

	// Search by year
	List<Car> findByYear(@Param("year") int year);

	// Search by brand and model
	List<Car> findByBrandAndModel(String brand, String model);

	// Search by brand or color
	List<Car> findByBrandOrColor(String brand, String color);

	// Search by brand and order by year
	List<Car> findByBrandOrderByYearAsc(String brand);

}
