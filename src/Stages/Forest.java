package Stages;
import monsters.*;
public class Forest extends Stage{
    private String stageName = "Forest";

    public Forest(){
        super("Forest ", 2);
        //String[] monsters = new String[2];
        setMonsters();
    }
    void setStageName(String name){
        this.stageName = name;
    }

    String getStageName(){
        return stageName;
    }
    @Override
    public void setMonsters() {
        Monsters slime = new slime();
        Monsters goblin = new goblin();
        Monsters boss = new HobGoblin();
        String[] monsterNames = {slime.getName(), goblin.getName(), boss.getName()};
        int[] numOfMonsters = {10, 5, 1};
        super.setMonsters(monsterNames, numOfMonsters);
    }
}
