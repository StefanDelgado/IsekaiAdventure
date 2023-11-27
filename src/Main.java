import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static void welcome(){
        System.out.println(" Humbles presents");
        dialogues.delay(2);
        System.out.println(" ");
        System.out.println(" **********************");
        System.out.println(" Isekai Adventure");
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
            //welcome();
            gloop++;
            String start = input.nextLine();

            if (start.equals("x") || start.equals("X")) {
                System.out.println(" Adventure shutting down...");
                x = gloop;
                break;

            } else {
                //dialogues.goddess1();

                String pName = input.nextLine();
                uPlayer.setName(pName);
                dialogues.goddess2(pName);

            }
        }
    }
}