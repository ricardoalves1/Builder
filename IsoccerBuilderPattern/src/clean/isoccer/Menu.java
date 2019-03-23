package clean.isoccer;

import java.util.Scanner;

class Menu {

    private Admin admin = new Admin("thitcc", "417417");

    boolean init() {

        System.out.print("Please select one of the options below:\n\n" +
                "1 - Log in as administrator\n" +
                "0 - Exit\n\n");

        if (admin.intInput() == 1) {
            return authentication();
        } else {
            return false;
        }

    }

    private boolean authentication() {

        Scanner input = new Scanner(System.in);

        System.out.print("Login: ");
        String login = input.next();
        System.out.print("Password: ");
        return admin.authenticate(login, input.next());

    }

    boolean home() {

        boolean home = true;

        while (home) {

            System.out.print("\nYou are logged in as an admin\n\n" +
                    "1 - Add an employee\n" +
                    "2 - Add a supporter member\n" +
                    "3 - Add a resource\n" +
                    "4 - Information Center\n" +
                    "0 - Exit\n\n");

            switch (admin.intInput()) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    admin.addSupporter();
                    break;
                case 3:
                    addResource();
                    break;
                case 4:
                    infoCenter();
                    break;
                default:
                    home = false;
                    break;

            }
        }

        return false;

    }

    private void addEmployee() {

        System.out.print("Please select one of the options below:\n\n" +
                "1 - President\n" +
                "2 - Coach\n" +
                "3 - Doctor\n" +
                "4 - Lawyer\n" +
                "5 - Driver\n" +
                "6 - Cooker\n" +
                "7 - Personal Trainer\n" +
                "8 - Player\n" +
                "0 - Exit\n\n");

        switch (admin.intInput()) {
            case 1:
                admin.setPresident();
                break;
            case 2:
                admin.setCoach();
                break;
            case 3:
                admin.setDoctor();
                break;
            case 4:
                admin.addLawyer();
                break;
            case 5:
                admin.addDriver();
                break;
            case 6:
                admin.addCooker();
                break;
            case 7:
                admin.addPersonalTrainer();
                break;
            case 8:
                admin.addPlayer();
                break;
            default:
                break;
        }

    }

    private void addResource() {

        System.out.print("Please select one of the options below:\n\n" +
                "1 - Bus\n" +
                "2 - Stadium\n" +
                "3 - Training Center\n" +
                "0 - Exit\n\n");

        switch (admin.intInput()) {
            case 1:
                admin.addBus();
                break;
            case 2:
                admin.addStadium();
                break;
            case 3:
                admin.addTrainingCenter();
                break;
            default:
                break;
        }

    }

    private void infoCenter() {

        System.out.print("What do you want to collect information about?\n\n" +
                "1 - Football team\n" +
                "2 - Available players\n" +
                "3 - Not available players\n" +
                "4 - General list of employees\n" +
                "5 - Transport list\n" +
                "6 - View Stadium\n" +
                "7 - View Training Center\n" +
                "8 - Quantity of supporters\n" +
                "9 - List of deputies\n" +
                "10 - List of defaulters\n" +
                "11 - List of supporters\n" +
                "0 - Exit\n\n");

        switch (admin.intInput()) {
            case 1:
                admin.showTeam();
                break;
            case 2:
                admin.showCapablePlayers();
                break;
            case 3:
                admin.showIncapablePlayers();
                break;
            case 4:
                admin.generalEmployeesList();
                break;
            case 5:
                admin.transportList();
                break;
            case 6:
                admin.showStadium();
                break;
            case 7:
                admin.showTrainingCenter();
                break;
            case 8:
                admin.quantityOfSupporters();
                break;
            case 9:
                admin.deputiesList();
                break;
            case 10:
                admin.defaultersList();
                break;
            case 11:
                admin.supportersList();
                break;
            default:
                break;
        }

    }

}
