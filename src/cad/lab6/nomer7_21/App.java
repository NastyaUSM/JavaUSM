package cad.lab6.nomer7_21;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Field field = new Field(20, 20);
        Turtle turtle = new Turtle(field);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cherepaha nachiala dvijenie! Dlie vihoda vvedite [9]!");

        while (true) {
            System.out.print("Vvedite komandu: ");
            String command = scanner.next();

            if (command.equals("9")) {
                break;
            }

            if (command.equals("1")) {
                turtle.stopDrawing();
            }

            if (command.equals("2")) {
                turtle.startDrawing();
            }

            if (command.equals("3")) {
                turtle.rotate(Turtle.Rotate.RIGHT);
            }

            if (command.equals("4")) {
                turtle.rotate(Turtle.Rotate.LEFT);
            }

            if (command.contains("5") && command.contains(",")) {
                int steps = Integer.parseInt(command.substring(2));
                turtle.move(steps);
            }

            if (command.equals("6")) {
                field.displayField();
            }
        }
    }
}
