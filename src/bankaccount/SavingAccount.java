
import java.util.Arrays;
import javax.swing.JOptionPane;



class SavingAccount extends BankAccount
{
	private double rate;
	
	public SavingAccount(String n, char t, double b, double r)
	{
		super(n,t,b);
		rate = r;
	}
	
        public double getRate()
        {
            return rate;
        }
        
	public void addInterest(double time)
	{
		this.setBalance(this.getBalance() + time*rate);
	}
	
	/*This method has an unclear specification. Assuming it means to deduct one amount from balance.
	 * it could also take a time and multiply by rate to simulate interest, but idk which one*/
	public void deductLoan(double amount)
	{
		this.setBalance(this.getBalance() - amount);
	}
        
       
        public static SavingAccount search(String n, SavingAccount[] barr)
        {
            for(int i = 0; i < barr.length; i++)
            {
                //JOptionPane.showMessageDialog(null, n + "    " + barr[i].getName());
                if(n.equals(barr[i].getName()))
                {
                    return barr[i];
                }
            }
            return null;
        }
        
         public static SavingAccount[] sortByName(SavingAccount[] barr, int i, char t)
        {
            SavingAccount[] result = barr;
            
            //find next of the given account type
            int next = -1;
            for(int j = i; j >= result.length; j++)
            {
                if(t == barr[j].getType())
                    next = j;
            }
            if(next == -1) //this means there is no next value and sort is finished.
                return result;
            
            if(result[i].getName().compareToIgnoreCase(result[next].getName()) > 0)
            {
                //switch arrays at position i and i+1
                SavingAccount temp = result[i];
                result[i] = result[next];
                result[next] = temp;
                //run the sort again with the index increased
                result = sortByName(result, i+1,t);
            }
            else
            {
                result = sortByName(result, i+1,t);
                return result;
            }
            
            return result;
        }
}


