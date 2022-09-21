import java.util.Scanner;


public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Database database;

    public void startInterface() {
        database = new Database();
//database.createSuperhero(name, realName, creationsYear,strength, superPower, humanStatus);

        int menyChoice;
        do {
            //Super hero world!!
            System.out.println("Welcome to the super hero world!");
            System.out.println("Please make a choice from the Meny");
            System.out.println("1. Create an new super hero");
            System.out.println("2. Search a hero from the database");
            System.out.println("3. Show a list of the heros");
            System.out.println("4, edit the Superhero list");
            System.out.println("5. delete en super hero");
            System.out.println("9. End the programme");

            menyChoice = scanner.nextInt();
            scanner.nextLine();//Fix for Scanner bug.

            if (menyChoice == 1) {
                creatSuperhero();
            }
            if (menyChoice == 2) {
                searchSuperhero();

            }
            if (menyChoice==3){
                showSuperheroList();
            }
            if (menyChoice==4)
            {
                editSuperheroList();
            }
            else if (menyChoice == 9) {
                System.out.println("The prgramme is ending!");
            }


        } while (menyChoice != 9);


    }

    private void editSuperheroList() {

    }

    private void showSuperheroList() {
        for (Superhero superhero : database.getSuperhero()) {
            System.out.println(database.getSuperhero());
    }
    }
    private void searchSuperhero() {

            System.out.println("Input a charactor that your would like to search");
            String searchTerm = scanner.nextLine();

            System.out.println("We have found:" + searchTerm);

            }


    private void creatSuperhero() {

            System.out.println("What is the name of the super hero?");
            String name = scanner.nextLine();

            String realName = scanner.nextLine();
            System.out.println("What is the real name of the super hero?");

            System.out.println("Is the super hero a human?");
            Boolean humanStatus = scanner.nextLine().substring(0, 1).equalsIgnoreCase("y");

            System.out.println("superpower");
            String superpower = scanner.nextLine();

            System.out.println("Which year has the super hero been created as a super hero?");
            int creationsYear = scanner.nextInt();

            System.out.println("What is the strength level (for exsample, 980)?");
            double strength = scanner.nextDouble();

        }
    }
