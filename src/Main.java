import java.util.Scanner;
import monsters.*;
import Stages.*;
public class Main {
    static Scanner input = new Scanner(System.in); // Scanner class
    static void welcome(){ // Game Title
        System.out.println(" Humbles presents");
        dialogues.delay(2);
        System.out.println(" ");
        System.out.println(" **********************");
        System.out.println(" Epic Weaver: Threads Unveiled");
        System.out.println(" **********************");
        dialogues.delay(2);
        System.out.println(" ");
        System.out.println(" Type Any to Start or X to End and press Enter");
    }
    public static void main(String[] args) {
        //dialogues message = new dialogues();
        //JobClass jobclass = new JobClass();

        Player uPlayer = new Player();
        Stage stage1 = new Forest();
        Combat combat;

        int x;

        // Game title Message
        welcome();
        System.out.print(" /> ");
        String start = input.nextLine();
        // Game Start
        if (start.equals("x") || start.equals("X")) {
            System.out.println(" Adventure shutting down...");
        } else {
            // Introduction
            //dialogues.goddess1();

            // Player name
            System.out.print(" Enter name: ");
            String pName = input.nextLine();
            System.out.println(" ");
            uPlayer.setName(pName);

            // Player Job ------> WIP <------
            //dialogues.goddess2(uPlayer);

            /* ------> WIP <------
            System.out.print("Enter Job : ");
            int pJob = input.nextInt();
            System.out.print(" ");
            uPlayer.setJob(jobclass.mainJob(pJob));
            */


            // Player embark
            //dialogues.goddess3(uPlayer);

            combat = new Combat(uPlayer); // Player initialize

            // Beginning of Stage
            stage1.welcomeStage(); // Forest

            // Initialize Stage 1 monsters
            int totalMonsters = stage1.numOfMonsters[0] + stage1.numOfMonsters[1] - 1;

            // Correcting num of monsters
            stage1.numOfMonsters[0] +=1;
            stage1.numOfMonsters[1] +=1;

            // Combat mode
            /* Debugging
            for (x = 0; x < totalMonsters; x++) {
                combat.initializeEntity(commonEntity, stage1.numOfMonsters);
                totalMonsters-= x;
                System.out.println(" " + totalMonsters+" monsters left");
                totalMonsters+= x;
            } */
            for (x = 0; x <= totalMonsters; x++) { // Loop for multiple monsters
                String[] commonEntity = {stage1.monsters[0], stage1.monsters[1]}; // Initializer for common enemies
                combat.initializeEntity(commonEntity, stage1.numOfMonsters); // Give values to Combat class
                combat.combatMode(); // Combat method

                // Letting the player know how many monsters are left
                totalMonsters-= x;
                System.out.println(" " + totalMonsters+" monsters left");
                totalMonsters+= x;
                }

                // Boss Monster
                System.out.println(" Proceeding to boss fight");
                dialogues.delay(1);
                Monsters HobGoblin = new HobGoblin();
                combat.setEntity(HobGoblin);
                combat.combatMode();
                System.out.println(" Congratulations!!! You have defeated the boss monster!!!");
                dialogues.delay(2);

                // Cliche ending
                System.out.println(" To be continued...");
            }
    }
}