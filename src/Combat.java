import java.util.*;

import monsters.*;
import java.lang.Math;
public class Combat {

    static Scanner input = new Scanner(System.in);

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
    protected int cPlayerAtk;
    protected int cPlayerDef;
    protected int cPlayerHP;
    protected int cPlayerMP;
    protected int cPlayerSP;

    // <------------- Entity variables -------------> \\
    private   String eName;
    private String eJob;
    private int elvl;
    private int exp;
    private int eAtk;
    private int eDef;
    protected int cEntityAttack;
    protected int cEntityDefence;
    protected int cEntityHP;
    protected int cEntityMP;
    protected int cEntitySP;


    // Default Constructor
    public Combat() {

    }

    // Player Constructor
    public Combat(Player uPlayer){
        this.pname      = uPlayer.getName();
        this.pJob       = uPlayer.getJob();
        this.plvl       = uPlayer.baseLevel;
        this.pExp       = uPlayer.experience;
        this.pHP        = uPlayer.getHp();
        this.pSP        = uPlayer.getSp();
        this.pMP        = uPlayer.getMp();
        this.pAttack    = uPlayer.getAtk();
        this.pDefence   = uPlayer.getDef();
        this.cPlayerAtk = pAttack;
        this.cPlayerDef = pDefence;
        this.cPlayerHP  = pHP;
        this.cPlayerMP  = pMP;
        this.cPlayerSP  = pSP;
    }
    // Initialize Entity
    void initializeEntity(String[] Entity, int[] numOfMonsters){
        Monsters Slime = new slime();
        Monsters Goblin = new goblin();
        int remainingMonsters = 0;
        for (int x = 0; x < Entity.length;) {
            numOfMonsters[x] -= 1;
            if (Entity[x].equals(Slime.getName()) && numOfMonsters[x] > remainingMonsters  ) {
                setEntity(Slime);
                System.out.println(numOfMonsters[x] + " Slime Left");
                break;
            } else if (Entity[x].equals(Goblin.getName()) && numOfMonsters[x] > remainingMonsters) {
                setEntity(Goblin);
                System.out.println(numOfMonsters[x] + " Goblin Left");
                break;
            }
            x++;
        }
        }

    // Setting Entity
    public void setEntity(Monsters monsters){
        this.eName          = monsters.getName();
        this.eJob           = monsters.getJob();
        this.elvl           = monsters.getBaseLevel();
        this.exp            = monsters.getExperience();
        this.eHP            = monsters.getHp();
        this.eSP            = monsters.getSp();
        this.eMP            = monsters.getMp();
        this.eAtk           = monsters.getAtk();
        this.eDef           = monsters.getDef();
        this.cEntityAttack  = eAtk;
        this.cEntityDefence = eDef;
        this.cEntityHP      = eHP;
        this.cEntityMP      = eMP;
        this.cEntitySP      = eSP;
    }

    void resetEntity(){
        this.cEntityAttack  = eAtk;
        this.cEntityDefence = eDef;
    }
    void resetPlayer(){
        this.cPlayerAtk = pAttack;
        this.cPlayerDef = pDefence;
    }
    // Setting player level up stats
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

    // Delay method
    public static void delay(int secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    // Show player status
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

    // Show enemy Status
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

    // Enemy Action
    public void entityTurn(){
        byte min = 1;
        byte max = 3;
        byte eAction = (byte)(Math.random()*(max-min)+min);

        switch (eAction){
            case 1:
                System.out.println(" " + eName + " attacks " + pname);
                if (pDefence < cEntityAttack) {

                    cPlayerHP = cPlayerHP - (cEntityAttack - pDefence);
                } else {
                    cPlayerHP -= cEntityAttack;
                }
                System.out.println(" "+ pname + " took " + cEntityAttack + " damage!!");
                break;
            case 2:
                max = 20;
                byte enemyDefend = (byte)(Math.random()*(max-min)+min);
                System.out.println(" " + eName + " Choose to defend ");
                if(enemyDefend <= 12 && cPlayerAtk > cEntityDefence){
                    System.out.println(" " + eName + " failed defend");
                } else {
                    System.out.println(" " + eName + " successfully defend");
                    cEntityHP += cPlayerAtk - cEntityDefence;
                }
        }
    }
    // Player is alive
    // Main Combat method
    public void CombatMode() {
        Level level = new Level();

        System.out.println(" ");
        System.out.println(" You have entered in combat");
        delay(1);
        System.out.println(" Initiate Combat");
        System.out.println(" ");
        delay(2);
        System.out.println(" A "+ eName +" appeared");


        int combatLoop = 10;
        int loop = 0;
        byte flee = 0;
        while (loop < combatLoop) {
            loop++;

            int[] playerStats= {pAttack, pDefence, pHP, pMP, pSP };
            // Reset Attack and Defence Stats
            resetEntity();
            resetPlayer();
            delay(2);
            System.out.println(" ");
            System.out.println(" What will you do?");
            // Action
            boolean aLoop = true;
            while (aLoop) {
                System.out.println(" Your stats: HP (" + cPlayerHP + "/" + pHP + ") MP (" + cPlayerMP + "/" + pMP + ") SP (" + cPlayerSP + "/" + pSP + ")" );
                System.out.println(" " + eName + " stats: HP (" + cEntityHP + "/" + eHP + ") MP (" + cEntityMP + "/" + eMP + ") SP (" + cEntitySP + "/" + eSP + ")" );
                System.out.println("""
                         ********************************
                         1. Action
                         2. Show Stats
                         3. Examine
                         ********************************
                        """);
                System.out.print(" /> ");
                int action = input.nextInt();
                switch (action) {
                    case 1: // Action
                        System.out.println("""
                                 ********************************
                                 1. Basic Attack  4. Flee
                                 2. Defend        5. Back
                                 3. Items
                                 ********************************
                                """);
                        System.out.print(" /> ");
                        action = input.nextInt();
                        switch (action){
                            case 1: // Attack
                                int cAtk = pAttack - eDef;
                                System.out.println(" " + eName + " took " + cAtk + " damage");
                                if (pAttack > cEntityHP){
                                    cEntityHP = 0;
                                } else {
                                    cEntityHP = cEntityHP - (pAttack - cEntityDefence);
                                }
                                aLoop = false;
                                break;
                            case 2: // Defend
                                System.out.print(" " + pname + " is defending");
                                byte min = 1;
                                byte max = 20;
                                byte playerDefend = (byte) (Math.random() * (max - min) + min);
                                if (playerDefend <= 12) {
                                    System.out.println(" " + pname + " failed defend");
                                } else {
                                    System.out.println(" " + pname + " successfully defend");
                                    cEntityAttack = 0;
                                }
                                aLoop = false;
                                break;
                            case 3: // Items
                                System.out.println("""
                                 ********************************
                                 1. Lesser Health Potion (Restores 10 HP) (Consumes 5 MP)
                                 2. Health Potion (Restores 20 HP) (Consumes 10 MP)
                                 ********************************
                                """);
                                System.out.print(" /> ");
                                action = input.nextInt();
                                switch (action) {
                                    case 1: // Lesser Potion
                                        try {
                                            if (cPlayerMP >= 5) {
                                                cPlayerHP += 10;
                                                cPlayerMP -= 5;
                                                if (cPlayerHP > pHP){
                                                    cPlayerHP = pHP;
                                                }
                                                System.out.println(" " + pname + " used Lesser Health Potion");
                                                System.out.println(" 10 Health restored !!!");
                                            } else {
                                                throw new Exception(" Not enough MP");
                                            }
                                        } catch (Exception e) {
                                            System.out.println(" " + e.getMessage());
                                        }
                                        break;
                                    case 2: // Health Potion
                                        try {
                                            if (cPlayerMP >= 10) {
                                                cPlayerHP += 20;
                                                cPlayerMP -= 10;
                                                if (cPlayerHP > pHP){
                                                    cPlayerHP = pHP;
                                                }
                                                System.out.println(" " + pname + " used Health Potion");
                                                System.out.println(" 20 Health restored !!!");
                                            } else {
                                                throw new Exception(" Not enough mMP");
                                            }
                                        } catch (Exception e) {
                                            System.out.println(" " + e.getMessage());
                                        }
                                        break;
                                }
                                aLoop = false;
                                break;
                            case 4: // Flee
                                System.out.println(" " + pname + " tried to escape");
                                flee++;
                                aLoop = false;
                                break;
                            case 5: // Back
                                break;
                        }
                        break;
                    case 2: // Show Stats
                        showStatus();
                        break;
                    case 3: // Examine Enemy
                        examine();
                        break;
                }
            }
            // Entity defeat line
            if (cEntityHP <= 0){
                System.out.println(" You have defeated " + eName + " !!!");
                System.out.println(" You have obtained " + exp + " EXP");
                delay(2);
                pExp += exp;

                // Space
                System.out.println();
                System.out.println(" ******************************");
                System.out.println();

                // Check experience
                level.lvlExperience(pExp, plvl, playerStats);
                this.plvl = level.getLevel();
                setPlayerStats(level.getPlayerStats(), level.getHadLevelUp());

                // Space
                System.out.println();
                System.out.println(" ******************************");
                System.out.println();
                delay(2);
                break;
            }



            if (flee == 3){
                System.out.println(" You have successfully run away...");
                break;
            }
            // Entity turn to action
            entityTurn();

            delay(2);
            // Game over
            if(cPlayerHP <= 0) {
                System.out.println(" <---------- Game Over ---------->");
                break;
            }
        }
        if (loop == combatLoop){
            System.out.println(" " + eName + " got bored and started to ignore you");
        }
        delay(2);
    }
}
