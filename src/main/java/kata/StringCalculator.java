package kata;

public class StringCalculator {

	public int addStringNumbers(String input) {
		if(input.isEmpty()){
			return 0;
		}
		else if(input.length() == 1){
			return Integer.valueOf(input);
		}
		else if(input.contains(",")){
			// String removedCommaInput = input.substring(1, 1);
			String[] removedCommaInput = input.split(",");
			int sum = 0;
			for(String value : removedCommaInput){
				sum = sum + Integer.valueOf(value);
			}
			return sum;
		}
		return 0;
		
	}

}
