package test1;

public class test1 {
    int roll;
    String name;

    test1 (String n,roll r)
    {
        this.roll=r;
        this.name=n;
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

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
