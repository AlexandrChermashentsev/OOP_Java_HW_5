package Seminar_5.lesson5.Command_Handler;

import java.util.UUID;
import Seminar_5.lesson5.RobotMap;

public class ChangeDirectionCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "cd";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        UUID robotId = UUID.fromString(args[0]);
        RobotMap.Direction newDirection = RobotMap.Direction.valueOf(args[1]);

        RobotMap.Robot robotById = map.findRobotById(robotId);
        if (robotById != null) {
            robotById.changeDirection(newDirection);
        } else {
            System.out.println("Робот с идентификатором " + robotId + " не найден");
        }
    }

}