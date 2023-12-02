import javax.xml.namespace.QName;

public class Player extends Combat implements Stat{
    private String name ="";
    protected int baseLevel;
    protected int experience;
    protected String job;
    protected int atk = 10;
    protected int def = 5;
    protected int hp = 100;
    protected int mp = 10;
    protected int sp = 10;


    public Player() {
    super();
    }

    public void setBaseLevel(int lvl){
        lvl = lvl + baseLevel;
        this.baseLevel = lvl;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
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
