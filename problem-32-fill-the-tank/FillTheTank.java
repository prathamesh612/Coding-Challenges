public class FillTheTank {

    public static void main(String[] args) {
        System.out.println(costToFill(20, 0, 4.00));
        System.out.println(costToFill(15, 10, 3.50));
        System.out.println(costToFill(18, 9, 3.25));
        System.out.println(costToFill(12, 12, 4.99));
        System.out.println(costToFill(15, 9.5, 3.98));
    }

    // Calculates cost to fill tank from current level to full capacity
    private static String costToFill(double tankSize, double fuelLevel, double pricePerGallon) {
        double gallonsNeeded = tankSize - fuelLevel;
        double totalCost = gallonsNeeded * pricePerGallon;

        return String.format("$%.2f", totalCost);
    }
}

/*
 * This program calculates the cost to completely fill a fuel tank.
 * It takes three parameters: total tank capacity, current fuel level, and price per gallon.
 * Calculates gallons needed by subtracting current level from total capacity.
 * Multiplies gallons needed by price to get total cost.
 * Returns formatted string with dollar sign and exactly two decimal places.
 */