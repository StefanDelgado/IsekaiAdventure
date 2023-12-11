package monsters;

public abstract class Monsters implements Stat{
    //<-------Monster stats ------->
    String name = " Monsters name";
    String job;
    int baseLevel;
    int experience;
    int atk;
    int def;
    int hp;
    int mp;
    int sp;

    public Monsters(String name) {
        this.name = name;
    } // get monster name

    public Monsters() { // default constructor

    }

    public void setName(String name){
        this.name = name;
    } // set monster name

    public String getName(){ // get monster name
        return name;
    }
    // Getter method for stats
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
