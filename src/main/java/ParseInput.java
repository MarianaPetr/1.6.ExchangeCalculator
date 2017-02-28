
public class ParseInput {
	
	public double getAmmount(String input) {
		String[] inputs = input.split(" ");
		return Double.parseDouble(inputs[4]);
	}
	
	public CurrencyPairs getCurrencyPairs(String input) {
		String[] inputs = input.split(" ");
		String currencyPairs = inputs[2] + inputs[5];
		return CurrencyPairs.valueOf(currencyPairs);
	}

}
