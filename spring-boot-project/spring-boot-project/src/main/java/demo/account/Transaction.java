package demo.account;

import java.util.*;

public class Transaction {

private static double interestRate;
private static double newBalance;
private static double interest;
public static void main(String[] args) {
    double priorBalance;
    double addtlCharges = 100;
    double newBalance;
    double minPayment;

    boolean creditcard_balance = false;
	if (creditcard_balance == true) {
        interestRate = 0.0;
    } else {
        interestRate = 0.02;
    }

  // perform the calculation of interest, new balance and minimum payment
    newBalance = calculateInterest(priorBalance, addtlCharges);
    minPayment = calculateMinPayment(newBalance);

    // output the resulting statement (DO NOT CHANGE)
    System.out.println("\n");
    System.out.println("CS CARD International Statement");
    System.out.println("===============================");
    System.out.printf("Previous balance:   $%,8.2f\n", priorBalance);
    System.out.printf("Additional charges: $%,8.2f\n", addtlCharges);
    System.out.printf("Interest:           $%,8.2f\n\n", interest);
    System.out.printf("New balance:        $%,8.2f\n\n", newBalance);
    System.out.printf("Minimum payment:    $%,8.2f\n", minPayment);
}

/**
 * This method will take in the previous balance and
 * additional charges and compute the amount of interest.
 * If the priorBalance is 0 or less, the interest is 0.
 * If there was a priorBalance, the interest is 2% of the
 * priorBalance plus the additional charges.
 * 
 * @param priorBalance balance before the new charges are added
 * @param addtlCharges charges added this month
 * @return amount of interest to charge
 */
public static double calculateInterest(double priorBalance,
                                       double addtlCharges) {
    interest = (priorBalance + addtlCharges) * interestRate;
    return interest;
}

/**
 * This method will take in the previous balance and
 * additional charges and compute the minimum payment.
 *          $0.00          for new balance less than $0
 *      new balance        for new balance between $0 and $49.99 (inclusive)
 *         $50.00          for new balance between $50 and $300 (inclusive)
 * 20% of the new balance  for new balance over $300
 *
 * @param balance after interest and charges are added
 * @return minimum payment amount
 */
public static double calculateMinPayment(double balance) {
    
    if (newBalance < 0) {
        balance = 0;
    }
    if (newBalance >= 0 && newBalance <= 49.99) {
        balance = newBalance;
    }
    if (newBalance >= 50 && newBalance <= 300) {
        balance = 50.0;
    }
    if (newBalance > 300) {
        balance = (newBalance * 0.2) + newBalance;
    }
    return balance;

}
public static double isactive()
{
}
}

}