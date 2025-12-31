package Dec31.Level1Assignment;

public class Question4 {
    public static void main(String[] args) {
        
        /*
        Q4: Create a program to calculate the profit and loss in number and percentage based on the 
        cost price of INR 129 and the selling price of INR 191.
        */

        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");

        /*
        output: 

        The cost Price is INR 129.0 and Selling Price is INR 191.0
        The profit is INR 62.0 and the Profit Percentage is 48.06201550387597%
        */
    }
}
