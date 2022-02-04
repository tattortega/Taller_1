package objectworkshop;

import java.util.Scanner;

/**
 * Representa la clase cuenta bancaria
 * @author Luis Ricardo Ortega
 */
public class BankAccount {
    
    /**
     * Atributos de la clase 
     */    
    private int accountNumber;
    protected boolean activated;
    public String accountType;
    private double balance;

    /**
     * Constructor sin parametros para instanciar la clase
     */    
    public BankAccount() {
    }

    /**
     * Constructor con parametros para instanciar la clase
     * @param accountNumber Numero de la cuenta 
     * @param activated Estado de la cuenta
     * @param accountType  Tipo de cuenta
     * @param balance Saldo de la cuenta
     */
    public BankAccount(int accountNumber, boolean activated, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.accountType = accountType;
        this.balance = balance;
    }


    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    
    protected double calculateInterest(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Saldo: ");
        balance = consola.nextDouble();
        double interest = this.balance * 0.05;
        System.out.println("Intereses a pagar: "+interest);
        
        return interest;
    }
    
}
