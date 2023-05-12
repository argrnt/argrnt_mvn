package pl.myTraverse.switches;

public class Switch {


    //    Program should convert money in PLN to foreign currencies (USD,GBP,EUR,CHF)
    //    Assume following currency rate:
    //    USD->PLN 4.19
    //    GBP->PLN 5.18
    //    EUR->PLN 4.54
    //    CHF->PLN 4.31
    //    In case of unknown currency program should throw IllegalArgumentException with following message "Error!
    //    Following currency: {currency} is not available"
    //    Tip: how to throw an exception: throw new IllegalArgumentException("Error msg");

    private double calculate(double amountInPLN, String currency) {
        switch (currency) {
            case "USD":
                return amountInPLN * 4.19;
            case "GBP":
                return amountInPLN * 5.18;
            case "EUR":
                return amountInPLN * 4.54;
            case "CHF":
                return amountInPLN * 4.31;
            default:
                throw new IllegalArgumentException("Error! Following currency: {currency} is not available");
        }
    }

//  Napisz switch, który policzy dla podanego numeru miesiąca, ile dni minęło od początku roku, do
//  końcowego dnia podanego miesiąca. Załóż, że luty ma 28 dni.

    private int howManyDays(int mounth) {
        int sum = 0;
        switch (mounth) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += 31;
                break;
            default:
            System.err.println("Incorrect number of mounth");
        }
        return sum;
    }


}
