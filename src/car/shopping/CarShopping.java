/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping {

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        totalCost += keylessEntry();
        totalCost += onStar();
        totalCost += antiLock();
        totalCost += wheelPedal();
        totalCost += sunRoof();
        totalCost += coldweatherPackage();
        totalCost += navigationSystem();
        totalCost += LEDLights();
        
        

        //TODO: call methods that you write for each feature
        //TODO: print the total cost of the vehicle
        System.out.println(totalCost);
    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose?"
                + "(enter full model name ex. Model 1): ");
        String model = kb.nextLine();
        if (model.equalsIgnoreCase("Model 1")) {
            return 15000;
        } else if (model.equalsIgnoreCase("Model 2")) {
            return 24000;
        } else if (model.equalsIgnoreCase("Model 3")) {
            return 40000;
        } else {
            return 0;
        }

    }

    public static int automaticWindows() {
        System.out.print("Automatic Windows for $500? (y/n) > ");
        String feature = kb.nextLine();

        if (feature.equals("y")) {
            return 500;
        } else {
            return 0;

        }
    }


    public static int keylessEntry()
{
System.out.print("Keyless entry for 1000$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 1000;
} else {
return 0;
}
}


    public static int onStar()
{
System.out.print("OnStar System for 1000$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 1000;
} else {
return 0;
}
}


    public static int antiLock()
{
System.out.print("Anti-lock Brakes(ABS) for 500$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 500;
} else {
return 0;
}
}


    public static int wheelPedal()
{
System.out.print("Telescoping steering wheel/adjustable pedals for 1000$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 1000;
} else {
return 0;
}
}


    public static int sunRoof()
{
System.out.print("Sunroof for 800$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 800;
} else {
return 0;
}
}

    public static int coldweatherPackage()
{
System.out.print("Do you want the Cold Weather Package for 1500$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 1000;
} else {
return 0;
}
}

    public static int navigationSystem()
{
System.out.print("GPS navigation system for 750$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 750;
} else {
return 0;
}
}

    public static int LEDLights()
{
System.out.print("LED lights for 250$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 250;
} else {
return 0;
}
}


public static int nitrosFuel()
{
System.out.print("Extreme Plus Pro Nitros Octane Fuel pack for 7500$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 7500;
} else {
return 0;
}
}

    public static int aluminumRims()
{
System.out.print("Aluminum black rims for 600$? (y/n) > ");
String feature = kb.nextLine();

if (feature.equals("y")){
return 250;
} else {
return 0;
}
}
}



