/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Gladys
 */
public class Accounts 
{
protected double balance;
public Accounts(double amount)
{
    balance= amount;
}
public Accounts()
{
    balance = 0.0;
}
public void deposit (double amount)
{
    balance += amount;
}
public void withdraw (double amount)
{
    if (balance >= amount)
{
    balance -= amount;
}
}
    public double getbalance()
    {
        return balance;
    }
}
