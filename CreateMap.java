package Seminar_5.lesson5;

import java.util.Arrays;

public class CreateMap {

    public static RobotMap createMap (String command, RobotMap map){

        if (command.startsWith("cm")) {         
            String[] split = command.split(" "); // [create-map 3 5]
            String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [3 5]
                
            try {
                map = new RobotMap(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
                Controller.flag = false;
                return map;
            } catch (IllegalArgumentException e) {
                System.out.println("При создании карты возникло исключение: " + e.getMessage() + "." +
                " Попробуйте еще раз");
            }
        } else {
            System.out.println("Команда не найдена. Попробуйте еще раз");
        }
        return null;
    }
}
