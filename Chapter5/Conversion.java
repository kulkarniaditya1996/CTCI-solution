//Owner: Aditya Kulkarni
//CreatedOn: 6/01/2021
class Conversion {
	
   
    public int convert(int n, int m){
		int count = 0;
		for (int c = n^m;c!=0; c = (c&(c-1){
			count++;
		}
    	return count;
    }
}