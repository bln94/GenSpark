import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        String cave = "";
        try {
            cave = scanner.nextLine();
        } catch(Exception e) {
            System.out.println("Invalid");
        }
        chooseCave(cave);
    }

    public static String chooseCave(String cave) throws Exception {
        if(cave.equals("1")) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
            return "LOSE";
        } else if(cave.equals("2")) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("There is a bright light at the end of the cave...");
            System.out.println("The friendly dragon shares his treasure with you!");
            return "WIN";
        }
        throw new Exception("Invalid");
    }
}
