
public interface Stat {
    String name ="";
    int baseLevel = 1;
    int experience = 1;
    String job = "";
    int atk = 1;
    int def = 1;
    int hp = 10;
    int mp = 10;
    int sp = 10;
    default String getName() {
        return this.name;
    }

    default String getJob() {
        return this.job;
    }

    default int getHp() {
        return this.hp;
    }

    default int getMp() {
        return this.mp;
    }

    default int getSp() {
        return this.sp;
    }

    default int getAtk() {
        return this.atk;
    }
    default int getDef() {
        return this.def;
    }
}
