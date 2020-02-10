public class StringToolBox {
	
	public String nameEcho(String s) {
		String answer="";
		//String newString=s.trim();
	//int index = newString.indexOf(" ");
//		String begString = newString.substring(0,index);
//		String endString=newString.substring(index);
//		endString=endString.toUpperCase();
//		answer=begString+endString;
		answer=s.trim();
		int index = answer.indexOf(" ");
		answer = answer.substring(0,index)+(answer.substring(index)).toUpperCase();
		return answer;
	}
	
	public boolean endsWithStar(String s) {
		return true;
	}

	public boolean endsWithTwoStars(String s) {
		return true;
	}

	public String last4(String s) {
		return "Not yet coded!";
	}

	public String last5(String s) {
		return "Not yet coded!";
	}

	public String scroll(String s) {
		return "Not yet coded!";
	}

	public String convertName(String s) {
		return "Not yet coded!";
	}
}