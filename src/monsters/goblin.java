package monsters;

public class goblin extends Monsters implements Stat{
    //<------- Goblin stats ------->
    private final String name ="Goblin";
    private final int experience = 5; // How much exp can be obtained
    private final String job = "Monster";
    private final int atk = 8; // Attack power
    private final int def = 5; // Defence power
    private final int hp = 20; // Hit-points
    private final int mp = 10; // Mana-points
    private final int sp = 10; // Stamina-points

    public goblin(){
    super("Goblin");
    } // passing monster name to parent class

    // Getter method for stats
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getJob() {
        return this.job;
    }
    @Override
    public int getBaseLevel(){
        return 1;}
    @Override
    public int getExperience(){return this.experience;}

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getMp() {
        return this.mp;
    }

    @Override
    public int getSp() {
        return this.sp;
    }

    @Override
    public int getAtk() {
        return this.atk;
    }

    @Override
    public int getDef() {
        return this.def;
    }
}
