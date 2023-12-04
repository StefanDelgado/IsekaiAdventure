import java.lang.Math;
public class Level extends Combat {
    // <--------- Initiate Variables --------->
    private int level;
    private final int [] playerStats = new int[5];
    private boolean hadLevelUp;
    int loop = 5, x =0;

    Level(){} // Level Constructor

    // Experience Checker
    public void lvlExperience(int exp, int lvl, int[] playerStats){
        int limitExp = 10 * (int) Math.pow(2, lvl - 1);
        int expNeeded;
        if (exp >= limitExp) { // If experience exceeds limit
            lvl++;
            System.out.println(" You have leveled up!!!");
            System.out.println(" You are now Level " + lvl);
            setPlayerStats(playerStats);
            hadLevelUp = true;
        } else { // if experience did not reach the limit
            expNeeded = limitExp - exp;
            System.out.println(" You need " + expNeeded + " more to level up");
            while (x < loop) { // Loop for initializing variables to combat class
                this.playerStats[x] = playerStats[x];
                x++;
            }
            hadLevelUp = false;
        }
        this.level = lvl; // return level
    }
    public void setPlayerStats(int [] playerStats){
        playerStats[0] += 5; // Attack
        playerStats[1] += 3; // Defence
        playerStats[2] += 10; // HP
        playerStats[3] += 5; // MP
        playerStats[4] += 5; // SP
        while (x < loop) {
            this.playerStats[x] = playerStats[x];
            x++;
        }
    } // Set Player stats after level up
    public int getLevel() {
        return level;
    } // get new player level
    public int[] getPlayerStats(){
        return playerStats;
    } // get new player level up stats
    public boolean getHadLevelUp(){
        return hadLevelUp;
    } // conditions if player had leveled up
}
