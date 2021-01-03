class Insertion{
	public static int updateBits(int n, int m, int i, int j) {
		int maskLeft = -1 << (j+1);
    	int maskRight = ~(-1 << i);
    	int mask = maskLeft | maskRight;
    	n = n & mask;
    	m = m << i;
    	return (n | m);
	}
}