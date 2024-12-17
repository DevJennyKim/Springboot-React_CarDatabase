package com.packt.cardatabase;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner{
	private static final Logger logger=
			LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository repository;
	@Autowired
    private OwnerRepository orepository;
	
	
	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Add owner objects and save these to db 
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new  Owner("Mary" , "Robinson");
		orepository.saveAll(Arrays.asList(owner1, owner2));
		
		//save cars to database
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021,59000));
		repository.save(new Car("Nissan", "Leaf", "white", "SSJ3002", 2019,29000));
		repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020,39000));
	    repository.save(new Car("Honda", "Civic", "Blue", "HND-1234", 2018, 20000));
	    repository.save(new Car("Chevrolet", "Malibu", "Black", "CHV-5678", 2020, 25000));
	    repository.save(new Car("BMW", "X5", "White", "BMW-3456", 2021, 75000));
	    repository.save(new Car("Audi", "A4", "Gray", "AUD-7890", 2019, 40000));
	    repository.save(new Car("Mercedes", "C-Class", "Black", "MBZ-1111", 2022, 80000));
	    repository.save(new Car("Kia", "Sorento", "Red", "KIA-2222", 2017, 18000));
	    repository.save(new Car("Hyundai", "Tucson", "Silver", "HYU-3333", 2019, 22000));
	    repository.save(new Car("Mazda", "CX-5", "Blue", "MZD-4444", 2020, 24000));
	    repository.save(new Car("Volkswagen", "Golf", "White", "VW-5555", 2018, 17000));
	    repository.save(new Car("Subaru", "Outback", "Green", "SUB-6666", 2021, 31000));
	    repository.save(new Car("Volvo", "XC60", "Black", "VOL-7777", 2022, 50000));
	    repository.save(new Car("Tesla", "Model 3", "White", "TSL-8888", 2021, 60000));
	    repository.save(new Car("Ford", "Explorer", "Blue", "FRD-9999", 2019, 32000));
	    repository.save(new Car("Jeep", "Cherokee", "Red", "JEP-0000", 2020, 35000));
	    repository.save(new Car("Toyota", "Camry", "Silver", "TYT-1230", 2021, 27000));
	    repository.save(new Car("Nissan", "Altima", "Black", "NIS-4560", 2018, 19000));
	    repository.save(new Car("Honda", "Accord", "Gray", "HND-7891", 2019, 21000));
	    repository.save(new Car("Chevrolet", "Impala", "White", "CHV-6789", 2017, 16000));
	    repository.save(new Car("BMW", "3 Series", "Blue", "BMW-1239", 2020, 42000));
	    repository.save(new Car("Audi", "Q7", "Black", "AUD-4567", 2021, 73000));
	    repository.save(new Car("Mercedes", "E-Class", "Silver", "MBZ-7890", 2019, 68000));
		
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand()+" "+car.getModel());
		}
		
	}

}
