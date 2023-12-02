package monsters;

public class Monsters implements Stat{
    private String name;
    private String job;
    private int baseLevel;
    private int experience;
    private int atk;
    private int def;
    private int hp;
    private int mp;
    private int sp;
    public Monsters(String name, String job, int baseLevel, int experience, int atk, int def, int hp, int mp, int sp){
    this.name = name;
    this.job = job;
    this.baseLevel = baseLevel;
    this.experience = experience;
    this.atk = atk;
    this.def = def;
    this.hp = hp;
    this.mp = mp;
    this.sp = sp;
    }

    public Monsters() {

    }
    public Monsters setMonster(){
        slime Slime = new slime();
        return Slime;
    }

    public String getName(){

        return this.name;
    }
    public String getJob(){
        return this.job;
    }
    public int getBaseLevel(){
        return this.baseLevel;
    }
    public int getExperience(){
        return this.experience;
    }
    public int getHp(){
        return this.hp;
    }
    public int getMp(){
        return this.mp;
    }
    public int getSp(){
        return this.sp;
    }
    public int getAtk(){
        return this.atk;
    }
    public int getDef(){
        return this.def;
    }
}
