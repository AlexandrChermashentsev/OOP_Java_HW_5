package Seminar_5.lesson5;

import java.util.List;
import java.util.Scanner;
import Seminar_5.lesson5.Command_Handler.*;

public class Controller {

    public static boolean flag = true;

    public static void Button(){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду для создания карты:");
        RobotMap map = null;
        while (flag) {
            System.out.println("Чтобы создать карту, надо ввести команду cm цифра цифра");
            String command = sc.nextLine();
            map = CreateMap.createMap(command, map);
        }
            
        List<CommandHandler> handlers = List.of(
            new ChangeDirectionCommandHandler(),
            new CreateRobotCommandHandler(),
            new ExitCommandHandler(),
            new HelpCommandHandler(),
            new InfoCommandHandler(),
            new MoveRobotCommandHandler()
            );
                
        CommandManager commandManager = new CommandManager(map, handlers);
                
                
        System.out.print("\033[H\033[2J");
        HelpTable.HelpTable();
        flag = true;
        while (flag) {
            String command = sc.nextLine();
            commandManager.handleCommand(command);
        }
    }
}

