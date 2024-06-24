//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        calculator.setStrategy(new WeightBasedShipping());

        double costByWeight = calculator.calculateShippingCost(10.0);
        System.out.println("Cost per kg: $" + costByWeight);

        calculator.setStrategy(new SizeBasedShipping());

        double costBySize = calculator.calculateShippingCost(0.0);
        System.out.println("Cost per size: $" + costBySize);
    }
}