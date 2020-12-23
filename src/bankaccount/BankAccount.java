

import javax.swing.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class BankAccount
{
	private String name;
	private int id;
	private char accountType;
	private double balance;
	public static int nextId = 0;

	public BankAccount()
	{
		name = "acct";
		id = nextId; //use the next id in the sequence so that new accounts dont have the same ID
		nextId++;
		accountType = 'c';
		balance = 0.0;
	}

	public BankAccount(String n, char t, double b)
	{
		name = n;
		accountType = t;
		balance = b;
		id = nextId;
		nextId++;	
	}
	
	public BankAccount(String n)
	{
		name = n;
		accountType = 'c';
		balance = 0.0;
		id = nextId;
		nextId++;
	}

	//add constructor for name and bal, and for all vars

	
	//get methods
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public int getId()
	{
		return id;
	}
	public char getType()
	{
		return accountType;
	}

	//set methods
	public void setName(String n)
	{
		name = n;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public void setId(int i)
	{
		id = i;
	}
	public void setType(char t)
	{
		accountType = t;
	}

	public double debit(double amount)//deducts amount from balance
	{
		balance -= amount;
		return balance;
	}

	public double credit(double amount)//adds amount to balance
	{
		balance += amount;
		return balance;
	}

	public void displayBalance()
	{
		JOptionPane.showMessageDialog(null, "The balance of this account is:" + balance);
	}
	
	public void displayAll()
	{
		JOptionPane.showMessageDialog(null, "The metrics of this account are:\nName: " + name + "\nBalance: " + balance + "\nID: " + id);
	}
        
       
        
        
}
