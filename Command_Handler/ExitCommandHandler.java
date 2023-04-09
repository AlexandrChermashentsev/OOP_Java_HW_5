package Seminar_5.lesson5.Command_Handler;

import Seminar_5.lesson5.Controller;
import Seminar_5.lesson5.RobotMap;

public class ExitCommandHandler implements CommandHandler {
    
    @Override
    public String commandName() {
        return "exit";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        Controller.flag = false;
    }
    
}
