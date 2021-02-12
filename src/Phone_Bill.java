//This program calculates and prints the phone bill for Cingula Cell Phone Company

import java.util.Scanner;

public class Phone_Bill {
    public static void main (String [] args ){
        float MinA, MinB1, MinB2;
        double Charge1, Charge2, AmountDue;
        String AcctNbr, ServiceType;
        Character SrvCode;

        Scanner sc = new Scanner (System.in);
        System.out.println(" ");
        System.out.println("Welcome to Cingula's online cellphone bill calculator!");
        System.out.println(" ");

        System.out.print("Please enter the last seven digits of your account number: ");
        AcctNbr = sc.next();
        while (!ValidAcct (AcctNbr)){
            System.out.print("Please enter the seven digits consecutively and un-spaced for account number: ");
            AcctNbr = sc.next();
        }

        System.out.print("Enter your service code: ");
        SrvCode = 0;
        var ServiceCode = Character.toString(SrvCode);
        ServiceCode = sc.next();
        while (!ValidCode (ServiceCode)){
            System.out.print("Your service code is either A (for regular service) or B (for premium service)." +
                    " Please enter 'A' or 'B': ");
            ServiceCode = sc.next();
        }
        if (ServiceCode.equals("A") || ServiceCode.equals("a")) {
            System.out.println(" ");
            System.out.println("Thank you for using our Regular Service!");
            System.out.println(" ");
            ServiceType = "Regular Service";
            System.out.println(" ");
            try {
                System.out.print("Please enter the number of minutes you used the service for: ");
                MinA = sc.nextFloat();
                if (MinA <= 50) {
                    AmountDue = (MinA * 0) + 10;
                } else AmountDue = (((MinA - 50) * 0.2) + 10);
                System.out.println(" ");
                System.out.println("The following is the bill for Account# GND100" + AcctNbr);
                System.out.println(" ");
                System.out.println("Service Type: " + ServiceType);
                System.out.println("Time Spent Using Service: " + MinA + " minutes.");
                System.out.println("Total Amount Due: $" + AmountDue);
                System.out.println(" ");
                System.out.println("*** Thank You for Choosing Cingula! ***");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (ServiceCode.equals("B") || ServiceCode.equals("b")) {
            System.out.println(" ");
            System.out.println("Thank you for using our Premium Service!");
            System.out.println(" ");
            ServiceType = "Premium Service";
            try {
                System.out.print("Please enter the number of minutes you used the service for between " +
                        "6:00AM and 6:00PM --> ");
                MinB1 = sc.nextFloat();
                if (MinB1 <= 75) {
                    Charge1 = MinB1 * 0;
                } else Charge1 = ((MinB1 - 75) * 0.1);
                System.out.println(" ");
                System.out.print("Please enter the number of minutes you used the service for between " +
                        "6:00PM to 6:00AM --> ");
                MinB2 = sc.nextFloat();
                if (MinB2 <= 100) {
                    Charge2 = MinB2 * 0;
                } else Charge2 = ((MinB2 - 100) * 0.05);

                AmountDue = Charge1 + Charge2 + 25;
                System.out.println(" ");
                System.out.println("The following is the bill for Account# GND100" + AcctNbr);
                System.out.println(" ");
                System.out.println("Service Type: " + ServiceType);
                System.out.println("Time Spent Using Service Between 6:00AM & 6:00PM: " + MinB1 + " minutes.");
                System.out.println("Time Spent Using Service Between 6:00PM & 6:00AM: " + MinB2 + " minutes.");
                System.out.println("Total Amount Due: $" + AmountDue);
                System.out.println(" ");
                System.out.println("*** Thank You for Choosing Cingula! ***");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        }

    private static boolean ValidCode(String ServiceCode) {
        return (ServiceCode.equals("A")) || (ServiceCode.equals("B")) ||
                (ServiceCode.equals ("a")) || (ServiceCode.equals("b"));
    }

    private static boolean ValidAcct(String AcctNbr) {
        if (AcctNbr.length() !=7)
            return false;
        try{
            Integer i=Integer.parseInt(AcctNbr);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }

}
