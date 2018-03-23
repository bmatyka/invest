package utils;

import investments.fund.FundType;
import investments.fund.Fund;
import investments.fund.Fund;
import investments.fund.FundType;
import java.util.ArrayList;


public class ListGenerator {
    
    public static ArrayList<Fund> generate() {
        
        ArrayList<Fund> list = new ArrayList();

        list.add(new Fund("Fundusz Polski 1", FundType.POLISH));
        list.add(new Fund("Fundusz Polski 2", FundType.POLISH));
        list.add(new Fund("Fundusz Zagraniczny 1", FundType.FOREIGN));
        list.add(new Fund("Fundusz Zagraniczny 2", FundType.FOREIGN));
        list.add(new Fund("Fundusz Zagraniczny 3", FundType.FOREIGN));
        list.add(new Fund("Fundusz Pieniezny 1", FundType.MONETARY));
        
//        list.add(new Fund("Fundusz Polski 1", FundType.POLISH));
//        list.add(new Fund("Fundusz Polski 2", FundType.POLISH));
//        list.add(new Fund("Fundusz Polski 3", FundType.POLISH));
//        list.add(new Fund("Fundusz Zagraniczny 2", FundType.FOREIGN));
//        list.add(new Fund("Fundusz Zagraniczny 3", FundType.FOREIGN));
//        list.add(new Fund("Fundusz Pieniezny 1", FundType.MONETARY));
        
        return list;
    }
}
