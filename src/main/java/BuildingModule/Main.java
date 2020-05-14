package BuildingModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile","C:\\Users\\КОМП\\IdeaProjects\\hwBuildingOOP\\src\\main\\resources\\log4j2.xml");
        Logger logger= LogManager.getLogger();
        Building building=new Building("Building1");

        try {
            building.addRoom("Room1",100,3);
        } catch (IlluminanceTooMuchException e) {
            logger.error(" IlluminanceTooMuchException");

        }
        try {
            building.addRoom("Room2",150,1);
        } catch (IlluminanceTooMuchException e) {
            logger.error("IlluminanceTooMuchException");

        }


        try {
            building.getRoom("Room1").add(new Table("Office Table",2,3));
        } catch (SpaceUsageTooMuchException e) {
            logger.error("SpaceUsageTooMuchException");

        }

        try {
            building.getRoom("Room1").add(new Table("Kitchen Table",4));
        } catch (SpaceUsageTooMuchException e) {
            logger.error("SpaceUsageTooMuchException");

        }
        try {
            building.getRoom("Room1").add(new Chair("Guest's Chair",5));
        } catch (SpaceUsageTooMuchException e) {
            logger.error("SpaceUsageTooMuchException");

        }
        try {
            building.getRoom("Room1").add(new Chair("Entrance Chair",1,3));
        } catch (SpaceUsageTooMuchException e) {
            logger.error("SpaceUsageTooMuchException");

        }
        try {
            building.getRoom("Room1").add(new Lamp(150));
        } catch (IlluminanceTooMuchException e) {
            logger.error("IlluminanceTooMuchException");

        } catch (IlluminanceTooFewException e) {
            logger.error("IlluminanceTooFewException");
        }
        try {
            building.getRoom("Room1").add(new Lamp(200));
        } catch (IlluminanceTooMuchException e) {
            logger.error("IlluminanceTooMuchException");

        } catch (IlluminanceTooFewException e) {
            logger.error("IlluminanceTooFewException");
        }
        try {
            building.getRoom("Room2").add(new Table("New Table",1,3));
        } catch (SpaceUsageTooMuchException e) {
            logger.error("SpaceUsageTooMuchException");

        }

        building.showAllRooms();

        building.describe();





    }
}
