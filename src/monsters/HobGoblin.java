package monsters;

public class HobGoblin extends Monsters implements Stat{
    //<------- HobGoblin stats ------->
    String name ="HobGoblin";
    String job = "Boss";
    int baseLevel = 5;
    int experience = 30; // How much exp can be obtained
    int atk = 10; // Attack power
    int def = 10; // Defence power
    int hp = 200; // Hit-points
    int mp = 5; // Mana-points
    int sp = 20; // Stamina-points

    // Getter method for stats
    public String getName() {return this.name;}

    public String getJob() {return this.job;}
    public int getBaseLevel(){return this.baseLevel;}
    public int getExperience(){return this.experience;}

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public int getSp() {
        return this.sp;
    }

    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
}
