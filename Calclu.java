import java.util.Scanner;
class Calclu{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Take A :");
    int a=sc.nextInt();

    System.out.println("Take B :");
    int b=sc.nextInt();

      System.out.println("Enter operator (+, -, *, /):");
        String op = sc.next();

    int result=(op.equals("+"))?(a+b):
                (op.equals("-"))?(a-b):
                (op.equals("*"))?(a*b):
                (op.equals("/"))?(a/b):0;
      
    System.out.println("Result :"+ result);
    
  }
}
