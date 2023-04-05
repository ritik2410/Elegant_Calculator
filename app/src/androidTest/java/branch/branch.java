package branch;

public class branch{
    int roll;
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    branch (String n, int r)
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
