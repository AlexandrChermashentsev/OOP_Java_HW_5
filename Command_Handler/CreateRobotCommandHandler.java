package Seminar_5.lesson5.Command_Handler;

import Seminar_5.lesson5.Point;
import Seminar_5.lesson5.PositionException;
import Seminar_5.lesson5.RobotMap;

public class CreateRobotCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "cr";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        try {
            RobotMap.Robot robot =  map.createRobot(new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            System.out.println(robot);
        } catch (PositionException e) {
            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
        }
    }
    
}
