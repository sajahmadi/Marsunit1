import java.util.*;

public class FindingsList {
    private ArrayList<String> findings;

    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back from the expedition!");
        findings = new ArrayList<>();
        findings.add("rock");
        findings.add("weird rock");
        findings.add("smooth rock");
        findings.add("not rock");
        System.out.println("Data downloaded successfully. Rocks found: " + findings);
        findings.remove("not rock");
        System.out.println("Data cleaned, non-rock removed. Rocks found: " + findings);
        System.out.println("Perfect!");


        Thread.sleep(1000);
        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(700);
        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        supplies.remove("Stun gun");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

