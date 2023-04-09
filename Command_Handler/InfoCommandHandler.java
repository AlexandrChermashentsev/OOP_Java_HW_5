package Seminar_5.lesson5.Command_Handler;

import Seminar_5.lesson5.RobotMap;
import Seminar_5.lesson5.RobotMap.Robot;

public class InfoCommandHandler implements CommandHandler {


    @Override
    public String commandName() {
        return "info";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        for (Robot r : map.getMapRobots().values()) {
            System.out.println(r);
        }
    }
    
}
