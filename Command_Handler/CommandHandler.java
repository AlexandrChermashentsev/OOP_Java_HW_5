package Seminar_5.lesson5.Command_Handler;

import Seminar_5.lesson5.RobotMap;

public interface CommandHandler {
    
    String commandName();

    void handleCommand(RobotMap map, String[] args);

}
