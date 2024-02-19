package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What is the speed of the car?");
            var speed = scanner.nextDouble();

            if (speed == 0)
                break;

            System.out.println("How many hours are you on the road?");
            var hours = scanner.nextDouble();

            var result = hours * speed;
            System.out.println("Result = " + result);
        }
    }
}