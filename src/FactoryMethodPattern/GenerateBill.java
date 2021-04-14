package FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated : ");
        // BufferedReader --> read text from a character-input stream (read data line by line by readline() method)
        // InputStreamReader --> used to read data from keyboard.
        // (InputStreamReader) It perform 2 tasks : 1) connect with keyboard 2) convert byte to character
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // readLine() --> read a line of text until reach the '\n' character
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = getPlanFactory.getPlan(planName);

        System.out.print("Bill amount for " + planName + " of " + units + " units is : ");
        p.getRate();
        p.calculateBill(units);
    }
}
