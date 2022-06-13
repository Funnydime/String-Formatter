public class Lab8{
public static void main(String[] args){
	final int small   = 5;
	final int neg     = -10000;
	final int large   = 1000000;
	final int maxBase = 36;
	NumberFormatter numFormat;
	
	numFormat = new DefaultFormatter();
	System.out.println ("Default:  " + numFormat.format(small) + " " + numFormat.format(neg) +      " " + numFormat.format(large) + " " + numFormat.format(maxBase));
	System.out.println ("Expected: 5 -10000 1000000 36");
	numFormat = new DecimalSeparatorFormatter();
	System.out.println ("Decimal:  " + numFormat.format(small) + " " + numFormat.format(neg) + " " + numFormat.format(large) + " " + numFormat.format(maxBase));
	System.out.println ("Expected: 5 -10,000 1,000,000 36");
	numFormat = new AccountingFormatter();
	System.out.println ("Accounting: " + numFormat.format(small) + " " + numFormat.format(neg) + " " + numFormat.format(large) + " " + numFormat.format(maxBase));
	System.out.println ("Expected:   5 (10000) 1000000 36");
	}
}