package monsters;
public class slime extends Monsters {
    //<------- HobGoblin stats ------->
    private String name ="Slime";
    private final int experience = 3; // How much exp can be obtained
    private final String job = "Monster";
    private final int atk = 1; // Attack power
    private final int def = 1; // Defence power
    private final int hp = 10; // Hit-points
    private final int mp = 10; // Mana-points
    private final int sp = 10; // Stamina-points

    // Constructor
    public slime(){
    super("Slime");
    }
    // Getter method for stats
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
