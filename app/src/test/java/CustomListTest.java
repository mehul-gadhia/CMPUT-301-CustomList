import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        City city1 = new City("Halifax", "NS");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
    }

    @Test
    public void deleteCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        City city1 = new City("Halifax", "NS");
        list.addCity(city1);
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city1);
        assertEquals(list.getCount(), listSize);
    }

    @Test
    public void countCitiesTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.countCities(), listSize+1);
    }
}
