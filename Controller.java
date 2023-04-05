package Seminar_5.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Seminar_5.lesson5.RobotMap.Direction;


public class Controller {
    private static int index;

    static {
        index = 0;
    }


    public static void Button(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду (в формате: 'cm цифра цифра'), для создания карты:");
        RobotMap map = null;
        RobotMap.Robot robot1 = null;
        RobotMap.Robot robot2 = null;
        RobotMap.Robot robot3 = null;
        Direction direction;

        
        


        while (true) {
            String command = sc.nextLine();
            // if (command.startsWith("create-map")) {
            if (command.startsWith("cm")) {

                String[] split = command.split(" "); // [create-map 3 5]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [3 5]

                try {
                    map = new RobotMap(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При создании карты возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }
        while (true) {
            String command = sc.nextLine();
            System.out.println("Создать робота: 'cr цифра цифра'");
            System.out.println("Передвинуть робота на одну клетку: 'mr id'");
            System.out.println("Повернуть робота: 'cd id'");
            System.out.println("Для выхода: 'q'");

            if (command.startsWith("cr")) {
                // System.out.println("№ робота: 1, 2, 3");
                ;
                String[] split = command.split(" ");
                String[] arguments = Arrays.copyOfRange(split, 1, split.length);
                
                switch (index) {
                    case 0:
                        try {
                            robot1 = map.createRobot(new Point(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
                            System.out.println(robot1);
                        } catch (PositionException e) {
                            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
                        }
                    
                    case 1:
                        try {
                            robot2 = map.createRobot(new Point(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
                            System.out.println(robot2);
                        } catch (PositionException e) {
                            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
                        }

                    case 2:
                        try {
                            robot3 = map.createRobot(new Point(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
                            System.out.println(robot3);
                        } catch (PositionException e) {
                            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
                        }

                    case 3:
                        System.out.println("Хватит роботов");
                    }
                
            } else if (command.startsWith("mr")) {
                String[] split = command.split(" ");
                String[] argument = Arrays.copyOfRange(split, 1, split.length);
                switch (argument[0]) {

                    case "1":
                    if (robot1 != null) {
                        try {
                            robot1.move();
                            System.out.println(robot1);
                        } catch (PositionException e) {
                            System.out.println("Не удалось переместить робота: " + e.getMessage());
                        }
                    }

                    case "2":
                    if (robot2 != null) {
                        try {
                            robot2.move();
                            System.out.println(robot2);
                        } catch (PositionException e) {
                            System.out.println("Не удалось переместить робота: " + e.getMessage());
                        }
                    }

                    case "3":
                    if (robot3 != null) {
                        try {
                            robot3.move();
                            System.out.println(robot3);
                        } catch (PositionException e) {
                            System.out.println("Не удалось переместить робота: " + e.getMessage());
                        }
                    }

                }
                // if (robot1 != null) {
                //     try {
                //         robot1.move();
                //         System.out.println(robot1);
                //     } catch (PositionException e) {
                //         System.out.println("Не удалось переместить робота: " + e.getMessage());
                //     }
                // }
            //  } else if (command.startsWith("cd")) {
            //      System.out.println("Куда повернуться роботу?");
            //      System.out.println("1 - вверх\n2 - вправо\n3 - вниз\n 4 - влево");
                
            //      if (command.startsWith("1")){
            //              direction =  Direction.TOP;
            //              System.out.println("Well done");
            //      }
                
                    
            } else if (command.startsWith("q")) {
                break;
                    
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз.");
            }



        }

//        RobotMap.Robot robot1 = null;
//        RobotMap.Robot robot2 = null;
//        try {
//            robot1 = map.createRobot(new Point(2, 5));
//            robot2 = map.createRobot(new Point(4, 5));
//
//            System.out.println(robot1);
//            System.out.println(robot2);
//        } catch (PositionException e) {
//            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
//        }
//
//        if (robot2 != null) {
//            try {
//                robot2.move();
//            } catch (PositionException e) {
//                System.out.println("Не удалось переместить робота: " + e.getMessage());
//            }
//        }

        // create robot (3, 5)


    }

}

