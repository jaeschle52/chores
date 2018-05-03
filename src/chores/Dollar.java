package chores;

import java.util.Currency;
import java.util.Locale;

public class Dollar {
    int dollar;
    int cents;
    Currency symbol = Currency.getInstance(Locale.US);
    
    public String printValue() {
    	return new String(symbol.getSymbol() + dollar + "." + cents);
    }
    
    public Dollar(String value) {
    	if (value.contains("$") ) {
    		value = value.substring(1);
    	}
    	String[] pieces = value.split("\\.");
    	dollar = Integer.valueOf(pieces[0]);
    	cents = Integer.valueOf(pieces[1].substring(0, 2));
    }
    
    public Dollar (int d, int c) {
    	dollar = d;
    	cents = c;
    }
    
    
    public void addMoney(Dollar d2) {
    	int cent = cents + d2.cents;
    	if (cent >= 100) {
    		cent -= 100;
    		dollar += 1;
    	} 
    	dollar += d2.dollar;
    	cents = cent;
    }
    
    public void subtractMoney(Dollar d2) {
    	int cent = cents - d2.cents;
    	if (cent < 0) {
    		cent += 100;
    		dollar -= 1;
    	}
    	dollar -= d2.dollar;
    	cents = cent;
    }
    
    public int getDollar() {
    	return dollar;
    }
    
    public int getCent() {
    	return cents;
    }
}
