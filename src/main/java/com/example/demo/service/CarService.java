package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
	
	@Autowired
	CarRepo cr;
	
	public List<Car> savedetails(List<Car> c)
	{
		return (List<Car>)cr.saveAll(c);
	}
	
	public List<Car> showinfo()
	{
		return cr.findAll(); 
	}
	public List<Car> getcar1(int o)
	{
		return cr.getCarInfo1(o);
	}
	public List<Car> getcar2(String cn)
	{
		return cr.getCarInfo2(cn);
	}
	public List<Car> getcar3(String a)
	{
		return cr.getCarInfo3(a);
	}
	public List<Car> getcar4(int o,String ct)
	{
		return cr.getCarInfo4(o, ct);
	}
	
	
	
	
	

}
