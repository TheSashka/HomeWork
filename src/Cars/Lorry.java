package Cars;

public class Lorry extends Car
{
    private int capacity;
    public Lorry(String trademark, double weight, int power)
    {
        super(trademark, weight, power);
        capacity = 0;
    }

    public Lorry(String trademark, double weight, int power, int capacity)
    {
        super(trademark, weight, power);
    }

    public Lorry()
    {
        super();
        capacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTrademark(String trademark)
    {
        this.trademark = trademark;
    }
}
