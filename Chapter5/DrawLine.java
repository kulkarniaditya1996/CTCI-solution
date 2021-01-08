//Owner: Aditya Kulkarni
//CreatedOn: 8/01/2021
class DrawLine {
	public void drawLine(byte[] screen, int width, int x1, int x2, int y) {
    	int firstByte = x1/8;
    	int bitInBytes = x1%8;
    	if(bitInBytes != 0) {
    		firstByte++;
    	}
    	int lastByte = x2/8;
    	int bitInLastBytes = x2%8;
    	if(bitInLastBytes !=0) {
    		lastByte--;
    	}
    	for(int i = firstByte; i <= lastByte; i++) {
    		screen[i+((width/8) * y)] = (byte) 0xFF;
    	}
    	byte firstByteMask = (byte) ~(-1>>(8-bitInBytes)); 
    	byte lastByteMask = (byte) (-1>>(8-bitInLastBytes));
    	if(firstByte == lastByte) {
    		screen[firstByte+ ((width/8) * y)] = (byte) (firstByteMask & lastByteMask);
    	}
    	else {
    		if(bitInBytes != 0) {
    			firstByte = (width/8) * y + firstByte -1;
    			screen[firstByte] |= firstByteMask;
    		}
    		if(bitInLastBytes != 0) {
    			bitInLastBytes = (width/8) * y + bitInLastBytes + 1;
    			screen[bitInLastBytes] |= lastByteMask;
    		}
    	}
    }
}