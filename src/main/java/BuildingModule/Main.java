package BuildingModule;

public class Main {
    public static void main(String[] args) {
        Building building=new Building("Building1");

        building.addRoom("Room1",100,3);
        building.addRoom("Room2",150,1);

        building.getRoom("Room1").add(new Table("Office Table",2,3));
        building.getRoom("Room1").add(new Table("Kitchen Table",3));
        building.getRoom("Room1").add(new Chair("Guest's Chair",1));
        building.getRoom("Room1").add(new Lamp(150));

        building.showAllRooms();


    }
}
