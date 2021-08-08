import java.awt.*;

public class MainBank extends MainPanel {
    static double atmamount = 10000;
   static double balance = 50000;
    static long[] phoney = new long[10];
    static String[] rectran = new String[50];
    static String trans;
   static  int i =0;
   static double[] bal = new double[50];
   static String userab = userp[pos];
   static String pass = passe[pos];
   static long pinny = atmpin[pos];


   public void addATMmoney(double amt)
   {
       atmamount = atmamount + amt;
       System.out.println("TOTAL AMOUNT IN ATM IS: "+atmamount);
   }
   public void Deposit(double amount)
   {
       balance = balance +amount;
       atmamount = atmamount + amount;
       System.out.println("AMOUNT IN BALANCE: "+balance);
       System.out.println("AMOUNT IN ATM: "+atmamount);
       trans = "DEPOSITED: " + amount;
       rectran[i] = trans;
       bal[i] = balance;
       i++;
   }
   public void Withdraw(double amount)
   {
       balance = balance - amount;
       atmamount = atmamount - amount;
       System.out.println("AMOUNT DEDUCTED");
       System.out.println("AMOUNT IN BALANCE: "+balance);
       System.out.println("AMOUNT IN ATM"+atmamount);
       trans = "WITHDRAWN: " +amount;
       rectran[i] = trans;
       bal[i] = balance;
       i++;

   }
}
