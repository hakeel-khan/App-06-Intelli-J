import javax.swing.*;
import java.util.ArrayList;

/**
 *
 */

public class Player
{

    private final String name;
    private int score;
    private ArrayList<Item> inventory;


    public Player(String name)
    {
        this.name = name;
        score = 0;
        inventory = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Item> getInventory()
    {
        return inventory;
    }

    public void addItem(Item item)
    {
        if (item != null) {
            inventory.add(item);
        }
        else {
            System.out.println("Item is null");
        }
    }

    public int getScore()
    {
        return score;
    }
    public void resetScore()
    {
        score = 0;
    }

    public void increaseScore(int amount) {
        if (amount > 0) {
            score += amount;
            System.out.println("your score is:" + score);
        }
        else {
            System.out.println("the amount must be more than or equal to 0.");
        }

    }

    public Item findItem(String itemName) {
        for (Item item : inventory) {
            if (itemName.equals(item.getItemName()))
                return item;

        }
            return null;
    }

    public void print()
    {
        System.out.println("Player :" + name);
        System.out.println();
    }

}

