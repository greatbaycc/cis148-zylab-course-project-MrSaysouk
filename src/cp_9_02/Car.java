package cp_9_02;

public class Car {
    private int modelYear;
    // TODO: Declare purchasePrice field (int)

    private int currentValue;

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int userYear) {
        modelYear = userYear;
    }

    // TODO: Define setPurchasePrice() method

    // TODO: Define getPurchasePrice() method

    public void calcCurrentValue(int currentYear) {
        double depreciationRate = 0.15;
        int carAge = currentYear - modelYear;

        //Car depreciation formula
        //currentValue = (int)
        //Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }

    // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue

}