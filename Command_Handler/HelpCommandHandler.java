package Seminar_5.lesson5.Command_Handler;

import Seminar_5.lesson5.HelpTable;
import Seminar_5.lesson5.RobotMap;

public class HelpCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "help";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        HelpTable.HelpTable();
    }
    
}
