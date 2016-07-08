package Flowers;

public abstract class Flower
{
    int cost;

    Flower()
    {
        cost = 0;
    }

    Flower(int cost)
    {
        this.cost = cost;
    }
    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
