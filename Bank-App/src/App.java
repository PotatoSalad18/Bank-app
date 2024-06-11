import java.util.Scanner;

public class App {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000, deposit, withdraw;

        
        System.out.println("Dail *918# ");
        String ussd = sc.nextLine();
        if ("*918#".equals(ussd)){
            
            System.out.println("Welcome to Gen Pay & Send.");
            System.out.println("Menu");


        while (true) {
            System.out.println("Enter 1 for deposit:");
            System.out.println("Enter 2 for withdrawal:");
            System.out.println("Enter 3 to check balance:");
            System.out.println("Enter 4 for to exit!");
            System.out.println("Choose the correct operation to perform: ");

            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter the amount you want to deposit:");
                    deposit = sc.nextInt();


                    balance = balance + deposit;
                    System.out.println("Your current balance is "+balance+ "$");
                    System.out.println();
                    break;

                case 2:
                System.out.println("Enter the amount you'd like to withdraw:");
                withdraw = sc.nextInt();
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Your updated balance is: "+balance);
                    }else {
                        System.out.println("Insufficient Funds...!");
                    }

                  break;
                  
                  case 3:
                        System.out.println("Your account balance is: "+balance);
                        System.out.println();
                        break;

                  case 4:
                        System.out.println("Goodbye!");
                        System.out.println();
                        break;
                }
               }
            }    
        }

}


