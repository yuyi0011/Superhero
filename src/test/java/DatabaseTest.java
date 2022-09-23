import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database database;

    @BeforeEach
    void prepareTest() {
        database = new Database();
        Superhero superhero1 = new Superhero("Batman", "Bruce Wayne", (true), "intellect, fighting skills, and wealth", 1939, 70.0);
        Superhero superhero2 = new Superhero("Superman", "Clark Kent", (true), "super-speed, enhanced strength", 1933, 88.0);
        Superhero superhero3 = new Superhero("Iron Man", "Tony Stark", (true), "superhuman strength,durability", 1963, 78.0);
        Superhero superhero4 = new Superhero("Spider Man", "Peter Parker", (true), "Wall-Crawling,agility", 1962, 75.0);
        Superhero superhero5 = new Superhero("Wonder Woman", "Diana Prince", (true), "Godlike Super strength, super speed, ", 1941, 80.0);
    }

    @Test
    void createSuperhero() {
        //Arrange

        //Act

        //Assert

    }

    @Test
    void getSuperhero() {
    }

    @Test
    void creatTestSuperheroList() {
        //Arrange

        //Act
        ArrayList<Superhero> results = database.getSuperhero();

        int actualSize = results.size();

        //Assert
        assertEquals(database.Superhero);

    }

    @Test
    void deleteSuperhero() {
        ArrayList<Superhero> results = database.getSuperhero();
        Superhero superhero = results.get(0);

        boolean actualReasult = database.deleteSuperhero(superhero);
        boolean expectedResult = true;

        assertEquals(expectedResult, actualReasult);

        int expectedSize = results.size() - 1;
        ArrayList<Superhero> resultsAfterDelete = database.getSuperhero();
        int actualSize = resultsAfterDelete.size();
        assertEquals(expectedSize, actualSize);
    }
}