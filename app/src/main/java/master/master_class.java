package master;

public class master_class {
    int roll;
    String name;
    master_class( String a, int r)
    {
        this.name=a;
        this.roll=r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    
}
