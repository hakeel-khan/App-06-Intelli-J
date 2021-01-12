/**
 * Static class Items that creates all items in the game.
 */
public class Items
{
    private Item popcorn;
    private Item waterBottle;
    private Item keys;
    private Item treasure;

    public Items() 
    {
        popcorn = new Item("popcorn","Please pick up the popcorn and your score will increase");
        waterBottle = new Item("water-bottle","Please pick up the water bottle and your score will increase");
        keys = new Item("keys","Please pick up the keys and your score will increase, and you can unlock the office door");
        treasure = new Item("treasure","Please pick up the treasure to win the game");
    }

    public Item getPopcorn() {
        return popcorn;
    }

    public Item getWaterBottle() {
        return waterBottle;
    }

    public Item getKeys() {
        return keys;
    }

    public Item getTreasure() {
        return treasure;
    }
}

