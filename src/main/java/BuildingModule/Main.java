package BuildingModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile","C:\\Users\\КОМП\\IdeaProjects\\hwBuildingOOP\\src\\main\\resources\\log4j2.xml");
        Logger logger= LogManager.getLogger();
        Building building=new Building("Building1");

        building.addRoom("Room1",100,3);
        building.addRoom("Room2",150,1);


        building.getRoom("Room1").add(new Table("Office Table",2,3));
        building.getRoom("Room1").add(new Table("Kitchen Table",4));
        building.getRoom("Room1").add(new Chair("Guest's Chair",5));
        building.getRoom("Room1").add(new Chair("Entrance Chair",1,3));
        building.getRoom("Room1").add(new Lamp(150));
        building.getRoom("Room1").add(new Lamp(200));
        building.getRoom("Room2").add(new Table("New Table",1,3));

        building.showAllRooms();
        System.out.println(building.getRoom("Room1").calcOccupiedArea());
        building.describe();





    }
}
