package projects.learning;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(12.4, 16.8);
        Carpet carpet= new Carpet(32);
        CostCalculator costCalculator = new CostCalculator(floor, carpet);

        System.out.println("Cost of floor: " + costCalculator.getTotalCost());
    }
}
