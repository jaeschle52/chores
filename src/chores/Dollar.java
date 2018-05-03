package chores;

import java.util.Currency;

public class Dollar {
    int dollar;
    int cents;
    Currency symbol;
    
    public String printValue() {
    	return new String(symbol.getSymbol() + dollar + "." + cents);
    }
}
