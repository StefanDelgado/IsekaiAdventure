import java.util.Scanner;
public class dialogues {
    static Scanner input = new Scanner(System.in);
    static Player uPlayer = new Player();
    public static void delay(int secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    static void goddess1(){
        System.out.println(" ");
        System.out.println(" **************************************************");
        System.out.println(" Introduction");
        System.out.println(" **************************************************");
        delay(2);

        System.out.println(" ");

        System.out.println(" You were engulfed in an ethereal light that was like a  ");
        delay(5);
        System.out.println(" rainbow of colors as the realms quickly blended together. You were shrouded  ");
        delay(5);
        System.out.println(" in the gentle warmth of the holy and discovered yourself standing in  ");
        delay(5);
        System.out.println(" an unearthly place as the brilliance gradually subsided. The air ");
        delay(5);
        System.out.println(" itself seemed to vibrate with a mysterious force, and your surroundings appeared to change.");
        delay(5);

        System.out.println(" ");

        System.out.println(" The goddess was glowingly radiant in front of you.");
        delay(5);
        System.out.println(" Her flowing robes appeared to be crafted from the very fabric of fate, ");
        delay(5);
        System.out.println(" and her eyes contained galaxies. There was an eerie calm in the air, and whispers ");
        delay(5);
        System.out.println(" of far-off predictions floated on a light breeze. Her voice resonated like a ");
        delay(3);
        System.out.println(" melody of cosmic harmonies as she spoke.");
        delay(3);

        System.out.println(" ");

        System.out.println(" ???:");
        System.out.println(" My dear child, what is your name?");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" After the illuminating transition, you found yourself standing in the flickering light, your senses taken back by the strange environment. ");
        delay(5);
        System.out.println(" Your eyes eventually adjusted, showing you the wispy form of Isolde in front of you, confused and disoriented.");
        delay(3);

        System.out.println(" ");

        System.out.println(" ???:");
        System.out.println(" I am....");
    }
    static void goddess2(Player uPlayer) {
        System.out.println(" Isolde:");
        System.out.println(" " + uPlayer.getName() + " , mortal who was destined by fate, you stand before me, Isolde, the goddess who governs life and death.");
        delay(3);
        System.out.println(" You have destined to come here for a purpose, not by mistake, but you are the only one who may weave the thread of fate since another world is in peril.");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" " + uPlayer.getName() + ":");
        System.out.println(" (Feeling confuse) Destined? What do you mean?");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        /// *********** I should put something here poor user ignored by Isolde *********** ///

        System.out.println(" ");

        System.out.println(" Isolde:");
        System.out.println(" (Extending her hand) With the gifts I bestow upon you, you shall choose which gift suits you best.");
        delay(3);
        System.out.println("""
                 
                 1. Warrior
                 2. Archer
                 3. Mage
                """);

    }
    static void goddess3(Player uPlayer) {
        System.out.println(" Isolde:");
        System.out.println(" Excellent choice");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" Isolde:");
        System.out.println(" Embrace your destiny, and may your journey be woven into the fabric of a new thread.");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" Isolde:");
        System.out.println(" (Explaining) A connection to the threads of fate, a resonance with the ebb and flow of destiny.");
        delay(2);
        System.out.println(" The air shimmering with an unseen magic shall guide you.");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" Isolde:");
        System.out.println(" You may choose to embark on a new existence in a distant realm, filled with adventures and challenges.");
        delay(3);
        System.out.println(" Alternatively, you can opt for the path to the afterlife, where everything fades into the infinite void. The choice is yours.");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" " + uPlayer.getName() + ":");
        System.out.println(" (Contemplating) Another world? Challenges? I never expected... What should I choose?");
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");

        System.out.println(" Isolde:");
        System.out.println(" The threads of destiny await your decision. Each path leads to a destiny unknown. ");
        delay(3);
        System.out.println(" Choose with gratitude for the chance at redemption, and ponder the diverging paths before you. You are the epic weaver of your own fate, ." + uPlayer.getName());
        System.out.print(" > Enter to continue...");
        input.nextLine();

        System.out.println(" ");
        System.out.println(" The bright light surrounded you again as you made your decision, a breathtaking ");
        System.out.println(" show that went beyond your physical reality. A dazzling swirl formed from the kaleidoscope ");
        System.out.println(" of hues, forming a cosmic portal that urged you to explore the unknown.");
        delay(5);

        System.out.println(" ");
        System.out.println(" The well-known surroundings of the goddess's heavenly kingdom gave way to a vast hall ");
        System.out.println(" decorated with towering arches and finely carved stone within the glowing vortex.");
        System.out.println(" The air shimmered with mystical energy as if the very walls resonated with the magic of your arrival. ");
        delay(5);
        System.out.print(" > Enter to continue...");
        input.nextLine();
        System.out.println("<---------------    Work in Progress   ----------------->");
    }
}
