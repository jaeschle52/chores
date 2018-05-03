package chores;

import java.util.Currency;

public class Dollar {
    int dollar;
    int cents;
    Currency symbol;
    
    public String printValue() {
    	return new String(symbol.getSymbol() + dollar + "." + cents);
    }
    
    public Dollar(String value) {
    	if (value.contains("$") ) {
    		value = value.substring(1);
    	}
    	String[] pieces = value.split("\\.");
    	dollar = Integer.valueOf(pieces[1]);
    	cents = Integer.valueOf(pieces[2].substring(0, 1));
    }
    
    public Dollar (int d, int c) {
    	dollar = d;
    	cents = c;
    }
    
    
    public void addMoney(Dollar d2) {
    	int cent = cents + d2.cents;
    	if (cent>=100) {
    		cent =- 100;
    		dollar =+ 1;
    	} 
    	dollar =+ d2.dollar;
    }
    
    public void subtractMoney(Dollar d2) {
    	int cent = cents - d2.cents;
    	if (cent < 0) {
    		cents =+ 100;
    		dollar =- 1;
    	}
    	dollar =- d2.dollar;
    }
    
    public int getDollar() {
    	return dollar;
    }
    
    public int getCent() {
    	return cents;
    }
}
