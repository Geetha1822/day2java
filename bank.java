import java.util.Scanner;
class BankAccount {
    double balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount +
                " | Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount +
                " | Balance: " + balance);
    }

    void deposit(int amount, String desc) {
        balance += amount;
        System.out.println("Deposited " + amount + "for" +desc+" | Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount acc = new BankAccount();
        System.out.println("enter int amount:");
        int a1=sc.nextInt();
        acc.deposit(a1);
        System.out.println("enter double amount:");
        double a2=sc.nextDouble();
        acc.deposit(a2);
        System.out.println("enter amount");
        int a3=sc.nextInt();
        sc.nextLine();
        System.out.println("enter description:");
        String desc=sc.nextLine();
        acc.deposit(a3,desc);
        
        
    }
}
