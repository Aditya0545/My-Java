package Btcse;
public class Account {

    String name;
    double balance;
    public Account(String s, double b) {
        name = s;
        balance = b;
    }
    public void show() {
        System.out.println("--------->");
        System.out.println(name+ " : $"+balance);
    }
}