package hibernateandjpa.project2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hibernateandjpa.project2.Buissnes.ICityService;
import hibernateandjpa.project2.entity.City;


@RestController
@RequestMapping("/api")
public class Citycontroller {
	private ICityService cityservice;

	@Autowired
	public Citycontroller(ICityService cityservice) {
		this.cityservice = cityservice;
	}
	
	@GetMapping("/citiy")
	public List<City> get(){
		return cityservice.getall();
	}
	
	@GetMapping("/add")
	public void add(City city) {
		
	}
}
