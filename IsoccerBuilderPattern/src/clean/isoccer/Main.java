package clean.isoccer;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        while (menu.init()) {

            boolean systemOn = true;

            while (systemOn) {
                systemOn = menu.home();
            }

        }

        System.out.println("System shutdown");

    }
}
