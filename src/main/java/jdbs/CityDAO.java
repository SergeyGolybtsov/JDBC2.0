package jdbs;

import java.util.List;

public interface CityDAO {
    void create(City city);

    City read(int id);


    List<City> readAll();

    void delete(City city);
}
