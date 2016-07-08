package Cars;

public class Car
{
    protected String trademark;
    private double weight;
    private int power;

    public Car()
    {

    }

    public Car(String trademark, double weight, int power)
    {
        this.trademark = trademark;
        this.weight = weight;
        this.power = power;
    }

    public Car(String trademark, double weight)
    {
        this.trademark = trademark;
        this.weight = weight;
    }

    public String getTrademark() {
        return trademark;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
