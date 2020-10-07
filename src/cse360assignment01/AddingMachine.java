package cse360assignment01;

public class AddingMachine {
    private int total;
    private String result = "0";

    /**
     * Creates an Adding Machine object
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Returns the total value
     * @return value of "total" variable.
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds the value passed in
     * @param value for desired addition
     */
    public void add (int value) {
        total+=value;
        result += " + " + value;
    }

    /**
     * Subtract the value passed in
     * @param value for desired subtraction
     */
    public void subtract (int value) {
        total-=value;
        result += " - " + value;

    }
    /**
     *converts string output of referenced value to a string
     * @returns string output of referenced value
     */
    public String toString () {
        return result;
    }
    /**
     * Clears AddingMachine object
     */
    public void clear() {
        total = 0;
    }

    /**
     * Calls the main function to create AddingMachine object and
     */
    public static void main(String args[]){
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        String resString = myCalculator.toString();
        System.out.println(resString);

    }
}

