package investments;

import utils.ListGenerator;
import investments.fund.Fund;
import java.util.ArrayList;
import java.util.Scanner;

public class Investments {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.print("Amount to invest: ");
        int amount = s.nextInt();
        
        System.out.print("Plan: ");
        int plan = s.nextInt();
        
        System.out.println();

        ArrayList<Fund> list = ListGenerator.generate();

        for (Fund fund : list) {
            System.out.print(fund.getName());
            System.out.println("   (" + fund.getFundType() + ")");
        }
        System.out.println();

        System.out.println("Calculated distribution:");

        Calculator.calculate(list, amount, plan);
    }
}
