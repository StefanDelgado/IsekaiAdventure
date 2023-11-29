package monsters;

public interface Stat {
    String name =" ";
    int baseLevel = 1;
    String job = null;
    int atk = 1;
    int def = 1;
    int hp = 10;
    int mp = 10;
    int sp = 10;
    default String getName(){
        return this.name;
    }
    String getJob();
    int getHp();
    int getMp();
    int getSp();
    int getAtk();
    int getDef();
}
