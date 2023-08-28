package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;


public interface CarRepo extends JpaRepository<Car, Integer>
{
	
	@Query(value="select * from car where owners=:o",nativeQuery=true)
	public List<Car> getCarInfo1(@Param("o") int owners);
	
	@Query(value="select * from car where carname=:cn",nativeQuery=true)
	public List<Car> getCarInfo2(@Param("cn") String carname);
	
	@Query(value="select * from car where address=:a",nativeQuery=true)
	public List<Car> getCarInfo3(@Param("a") String address);

	
	@Query(value="select * from car where owners=:o and cartype=:ct",nativeQuery=true)
	public List<Car> getCarInfo4(@Param("o") int owners,@Param("ct") String cartype);
}
