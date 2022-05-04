package Branch;

public class sample_branch_b1 {
    String name,id;
    float cgpa;

    sample_branch_b1(String s, String s1, float f)
    {
        this.name=s;
        this.id=s1;
        this.cgpa=f;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
