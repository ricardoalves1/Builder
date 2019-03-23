package smell.isoccer;

import smell.isoccer.employees.*;
import smell.isoccer.resources.*;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {

    private President president;
    private Coach coach;
    private Doctor doctor;

    private ArrayList<Cooker> cooks = new ArrayList<>();
    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<Lawyer> lawyers = new ArrayList<>();
    private ArrayList<PersonalTrainer> trainers = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();

    private ArrayList<Supporter> supporters = new ArrayList<>();

    private ArrayList<Bus> buses = new ArrayList<>();
    private Stadium stadium;
    private TrainingCenter trainingCenter;

    private String login;
    private String password;

    Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    boolean authenticate(String login, String password) {
        return login.equals(this.login) && password.equals(this.password);
    }

    private String[] form() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease follow the next steps\n");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("E-mail: ");
        String email = input.next();
        System.out.print("CPF: ");
        String cpf = input.next();
        System.out.print("Phone Number: ");
        String phone = input.next();

        return new String[]{name, email, cpf, phone};
    }

    int intInput() {

        Scanner input = new Scanner(System.in);

        boolean correctInput = false;
        int op = 0;

        while (!correctInput) {
            try {
                System.out.print(">> ");
                op = Integer.parseInt(input.next());

                correctInput = true;

            } catch(NumberFormatException e) {
                System.out.println("You typed a value that is not a integer, please try again\n" +
                        e.getMessage());
            }
        }

        return op;

    }

    private double doubleInput() {

        Scanner input = new Scanner(System.in);

        boolean correctInput = false;
        double salary = 0.0;

        while (!correctInput) {
            try {
                System.out.print(">> ");
                salary = Double.parseDouble(input.next());
                correctInput = true;
            } catch (NumberFormatException e) {
                System.out.println("You typed a value that is not decimal, please try again\n" +
                        e.getMessage());
            }
        }

        return salary;

    }

    private boolean booleanInput() {

        Scanner input = new Scanner(System.in);

        boolean correctInput = false;
        int salary = 0;

        while (!correctInput) {
            try {
                System.out.print(">> ");
                salary = Integer.parseInt(input.next());
                correctInput = true;
            } catch (NumberFormatException e) {
                System.out.println("You typed a value that is not integer, please try again\n" +
                        e.getMessage());
            }
        }

        return salary == 1;

    }

    void setPresident() {

        Scanner input = new Scanner(System.in);

        System.out.println("Note that we can only have one president, if one already exists, it will be replaced.\n");

        if (president == null) {
            System.out.println("President to be replaced: There is currently no president");
        } else {
            System.out.println("President to be replaced: " + president.getName());
        }

        System.out.print("\nYou wish to continue? [Y/N] : ");

        char op = input.next().charAt(0);

        if (op == 'Y' || op == 'y') {
            String[] basicForm = form();
            System.out.print("Salary ");
            this.president = new President(basicForm[0], basicForm[1], basicForm[2], basicForm[3], doubleInput());
        }

    }

    void setCoach() {

        Scanner input = new Scanner(System.in);

        System.out.println("Note that we can only have one coach, if one already exists, it will be replaced.");

        if (coach == null) {
            System.out.println("Coach to be replaced: There is currently no coach");
        } else {
            System.out.println("Coach to be replaced: " + coach.getName());
        }

        System.out.print("\nYou wish to continue? [Y/N] : ");

        char op = input.next().charAt(0);

        if (op == 'Y' || op == 'y') {
            String[] basicForm = form();
            System.out.print("Salary ");
            this.coach = new Coach(basicForm[0], basicForm[1], basicForm[2], basicForm[3], doubleInput());
        }

    }

    void setDoctor() {

        Scanner input = new Scanner(System.in);

        System.out.println("Note that we can only have one doctor, if one already exists, it will be replaced.");

        if (doctor == null) {
            System.out.println("Doctor to be replaced: There is currently no doctor");
        } else {
            System.out.println("Doctor to be replaced: " + doctor.getName());
        }

        System.out.print("\nYou wish to continue? [Y/N] : ");

        char op = input.next().charAt(0);

        if (op == 'Y' || op == 'y') {
            String[] form = form();
            System.out.print("CRM: ");
            String crm = input.next();
            System.out.print("Salary ");
            this.doctor = new Doctor(form[0], form[1], form[2], form[3], crm, doubleInput());
        }

    }

    void addLawyer() {

        System.out.println("You are adding a lawyer to the team\n" +
                "Lawyers in the team: " + this.lawyers.size());

        String[] form = form();
        System.out.print("Salary ");
        this.lawyers.add(new Lawyer(form[0], form[1], form[2], form[3], doubleInput()));

    }

    void addDriver() {

        Scanner input = new Scanner(System.in);

        System.out.println("You are adding a driver to the team\n" +
                "Drivers in the team: " + this.drivers.size());

        String[] form = form();
        System.out.print("License: ");
        String license = input.next();
        System.out.print("Salary ");
        this.drivers.add(new Driver(form[0], form[1], form[2], form[3], license, doubleInput()));

    }

    void addCooker() {

        System.out.println("You are adding a cooker to the team\n" +
                "Cooker in the team: " + this.cooks.size());

        String[] form = form();
        System.out.print("Salary ");
        this.cooks.add(new Cooker(form[0], form[1], form[2], form[3], doubleInput()));

    }

    void addPersonalTrainer() {

        System.out.println("You are adding a Personal Trainer to the team\n" +
                "Trainers in the team: " + this.trainers.size());

        String[] form = form();
        System.out.print("Salary ");
        this.trainers.add(new PersonalTrainer(form[0], form[1], form[2], form[3], doubleInput()));

    }

    void addPlayer() {

        Scanner input = new Scanner(System.in);

        System.out.println("You are adding a player to the team\n" +
                "Players in the team: " + this.players.size());

        String[] form = form();
        System.out.print("Role: ");
        String role = input.next();
        System.out.print("Capable:\n" +
                "1 - Yes\n" +
                "2 - No\n");
        boolean capable = booleanInput();
        System.out.print("Salary ");
        this.players.add(new Player(form[0], form[1], form[2], form[3], role, capable, doubleInput()));

    }

    void addSupporter() {

        Scanner input = new Scanner(System.in);

        System.out.print("In the process of adding a supporter member, " +
                "the type of supporter will be evaluated according to their contribution\n" +
                "Junior:  10 <= $ <= 1200\n" +
                "Senior: 1200 < $ <= 3600\n" +
                "Elite:         $ > 3600\n" +
                "Number of supporters: " + this.supporters.size());

        String[] form = form();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Compliance:\n" +
                "1 - Defaulter\n" +
                "2 - Defaulting\n");
        boolean compliance = booleanInput();
        double contribution = 0.0;
        String type;

        boolean correctInput = false;

        while (!correctInput) {
            System.out.print("Contribution ");
            contribution = doubleInput();

            if (contribution >= 10) {
                correctInput = true;
            } else {
                System.out.println("Values less than 10$ are not allowed");
            }
        }

        if (contribution >= 10 && contribution <= 1200) {
            type = "Junior";
        } else if (contribution > 1200 && contribution <= 3600) {
            type = "Senior";
        } else {
            type = "Elite";
        }

        this.supporters.add(new Supporter(form[0], form[1], form[2], form[3], address, compliance, contribution, type));

    }

    void addBus() {

        System.out.println("You are adding a Bus to the team");

        if (this.buses.size() == 0) {
            System.out.println("No bus available");
        } else {
            System.out.println("Number of team buses: " + this.buses.size());
        }

        System.out.print("Bus number ");
        int number = intInput();
        System.out.print("Will this bus be available as we complete its addition?\n" +
                "1 - Yes\n" +
                "2 - No\n");
        this.buses.add(new Bus(number, booleanInput()));

    }

    void addStadium() {

        Scanner input = new Scanner(System.in);

        System.out.println("Note that our team can only have one stadium, if one already exists, it will be updated");

        if (this.stadium == null) {
            System.out.println("No stadium available");
        } else {
            System.out.println("Team already have a stadium");
        }

        System.out.print("\nYou wish to continue? [Y/N] : ");

        char op = input.next().charAt(0);

        if (op == 'Y' || op == 'y') {
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Capacity ");
            int capacity = intInput();
            System.out.print("Number of bathrooms ");
            int bathrooms = intInput();
            System.out.print("Number of snack stations ");
            int snackStations = intInput();

            System.out.print("Will this stadium be available as we complete this procedure?\n" +
                    "1 - Yes\n" +
                    "2 - No\n");
            this.stadium = new Stadium(name, capacity, bathrooms, snackStations, booleanInput());
        }

    }

    void addTrainingCenter() {

        Scanner input = new Scanner(System.in);

        System.out.println("Note that our team can only have one training center, if one already exists, it will be updated");

        if (this.trainingCenter == null) {
            System.out.println("No training center available");
        } else {
            System.out.println("Team already have a training center");
        }

        System.out.print("\nYou wish to continue? [Y/N] : ");

        char op = input.next().charAt(0);

        if (op == 'Y' || op == 'y') {
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Number of bedrooms ");
            int bedrooms = intInput();

            System.out.print("Will this training center be available as we complete its addition?\n" +
                    "1 - Yes\n" +
                    "2 - No\n");
            this.trainingCenter = new TrainingCenter(name, bedrooms, booleanInput());
        }

    }

    private <E> void printArray(ArrayList<E> e) {
        for (E element: e) {
            System.out.println(element.toString() + "\n");
        }
    }

    void showTeam() {

        if (coach != null) {
            System.out.println("Coach:\n" + coach.toString() + "\n");
        } else {
            System.out.println("No coach\n");
        }

        if (players.size() > 0) {
            System.out.println("Players:\n");
            printArray(players);
        } else {
            System.out.println("No players available\n");
        }

    }

    void showCapablePlayers() {

        if (players.size() > 0) {
            for (Player player: players) {
                if (player.isCapable()) {
                    System.out.println(player.toString() + "\n");
                }
            }
        } else {
            System.out.println("No players available");
        }

    }

    void showIncapablePlayers() {

        if (players.size() > 0) {
            for (Player player: players) {
                if (!player.isCapable()) {
                    System.out.println(player.toString() + "\n");
                }
            }
        } else {
            System.out.println("No players available");
        }

    }

    void generalEmployeesList() {

        if (president != null) {
            System.out.println("President:\n" + president.toString() + "\n");
        } else {
            System.out.println("No president\n");
        }

        if (doctor != null) {
            System.out.println("Doctor: \n" + doctor.toString() + "\n");
        } else {
            System.out.println("No doctor\n");
        }

        if (cooks.size() > 0) {
            System.out.println("Cooks:\n");
            printArray(cooks);
        } else {
            System.out.println("No cooks available\n");
        }

        if (drivers.size() > 0) {
            System.out.println("Drivers:\n");
            printArray(drivers);
        } else {
            System.out.println("No drivers available\n");
        }

        if (lawyers.size() > 0) {
            System.out.println("Lawyers:\n");
            printArray(lawyers);
        } else {
            System.out.println("No lawyers available\n");
        }

        if (trainers.size() > 0) {
            System.out.println("Personal Trainers:\n");
            printArray(trainers);
        } else {
            System.out.println("No personal trainers available\n");
        }

    }

    void transportList() {

        if (buses.size() > 0) {
            System.out.println("Buses:\n");
            printArray(buses);
        } else {
            System.out.println("No buses available\n");
        }

    }

    void showStadium() {

        if (stadium != null) {
            System.out.println("Stadium:");
            System.out.println(stadium.toString() + "\n");
        } else {
            System.out.println("No stadium\n");
        }

    }

    void showTrainingCenter() {

        if (trainingCenter != null) {
            System.out.println("Training Center:");
            System.out.println(trainingCenter.toString());
        } else {
            System.out.println("No training center\n");
        }

    }

    void quantityOfSupporters() {

        System.out.println("Quantity of Supporters: " + supporters.size());

    }

    void deputiesList() {

        for (Supporter sup : supporters) {
            if (sup.isCompliance()) {
                System.out.println(sup.toString());
            }
        }

    }

    void defaultersList() {

        for (Supporter sup : supporters) {
            if (!sup.isCompliance()) {
                System.out.println(sup.toString());
            }
        }

    }

    void supportersList() {

        printArray(supporters);

    }

}
