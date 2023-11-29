package monsters;
public class slime implements Stat {
    private String name ="Slime";
    protected int baseLevel;
    protected String job;
    protected int atk = 1;
    protected int def = 1;
    protected int hp = 10;
    protected int mp = 10;
    protected int sp = 10;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getJob() {
        return this.job;
    }

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
