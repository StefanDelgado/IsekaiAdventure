package Stages;
import monsters.*;
public class Forest extends Stage{
    private String stageName = "Forest"; // fixed name for stage

    // Forest constructor
    public Forest(){
        super("Forest ", 2);
        //String[] monsters = new String[2];
        setMonsters();
    }

    // set stage name
    void setStageName(String name){
        this.stageName = name;
    }

    String getStageName(){
        return stageName;
    } // get stage name

    // Setting stage monsters
    @Override
    public void setMonsters() {
        Monsters slime = new slime();
        Monsters goblin = new goblin();
        Monsters boss = new HobGoblin();
        String[] monsterNames = {slime.getName(), goblin.getName(), boss.getName()};
        int[] numOfMonsters = {5, 5, 1};
        super.setMonsters(monsterNames, numOfMonsters);
    }
}
