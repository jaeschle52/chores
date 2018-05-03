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
    	String p1 = value.substring(0, 2);
    	String p2 = value.substring(3, 4);
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
