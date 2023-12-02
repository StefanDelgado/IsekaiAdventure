import java.lang.Math;
public class Level {
    int level;
    int experience;
    int expNeeded;
    int [] playerStats = new int[5];
    boolean hadLevelUp;

    Level(){
        level = 1; // Set the base level to 1
    }

    public void lvlExperience(int exp, int lvl, int[] playerStats){
        int limitExp = 10 * (int) Math.pow(2, lvl);

        this.experience = exp;

        if (experience >= limitExp) {
            lvl++;
            System.out.println("You have leveled up!!!");
            System.out.println("You are now Level " + lvl);
            expNeeded = exp - limitExp;
            setPlayerStats(playerStats);
            hadLevelUp = true;
        } else {
            expNeeded = limitExp - exp;
            System.out.println("You need " + expNeeded + " more to level up");
            hadLevelUp = false;
        }


        this.level = lvl;
    }
    public void setPlayerStats(int[] playerStats){
        playerStats[0] += 5; // Attack
        playerStats[1] += 3; // Defence
        playerStats[2] += 10; // HP
        playerStats[3] += 5; // MP
        playerStats[4] += 5; // SP
        int loop = 5, x =0;
        while (x < loop) {
            this.playerStats[x] = playerStats[x];
            x++;
        }
    }
    public int getLevel() {
        return level;
    }
    public int[] getPlayerStats(){
        return playerStats;
    }
    public boolean getHadLevelUp(){
        return hadLevelUp;
    }
}
