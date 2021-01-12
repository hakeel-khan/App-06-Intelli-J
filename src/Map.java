public class Map {
    private Room outside;
    private Room theater;
    private Room pub;
    private Room lab;
    private Room office;
    private Room carPark;
    private Room gym;
    private Room cafe;
    private Room basement;
    private Room startRoom;
    private Items items;

    public Map()
    {
        items = new Items();
        createRooms();
        setExits();

    }

    public Room getStartRoom()
    {
        return startRoom;
    }

    private void createRooms()
    {
        outside = new Room("outside the main entrance of the university",null);
        theater = new Room("in a lecture theater", items.getPopcorn());
        pub = new Room("in the campus pub",null);
        lab = new Room("in a computing lab", null);
        office = new Room("in the computing admin office", null);
        carPark = new Room("outside in the car park", null);
        gym = new Room("you are at the gym", items.getWaterBottle());
        cafe = new Room("you are at the cafe", items.getKeys());
        basement = new Room("you are at the basement", items.getTreasure());

        startRoom = outside;  // start game outside
    }

    private void setExits() 
    {
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("north", carPark);

        theater.setExit("west", outside);

        pub.setExit("east", outside);
        pub.setExit("north", gym);
        pub.setExit("south", cafe);

        lab.setExit("north", outside);
        lab.setExit("east", office);
        lab.setExit("west", cafe);

        office.setExit("west", lab);
        office.setExit("south", basement);

        carPark.setExit("south", outside);

        gym.setExit("south",pub);
        
        cafe.setExit("north",pub);
        cafe.setExit("east",lab);
        
        basement.setExit("north",office);
    }
}

