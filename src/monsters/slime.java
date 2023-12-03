package monsters;
public class slime extends Monsters {
    private String name ="Slime";
    private final int experience = 3;
    private final String job = "Monster";
    private final int atk = 1;
    private final int def = 1;
    private final int hp = 10;
    private final int mp = 10;
    private final int sp = 10;

    public slime(){
    super("Slime");
    }
    public void setName(String name){
        this.name = name;
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
