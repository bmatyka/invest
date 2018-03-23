package investments;

import investments.fund.FundType;
import investments.fund.Fund;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculator {

    public static void calculate(ArrayList<Fund> list, int amount, int plan) {

        DecimalFormat df = new DecimalFormat("#.00"); 
        
        int freeAmount = amount;        
        
        double[] variant = new double[3];

        switch (plan) {
            case 1:                 //SAFE plan
                variant[0] = 20;
                variant[1] = 75;
                variant[2] = 5;
                break;
            case 2:                 //BALANCED plan
                variant[0] = 30;
                variant[1] = 60;
                variant[2] = 10;
                break;
            case 3:                 //AGGRESIVE plan
                variant[0] = 40;
                variant[1] = 20;
                variant[2] = 40;
                break;
        }
        

        int[] fundTypesCounts = new int[FundType.values().length];

        for (Fund fund : list) {
            switch (fund.getFundType()) {
                case POLISH:
                    fundTypesCounts[0]++;       // number of POLISH funds
                    break;
                case FOREIGN:
                    fundTypesCounts[1]++;       // number of FOREIGN funds
                    break;
                case MONETARY:
                    fundTypesCounts[2]++;       // number of MONETARY funds
                    break;
            }
        }


        for (Fund fund : list) {
            System.out.print(fund.getName());
            System.out.print(" (" + fund.getFundType() + ")  ");
            
            double percentage = 0;
            switch (fund.getFundType()) {
                case POLISH:
                    percentage = variant[0] / fundTypesCounts[0];
                    break;
                case FOREIGN:
                    percentage = variant[1] / fundTypesCounts[1];
                    break;
                case MONETARY:
                    percentage = variant[2] / fundTypesCounts[2];
                    break;
            }
            
            int unitamount = (int) (amount * percentage / 100);
            
            System.out.print(unitamount + " PLN  ");
            System.out.println(df.format(percentage) + " %");
            freeAmount -= unitamount;
        }
        
        
        System.out.println();
        System.out.println("Free amount: " + freeAmount);

    }
}
