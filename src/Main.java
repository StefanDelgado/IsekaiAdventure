import java.util.Scanner;
import monsters.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static void welcome(){
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
        dialogues message = new dialogues();
        Player uPlayer = new Player();
        JobClass jobclass = new JobClass();
        Monsters monsters = new Monsters();
        Level level = new Level();



        int gloop = 10;
        int x = 0;

        while (x < gloop) {
            //welcome();
            gloop++;
            String start = input.nextLine();

            if (start.equals("x") || start.equals("X")) {
                System.out.println(" Adventure shutting down...");
                x = gloop;
                break;

            } else {
                // Introduction
                //dialogues.goddess1();

                // Player name
                System.out.print(" Enter name: ");
                String pName = input.nextLine();
                System.out.print(" ");
                uPlayer.setName(pName);

                // Player Job
                //dialogues.goddess2(uPlayer);
                System.out.print("Enter Job : ");
                int pJob = input.nextInt();
                System.out.print(" ");
                uPlayer.setJob(jobclass.mainJob(pJob));

                // Player embark
                //dialogues.goddess3(uPlayer);

                // Test Combat
                System.out.println("Entering Combat Tutorial");
                System.out.print(" ");
                Combat combat = new Combat(uPlayer);
                combat.setEntity(monsters.setMonster());
                combat.CombatMode();
                int y =0;
                int monsterLoop = 2;
                while(y < monsterLoop){
                    y++;
                    System.out.println("Another monster appeared!!! ");
                    combat.setEntity(monsters.setMonster());
                    combat.CombatMode();
                }
                break;
            }
        }
    }
}