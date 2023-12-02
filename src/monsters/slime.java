package monsters;
public class slime extends Monsters {
    private String name ="Slime";
    protected int baseLevel = 1;
    protected int experience = 12;
    protected String job = "Monster";
    protected int atk = 1;
    protected int def = 1;
    protected int hp = 10;
    protected int mp = 10;
    protected int sp = 10;

    slime(String name, String job, int baseLevel, int experience, int atk, int def, int hp, int mp, int sp) {
        super(name, job, baseLevel, experience, atk, def, hp, mp, sp);
    }
    slime(){

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
    public int getBaseLevel(){return this.baseLevel;}
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
