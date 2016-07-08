package People;

public class Man
{
    enum Sex  { MALE, FEMALE};
    private String name;
    private int older;
    private Sex sex;
    private double weight;

    public Man(Sex sex)
    {
        this.sex = sex;
    }

    public Man(String name, int older, Sex sex, double weight)
    {
        this.name = name;
        this.older = older;
        this.sex = sex;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOlder() {
        return older;
    }

    public void setOlder(int older) {
        this.older = older;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
