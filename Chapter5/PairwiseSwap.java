//Owner: Aditya Kulkarni
//CreatedOn: 7/01/2021
class PairwiseSwap{
	public int swapBits(int num){
		return (((num & 0xaaaaaaaa)>>>1) |(num & 0x55555555)<<1);
	}
}