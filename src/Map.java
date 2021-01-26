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

    public Map()
    {
        createRooms();

    }

    private void createRooms()
    {

        createOutsideRoom();

        createTheatre();

        createPub();

        createLab();

        createOffice();

        createCarPark();

        createGym();

        createCafe();

        createBasement();

        startRoom = outside;  // start game outside
    }

    private void createOffice() {
        office = new Room("in the computing admin office", null);
        office.setExit("west", lab);
        office.setExit("south", basement);
    }

    private void createLab() {
        lab = new Room("in a computing lab", null);
        lab.setExit("north", outside);
        lab.setExit("east", office);
        lab.setExit("west", cafe);
    }

    private void createPub() {
        pub = new Room("in the campus pub",null);
        pub.setExit("east", outside);
        pub.setExit("north", gym);
        pub.setExit("south", cafe);
    }

    private void createTheatre() {
        theater = new Room("in a lecture theater", Items.getPOPCORN());
        theater.setExit("west", outside);
    }

    private void createOutsideRoom() {
        // create the rooms
        outside = new Room("outside the main entrance of the university",null);
        // initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("north", carPark);
    }


    public void createCarPark()
    {
        carPark = new Room("outside in the car park", null);
        carPark.setExit("south", outside);
    }

    public void createGym()
    {
        gym = new Room("you are at the gym", Items.getWATERBOTTLE());
        gym.setExit("south",pub);
    }

    public void createCafe()
    {
        cafe = new Room("you are at the cafe", Items.getKEYS());
        cafe.setExit("north",pub);
        cafe.setExit("west",lab);
    }
    public void createBasement()
    {
        basement = new Room("you are at the basement", Items.getTREASURE());
        basement.setExit("north",office);
    }
    public Room getStartRoom()
    {
        return startRoom;
    }
}

