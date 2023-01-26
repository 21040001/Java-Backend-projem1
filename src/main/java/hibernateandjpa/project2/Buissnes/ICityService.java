package hibernateandjpa.project2.Buissnes;

import java.util.List;

import hibernateandjpa.project2.entity.City;

// buisness katlamini interface'dir
public interface ICityService {
	List<City> getall();
	void add(City city);
	void update(City city);
	void delete(City city);
	

}
