import java.util.Scanner;
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


        int gloop = 10;
        int x = 0;

        while (x < gloop) {
            welcome();
            gloop++;
            String start = input.nextLine();

            if (start.equals("x") || start.equals("X")) {
                System.out.println(" Adventure shutting down...");
                x = gloop;
                break;

            } else {
                // Introduction
                dialogues.goddess1();

                // Player name
                String pName = input.nextLine();
                uPlayer.setName(pName);

                // Player Job
                dialogues.goddess2(uPlayer);
                String pJob = input.nextLine();

                dialogues.goddess3(uPlayer);
            }
        }
    }
}