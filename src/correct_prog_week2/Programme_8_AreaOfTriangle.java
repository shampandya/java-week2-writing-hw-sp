package correct_prog_week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Triangle: ");
        int length = scanner.nextInt();
        System.out.println("Please enter the heihgt of the Triangle: " );
        int height = scanner.nextInt();
        Programme_8_AreaOfTriangle.areaOfTriangle(length,height);
        // closing the scanner object
        scanner.close();

    }
    //Calculating the area of Triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height){
        int area = (length * height ) /2;
        System.out.println("The area of Triangle is : " +area);

    }
}
