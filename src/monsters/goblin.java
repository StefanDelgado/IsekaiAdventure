package monsters;

public class goblin extends Monsters implements Stat{

    private final String name ="Goblin";
    private final int experience = 5;
    private final String job = "Monster";
    private final int atk = 8;
    private final int def = 5;
    private final int hp = 20;
    private final int mp = 10;
    private final int sp = 10;

    public goblin(){
    super("Goblin");
    }

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
        int baseLevel = 1;
        return baseLevel;}
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
