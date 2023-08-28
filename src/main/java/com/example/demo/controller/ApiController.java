package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
public class ApiController {
	
	@Autowired
	CarService cs;
	
	@PostMapping("/")
	public List<Car> addndetails(@RequestBody List<Car> c)
	{
		return cs.savedetails(c);
	}
	@GetMapping("showdetails")
    public List<Car> show()
    {
    	return cs.showinfo();
    }
	@GetMapping("owners/{owners}")
	public List<Car> showcar1(@PathVariable int owners)
	{
		return cs.getcar1(owners);
	}
	@GetMapping("carName/{carname}")
	public List<Car> showcar2(@PathVariable String carname)
	{
		return cs.getcar2(carname);
	}
	@GetMapping("address/{address}")
	public List<Car> showcar3(@PathVariable String address)
	{
		return cs.getcar3(address);
	}
	@GetMapping("owners/{owners}/cartype/{cartype}")
	public List<Car> showcar4(@PathVariable int owners,@PathVariable String cartype)
	{
		return cs.getcar4(owners,cartype);
	}
	

}
