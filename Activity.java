/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;
import java.util.Scanner;
/**
 *
 * @author Villagonzalo_CPE
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello! Welcome to Tony's Computing Features");
        System.out.println("  ");
        Scanner bogo = new Scanner(System.in);
        System.out.println("Please Select Option:");
        System.out.println( "  " + "1. Temperature Converter");
        System.out.println( "  " + "2. Odd/Even Number Checker");
        System.out.println( "  " + "3. Trigonometric Calculator");
        System.out.println( "  " + "4. Polygon Surface Area Calculator");
        int hehe = bogo.nextInt();

        if (hehe == 1) {
            System.out.println("Please select to convert:");
            System.out.println("  ");
            System.out.println("1. Celsius to Farenheight");
            System.out.println("2. Farenheight to Celsius");
            System.out.println("3. Kelvin to Celsius");
            System.out.println("4. Kelvin to Farenheight");
            System.out.println("5. Celsius to Kelvin");
            System.out.println("6. Farenheight to Kelvin");
            int haha = bogo.nextInt();

            switch (haha) {
                case 1:
                    System.out.println("Enter Value to Convert:");
                    double c = bogo.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println("The Answer is:" + " " + f);
                    break;

                case 2:
                    System.out.println("Enter Value to Convert:");
                    double f2 = bogo.nextDouble();
                    double c2 = (f2 - 32) * 5 / 9;
                    System.out.println("The Answer is:" + " " + c2);
                    break;

                case 3:
                    System.out.println("Enter Value to Convert:");
                    double k = bogo.nextDouble();
                    double c3 = k - 273.15;
                    System.out.println("The Answer is:" + " " + c3);
                    break;

                case 4:
                    System.out.println("Enter Value to Convert:");
                    double k2 = bogo.nextDouble();
                    double f3 = (k2 - 273.15) * 9 / 5 + 32;
                    System.out.println("The Answer is:" + " " + f3);
                    break;

                case 5:
                    System.out.println("Enter Value to Convert:");
                    double c4 = bogo.nextDouble();
                    double k3 = c4 + 273.15;
                    System.out.println("The Answer is:" + " " + k3);
                    break;

                case 6:
                    System.out.println("Enter Value to Convert:");
                    double f4 = bogo.nextDouble();
                    double k4 = (f4 - 32) * 5 / 9 + 273.15;
                    System.out.println("The Answer is:" + " " + k4);
                    break;
            }

        } else if (hehe == 2) {

            System.out.print("Enter a Number: ");
            int x = bogo.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is even.");
            } else {
                System.out.println(x + " is odd.");
            }

        } else if (hehe == 3) {

            System.out.println("Please choose trigonometric functions:");
            System.out.println("  ");
            System.out.println("1. Sine (sin)");
            System.out.println("2. Cosine (cos)");
            System.out.println("3. Tangent (tan)");

            int t = bogo.nextInt();

            switch (t) {

                case 1:
                    System.out.println("Enter value in degree:");
                    double sin = bogo.nextDouble();
                    System.out.println("The sine of" + " " + sin + " " + "is:" + " " + Math.sin(Math.toRadians(sin)));
                    break;

                case 2:
                    System.out.println("Enter value in degree:");
                    double cos = bogo.nextDouble();
                    System.out.println("The cosine of" + " " + cos + " " + "is:" + " " + Math.cos(Math.toRadians(cos)));
                    break;

                case 3:
                    System.out.println("Enter value in degree:");
                    double tan = bogo.nextDouble();
                    System.out.println("The tangent of" + " " + tan + " " + "is:" + " " + Math.tan(Math.toRadians(tan)));
                    break;
            }

        } else if (hehe == 4) {

            System.out.println("Please choose a polygon:");
            System.out.println("  ");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Circle");
            int p = bogo.nextInt();

            switch (p) {

                case 1:
                    System.out.println("Enter the value of three sides of triangle");
                    System.out.println("Side 1:");
                    double a = bogo.nextDouble();
                    System.out.println("Side 2:");
                    double b = bogo.nextDouble();
                    System.out.println("Side 3:");
                    double c = bogo.nextDouble();

                    double abc = ((a + b + c) / 2);
                    double fv = Math.sqrt(abc * (abc - a) * (abc - b) * (abc - c));

                    System.out.println("The area of triangle is:" + " " + fv);
                    break;

                case 2:
                    System.out.println("Enter the value of length of the square:");
                    double d = bogo.nextDouble();

                    double fv2 = (d * d);

                    System.out.println("The area of Square is:" + " " + fv2);
                    break;

                case 3:
                    System.out.println("Enter the value of length and width of a rectangle");
                    System.out.println("Length:");
                    double e = bogo.nextDouble();
                    System.out.println("Width");
                    double f = bogo.nextDouble();

                    double fv3 = (e * f);

                    System.out.println("The area of a rectangle is:" + " " + fv3);

                case 4:
                    System.out.println("Enter the value of radius of the circle:");
                    double g = bogo.nextDouble();

                    double fv4 = (Math.PI * g * g);

                    System.out.println("The area of a circle is:" + " " + fv4);
            }

        }
        }
    
}

