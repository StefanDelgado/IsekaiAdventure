package Stages;
public abstract class Stage {
    // <------- Stage variables ------->
    public int[] numOfMonsters;
    private final String stageName;
    public String [] monsters;

    public Stage(String stageName, int numOfMonsters) {
        this.stageName = stageName;
        monsters = new String[numOfMonsters];
        this.numOfMonsters = new int[numOfMonsters];
    } // Stage Constructor
    // Setting Stage name
    abstract void setStageName(String name); // abstract for setting Stage name
    public abstract void setMonsters(); // Abstract for setting monster for stage

    // Getting Stage name
    String getStageName(){
        return stageName;
    } // get stage name
    // Setting monsters

    public void setMonsters(String[] monsters, int[] numOfMonsters) {
        this.monsters = monsters;
        this.numOfMonsters = numOfMonsters;
    } // Setting monster type and how many
    public void welcomeStage(){
        System.out.println(" *******************************");
        System.out.println(" Welcome to the " + getStageName());
        System.out.println(" Monsters: ");
        for (int x = 0; x < monsters.length;){
            System.out.println(" " + monsters[x] + " - " + numOfMonsters[x]);
            x++;
        }
        System.out.println(" *******************************");
    } // Introduction for Stage what monsters types and how many

}
