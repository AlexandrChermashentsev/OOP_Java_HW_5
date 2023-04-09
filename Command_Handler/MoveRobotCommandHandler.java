package Seminar_5.lesson5.Command_Handler;

import java.util.UUID;

import Seminar_5.lesson5.PositionException;
import Seminar_5.lesson5.RobotMap;

public class MoveRobotCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "mr";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        UUID robotId = UUID.fromString(args[0]);
        
        RobotMap.Robot robotById = map.findRobotById(robotId);
        if (robotById != null) {
            try {
                robotById.move();
                System.out.println(robotById);
            } catch (PositionException e) {
                System.out.println("Не удалось переместить робота: " + e.getMessage());
            }
        }
    }
    
}
