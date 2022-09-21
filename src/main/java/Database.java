import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superherolist = new ArrayList<Superhero>();

    public void createSuperhero(String name, String realName, boolean humanStatus, String superPower, int creationsYear, double strength) {
        Superhero superhero = new Superhero(name, realName, humanStatus, superPower, creationsYear, strength);
        superherolist.add(superhero);

    }

    public ArrayList<Superhero> getSuperhero() {
        return superherolist;
    }

    //Create test list:
    public void creatTestData() {
        Superhero superhero1 = new Superhero("Batman", "Bruce Wayne", (true), "intellect, fighting skills, and wealth", 1939, 70.0);
        Superhero superhero2 = new Superhero("Superman", "Clark Kent", (true), "super-speed, enhanced strength", 1933, 88.0);
        Superhero superhero3 = new Superhero("Iron Man", "Tony Stark", (true), "superhuman strength,durability", 1963, 78.0);
        Superhero superhero4 = new Superhero("Spider Man", "Peter Parker", (true), "Wall-Crawling,agility", 1962, 75.0);
        Superhero superhero5 = new Superhero("Wonder Woman", "Diana Prince", (true), "Godlike Super strength, super speed, ", 1941, 80.0);

        superherolist.add(superhero1);
        superherolist.add(superhero2);
        superherolist.add(superhero3);
        superherolist.add(superhero4);
        superherolist.add(superhero5);


    }

    public boolean deleteSuperhero(Superhero superhero) {
        boolean success = true;
        return success;
    }

    public Superhero findSuperHero(String searchTerm) {
        // find superheroes by input a name:
        for (Superhero s : superherolist) {// superheroes are in the array list
            if (s.getName().equalsIgnoreCase(searchTerm)) {
                return s;
            }
            // ingen fundet
        }
        return null;
    }


}

