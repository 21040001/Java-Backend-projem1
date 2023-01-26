package hibernateandjpa.project2.demo;
import hibernateandjpa.project2.entity.City;
import java.util.List;

public interface ICitiyDal {
	List<City> getall();
	void add(City city);
	void update(City city);
	void delete(City city);
	
}
