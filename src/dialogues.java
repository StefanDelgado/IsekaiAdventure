public class dialogues {
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

        System.out.println(" You were engulfed in an ethereal light that was like a rainbow of colors as the realms quickly blended together. ");
        delay(7);
        System.out.println(" You were shrouded in the gentle warmth of the holy and discovered yourself standing in an unearthly place as the brilliance gradually subsided. ");
        delay(8);
        System.out.println(" The air itself seemed to vibrate with a mysterious force, and your surroundings appeared to change. ");
        delay(7);

        System.out.println(" ");

        System.out.println(" The goddess was glowingly radiant in front of you.");
        delay(7);
        System.out.println(" Her flowing robes appeared to be crafted from the very fabric of fate, and her eyes contained galaxies.");
        delay(7);
        System.out.println(" There was an eerie calm in the air, and whispers of far-off predictions floated on a light breeze.");
        delay(7);
        System.out.println(" Her voice resonated like a melody of cosmic harmonies as she spoke");
        delay(7);

        System.out.println(" ");

        System.out.println(" ???:");
        System.out.println(" My dear child, what is your name?");
        delay(3);

        System.out.println(" ");
        System.out.println(" ???:");
        System.out.println(" I am....");
    }
    static void goddess2(String name) {
        System.out.println(" Isolde:");
        System.out.println(" " + name + " , mortal of the earthly realm, you stand before Isolde, the goddess who governs life and death.");

    }
}
