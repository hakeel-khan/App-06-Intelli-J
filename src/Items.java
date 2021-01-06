public class Items
{
    private static final Item POPCORN= new Item("popcorn","Please pick up the item and your score will increase");
    private static final Item WATERBOTTLE= new Item("water-bottle","Please pick up the item and your score will increase");
    private static final Item KEYS= new Item("keys","Please pick up the item and your score will increase, and you can unlock the office door");
    private static final Item TREASURE= new Item("treasure","Congratulations you have won the game");

    public static Item getPOPCORN() {
        return POPCORN;
    }

    public static Item getWATERBOTTLE() {
        return WATERBOTTLE;
    }

    public static Item getKEYS() {
        return KEYS;
    }

    public static Item getTREASURE() {
        return TREASURE;
    }
}

