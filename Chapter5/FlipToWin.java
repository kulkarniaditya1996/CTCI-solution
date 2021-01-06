//Owner: Aditya Kulkarni
//CreatedOn: 5/01/2021
class FlipToWin {
	
   
    public int flipNumber(int num){
    	if(num == -1) {
    		return 32;
    	}
    	int maxLength =0;
    	int prev = 0;
    	int cur = 0;
    	while(num >0) {
    		if((num&1) == 1) {
    			cur++;
    		}
    		else if((num&1) == 0){
    			if((num&2) == 2) {
    				prev = cur+1;
    			}
    			cur =0;
    		}
    		maxLength = Math.max(prev+cur, maxLength);
    		num>>=1;
    	}
    	return (maxLength);
    }
}