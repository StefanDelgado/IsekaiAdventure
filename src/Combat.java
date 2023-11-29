import java.util.Scanner;
import monsters.slime;
import java.lang.Math;
public class Combat {
    static Scanner input = new Scanner(System.in);
    private   String name;
    private   String job;
    private   int combatLoop = 10;
    private   int loop = 0;
    private int action;

    // <------------- Stat variables -------------> \\
    protected int pHP;
    protected int pMP;
    protected int pSP;
    protected int eHP;
    protected int eMP;
    protected int eSP;
    // <------------- Player variables -------------> \\
    protected String pname;
    protected int pAttack;
    protected int pDefence;
    protected int cPlayerHP;
    protected int cPlayerMP;
    protected int cPlayerSP;
    // <------------- Entity variables -------------> \\
    protected int cEntityHP;
    protected int cEntityMP;
    protected int cEntitySP;
    protected int cEntityAttack;
    protected int cEntityDefence;

    public Combat(Player uPlayer){
        this.pname    = uPlayer.getName();
        this.job     = uPlayer.getJob();
        this.pHP      = uPlayer.getHp();
        this.pSP      = uPlayer.getSp();
        this.pMP      = uPlayer.getMp();
        this.pAttack = uPlayer.getAtk();
        this.pDefence = uPlayer.getDef();
        this.cPlayerHP = pHP;
        this.cPlayerMP = pMP;
        this.cPlayerSP = pSP;
    }
    public void setEntity(slime Slime){
        this.name    = Slime.getName();
        this.job     = Slime.getJob();
        this.eHP      = Slime.getHp();
        this.eSP      = Slime.getSp();
        this.eMP      = Slime.getMp();
        this.cEntityAttack = Slime.getAtk();
        this.cEntityDefence = Slime.getDef();
        this.cEntityHP = eHP;
        this.cEntityMP = eMP;
        this.cEntitySP = eSP;
    }
    public Combat() {

    }
    public static void delay(int secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void showStatus(){
        System.out.println(" Your Status: ");
        System.out.println(" Name: " + pname);
        System.out.println(" Job : " + job);
        System.out.println(" HP  : " + pHP);
        System.out.println(" MP  : " + pMP);
        System.out.println(" SP  : " + pSP);
        System.out.println(" ATK : " + pAttack);
        System.out.println(" DEF : " + pDefence);
    }
    public void examine(){
        System.out.println(" Enemy Status: ");
        System.out.println(" Name: " + name);
        System.out.println(" HP  : " + eHP);
        System.out.println(" MP  : " + eMP);
        System.out.println(" SP  : " + eSP);
        System.out.println(" ATK : " + cEntityAttack);
        System.out.println(" DEF : " + cEntityDefence);
    }
    public void entityTurn(){
        int min = 1;
        int max = 3;
        int eAction = (int)(Math.random()*(max-min)+min);

        switch (eAction){
            case 1:
                System.out.println(" " + name + " attacks " + pname);
                System.out.println(" "+ pname + " took " + cEntityAttack + " damage!!");
                if (pDefence < cEntityAttack) {
                    cPlayerHP = cPlayerHP - (cEntityAttack - pDefence);
                } else {
                    cPlayerHP -= cEntityAttack;
                }
                break;
            case 2:
                System.out.println(" " + name + " Choose to defend ");
        }
    }
    public void CombatMode() {
        System.out.println(" ");
        System.out.println(" You have entered in combat");
        delay(1);
        System.out.println(" Prepare yourself brave Hero!!!");
        System.out.println(" ");
        delay(2);
        System.out.println(" A slime appeared");


        while (loop < combatLoop) {
            delay(2);
            System.out.println(" ");
            System.out.println(" Your stats: HP (" + cPlayerHP + "/" + pHP + ") MP (" + cPlayerMP + "/" + pMP + ") SP (" + cPlayerSP + "/" + pSP + ")" );

            System.out.println(" Slime stats: HP (" + cEntityHP + "/" + eHP + ") MP (" + cEntityMP + "/" + eMP + ") SP (" + cEntitySP + "/" + eSP + ")" );
            System.out.println(" What will you do?");
            System.out.println("""
                     1. Attack
                     2. Defend
                     3. Flee
                     4. Show Stats
                     5. Examine
                    """);
            System.out.print(" ");
            action = input.nextInt();
            switch (action){
                case 1:
                    System.out.println(" "+ name +" took " + pAttack + " damage");
                    cEntityHP = cEntityHP - (pAttack - cEntityDefence);
                    break;
                case 2:
                    System.out.print(" " + pname + " is defending");
                    break;
                case 3:
                    System.out.println(" " + pname + " is running away");
                    break;
                case 4:
                    showStatus();
                    break;
                case 5:
                    examine();
                    break;
            }
            if (cEntityHP <= 0){
                System.out.println(" You have defeated " + name + " !!!");
                break;
            }
            entityTurn();
            delay(2);
            if(cPlayerHP <= 0) {
                System.out.println(" <---------- Game Over ---------->");
                break;
            }

        }
    }


}
