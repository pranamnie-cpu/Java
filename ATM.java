import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ch;
        double bal=0000;
        do{
            System.out.println("\n 1.Balence 2. Deposite 3.Exit ");
                 ch=sc.nextInt();

                    switch(ch){
                case 1:
                    System.out.println("Balacnce :"+bal);
                    break;

                case 2:
                    System.out.println("Enter amount ");
                    double amount=sc.nextDouble();
                     bal+=amount;
                    System.out.print("depostie succesful");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                }
        }while(ch!=4);

    }
}
