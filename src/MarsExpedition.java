import java.util.Scanner;
public class MarsExpedition {
    private Scanner input;
    private int teamSize;
    private String name;
    private String snack;
    private String vehicle;
    public MarsExpedition() throws InterruptedException {
        input = new Scanner(System.in);
        System.out.println("Boot-up sequence initiated...\nWelcome to the Mars Expedition preparation program.");
        Thread.sleep(1000);
        System.out.println("What is your name team leader?");
        name = input.nextLine();
        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String ready = input.nextLine();
        if (ready.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people are going on this mission with you?");
        teamSize = input.nextInt();
        if (teamSize > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        }
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing " + snack + " with you.");
        System.out.println("Please choose a vehicle for your journey:");
        System.out.println("1. Rover");
        System.out.println("2. Helicopter");
        System.out.println("3. Submarine");
    }


}

