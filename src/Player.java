public class Player implements Stat{
    private String name;
    protected int Level;
    protected String job;

    public Player() {

    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int level() {
        return 0;
    }

    @Override
    public String job() {
        return null;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defence() {
        return 0;
    }
}
