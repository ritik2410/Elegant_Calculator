package master;

public class master {
    int roll;
    String name;
    master(String a, int r)
    {
        this.name=a;
        this.roll=r;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
