package Stages;
public abstract class Stage {
    public int[] numOfMonsters;
    private final String stageName;
    public String [] monsters;

    public Stage(String stageName, int numOfMonsters) {
        this.stageName = stageName;
        monsters = new String[numOfMonsters];
        this.numOfMonsters = new int[numOfMonsters];
    }
    // Setting Stage name
    abstract void setStageName(String name);

    // Getting Stage name
    String getStageName(){
        return stageName;
    }
    // Setting monsters
    public abstract void setMonsters();
    public void setMonsters(String[] monsters, int[] numOfMonsters) {
        this.monsters = monsters;
        this.numOfMonsters = numOfMonsters;
    }
    public void welcomeStage(){
        System.out.println(" *******************************");
        System.out.println(" Welcome to the " + getStageName());
        System.out.println(" Monsters: ");
        for (int x = 0; x < monsters.length;){
            System.out.println(" " + monsters[x] + " - " + numOfMonsters[x]);
            x++;
        }
        System.out.println(" *******************************");
    }

}
