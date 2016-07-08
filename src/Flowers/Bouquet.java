package Flowers;

import java.util.ArrayList;

public class Bouquet
{
    private ArrayList<Flower> flowers;

    public Bouquet()
    {
        flowers = new ArrayList<>();
    }

    public static void main(String []args)
    {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Tulip());
        bouquet.addFlower(new Tulip());
        bouquet.addFlower(new Carnation());
        bouquet.addFlower(new Carnation());
        bouquet.addFlower(new Carnation(85));
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Tulip());
        bouquet.addFlower(new Aster());
        bouquet.addFlower(new Aster());
        bouquet.addFlower(new Aster());
        bouquet.addFlower(new Hydrangea());
        bouquet.addFlower(new Hydrangea());
        bouquet.addFlower(new Hydrangea());
        bouquet.addFlower(new Aster());
        System.out.println(bouquet.getCostOfBouquet());

    }

    public void addFlower(Flower flower)
    {
        flowers.add(flower);
    }

    public int getCostOfBouquet()
    {
        int cost = 0;
        for(Flower flower : flowers)
        {
            cost += flower.getCost();
        }
        return cost;
    }
}
