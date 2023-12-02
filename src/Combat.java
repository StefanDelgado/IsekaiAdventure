import java.util.Scanner;
import monsters.*;
import java.lang.Math;
public class Combat {
    static Scanner input = new Scanner(System.in);



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
    private   String pJob;
    private   int plvl;
    private int pExp;
    protected int pAttack;
    protected int pDefence;
    protected int cPlayerHP;
    protected int cPlayerMP;
    protected int cPlayerSP;
    // <------------- Entity variables -------------> \\
    private   String eName;
    private String eJob;
    private int elvl;
    private int exp;
    protected int cEntityHP;
    protected int cEntityMP;
    protected int cEntitySP;
    protected int cEntityAttack;
    protected int cEntityDefence;


    public Combat(Player uPlayer){
        this.pname    = uPlayer.getName();
        this.pJob = uPlayer.getJob();
        this.plvl = uPlayer.baseLevel;
        this.pExp = uPlayer.experience;
        this.pHP      = uPlayer.getHp();
        this.pSP      = uPlayer.getSp();
        this.pMP      = uPlayer.getMp();
        this.pAttack = uPlayer.getAtk();
        this.pDefence = uPlayer.getDef();
        this.cPlayerHP = pHP;
        this.cPlayerMP = pMP;
        this.cPlayerSP = pSP;
    }
    public void setEntity(Monsters monsters){
        this.eName = monsters.getName();
        this.eJob = monsters.getJob();
        this.exp = monsters.getExperience();
        this.eHP      = monsters.getHp();
        this.eSP      = monsters.getSp();
        this.eMP      = monsters.getMp();
        this.cEntityAttack = monsters.getAtk();
        this.cEntityDefence = monsters.getDef();
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
        System.out.println(" Job : " + pJob);
        System.out.println(" Level : " + plvl);
        System.out.println(" HP  : " + pHP);
        System.out.println(" MP  : " + pMP);
        System.out.println(" SP  : " + pSP);
        System.out.println(" ATK : " + pAttack);
        System.out.println(" DEF : " + pDefence);
    }
    public void examine(){
        System.out.println(" Enemy Status: ");
        System.out.println(" Name: " + eName);
        System.out.println(" Job: " + eJob);
        System.out.println(" Level: " + elvl);
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
                System.out.println(" " + eName + " attacks " + pname);
                System.out.println(" "+ pname + " took " + cEntityAttack + " damage!!");
                if (pDefence < cEntityAttack) {
                    cPlayerHP = cPlayerHP - (cEntityAttack - pDefence);
                } else {
                    cPlayerHP -= cEntityAttack;
                }
                break;
            case 2:
                System.out.println(" " + eName + " Choose to defend ");
        }
    }
    public void setPlayerStats(int[] playerStats, boolean hadLevelUp){
        this.pAttack = playerStats[0];
        this.pDefence = playerStats[1];
        this.pHP = playerStats[2];
        this.pMP = playerStats[3];
        this.pSP = playerStats[4];
        if (hadLevelUp) {
            this.cPlayerHP = pHP;
            this.cPlayerMP = pMP;
            this.cPlayerSP = pSP;
            System.out.println(" Player status has been Restored due to level up.");
        }
    }
    public void CombatMode() {
        Player uPlayer = new Player();
        Level level = new Level();

        System.out.println(" ");
        System.out.println(" You have entered in combat");
        delay(1);
        System.out.println(" Prepare yourself brave Hero!!!");
        System.out.println(" ");
        delay(2);
        System.out.println(" A "+ eName +" appeared");


        while (loop < combatLoop) {
            int[] playerStats= {pAttack, pDefence, pHP, pMP, pSP };
            delay(2);
            System.out.println(" ");
            System.out.println(" Your stats: HP (" + cPlayerHP + "/" + pHP + ") MP (" + cPlayerMP + "/" + pMP + ") SP (" + cPlayerSP + "/" + pSP + ")" );

            System.out.println(eName + " stats: HP (" + cEntityHP + "/" + eHP + ") MP (" + cEntityMP + "/" + eMP + ") SP (" + cEntitySP + "/" + eSP + ")" );
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
                    System.out.println(" "+ eName +" took " + pAttack + " damage");
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
                System.out.println(" You have defeated " + eName + " !!!");
                System.out.println(" You have obtained " + exp + " EXP");
                delay(2);
                pExp += exp;

                level.lvlExperience(pExp, plvl, playerStats);
                this.plvl = level.getLevel();
                setPlayerStats(level.getPlayerStats(), level.getHadLevelUp());
                delay(2);
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
