package projects.learning;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Floor floor1 = new Floor(12.4, 16.8);
        Carpet carpet1= new Carpet(32);
        CostCalculator costCalculator1 = new CostCalculator(floor1, carpet1);

        Floor floor2 = new Floor(4.1, -13);
        Carpet carpet2= new Carpet(24);
        CostCalculator costCalculator2 = new CostCalculator(floor2, carpet2);

        System.out.println("Cost of floor 1: €" + decimalFormat.format(costCalculator1.getTotalCost()));
        System.out.println("Cost of floor 2: €" + decimalFormat.format(costCalculator2.getTotalCost()));
    }
}
