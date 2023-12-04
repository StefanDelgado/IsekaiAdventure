package monsters;

public class HobGoblin extends Monsters implements Stat{
    String name ="HobGoblin";
    String job = "Boss";
    int baseLevel = 5;
    int experience = 30;
    int atk = 10;
    int def = 10;
    int hp = 200;
    int mp = 5;
    int sp = 20;
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
