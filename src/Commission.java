import java.util.Scanner;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String transactiontype;
        String transactionlocation;
        double userAmount;
        double commission = 0;

        System.out.println("Is this a sale or a Purchase:");
        transactiontype = scanner.nextLine();

        System.out.println("Where was the transaction made:?");
        transactionlocation = scanner.nextLine();

        System.out.print(" Please enter the amount ");
        userAmount = scanner.nextDouble();

        if (transactiontype.toLowerCase().equals("sale")) {
            if (transactionlocation.toUpperCase().equals("L")) {// E
                commission = (5 / 100) * userAmount;
            }
            else if (transactionlocation.toUpperCase().equals("N")) {// E
                commission = (3.7 / 100) * userAmount;
            }
            else if (transactionlocation.toUpperCase().equals("T")) {// E
                commission = (4.2 / 100) * userAmount;

            }
        }
        else if (transactiontype.toLowerCase().equals("purchase")) {

            if (transactionlocation.toUpperCase().equals("L")) { // E
                commission = (6.3 / 100) * userAmount;
            }
            else if (transactionlocation.toUpperCase().equals("N")) {// E
                commission = (4.3 / 100) * userAmount;
            }
            else if (transactionlocation.toUpperCase().equals("T")) {// E
                commission = (5.7 / 100) * userAmount;

            }

        }
        System.out.printf(" Transaction type: %s\nTransaction Location: %s\nAmount: %f\nCommission: %f ",
                transactiontype.toLowerCase(), transactionlocation.toUpperCase(), userAmount, commission);
    }

}
/*
This program is designed to calculate the commission charged by the broker depednding on which stock exchange the customer had bought/sold shares on and if the customer is either buying shares
or selling shares.
L = London Stock Exchange
N = New York Stock Exchange
T= Tokyo Stock Exchange
 */






