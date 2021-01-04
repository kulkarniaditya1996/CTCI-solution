//Owner: Aditya Kulkarni
//CreatedOn: 04/01/2021
class BinaryToString{
	public String binarytoString(double num){
    	if(num <0 || num > 1) {
    		return "Error";
    	}
    	StringBuilder ans = new StringBuilder();
    	ans.append(".");
    	while(num > 0) {
    		if(ans.length() > 32) {
    			return "error";
    		}
    		num = num*2;
    		if(num >1) {
    			ans.append("1");
    			num = num -1;
    		}
    		else {
    			ans.append("0");
    		}
    	}
    	return (ans.toString());
    }
}