public class Player extends Combat implements Stat{
    private String name ="";
    protected int baseLevel;
    protected int experience;
    protected String job;
    protected int atk = 5; // Attack power
    protected int def = 5; // Defence power
    protected int hp = 100; // Hit points
    protected int mp = 10; // Mana points
    protected int sp = 10; // Stamina points


    public Player() {
    super();
    } // Player constructor

    // Get and set for player name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) { // WIP //
        this.job = job;
    }

    // get Interface
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
