/*
 * @author Tim Harrold
 * Magic Square
 * 
 * Creates and manipulates a 'magic square', that being a square whose rows and columns all add up to the same number
 */
public class MagicSquare {

	private int[][] square;
	private int numRows;
	private int numCols;
	private int n;
	
	public MagicSquare() {
		
	}
	public MagicSquare(int size) {
		int[][] square = new int[size][size];
		int numRows = size-1;
        int numCols = size/2;
        n = size;		

	}
	/*
	 * Returns the size of the 2d array
	 */
	public int getSize() {
		return n;
	}
	/*
	 * Returns the sum of one row in the square
	 */
	public int getSum() {
		int sum = 0;
		for(int r = 0; r < numRows - 1; r++) {
			sum += square[r][0];
		}
		return sum;
	}
	/*
	 * Validates the square by assuring all rows and columns add up to be the same value
	 */
	public boolean validSquare() {
		
		
		
		return true;
	}
	/*
	 * Returns a formatteed string version of the square array
	 */
	public String toString() {
		String sqStr = "";
		for (int i=0; i<square.length; i++) {
			for (int j=0; j<square[i].length; j++)
				sqStr = sqStr + square[i][j] +"\t";
			sqStr = sqStr + "\n";
		}
		return sqStr;
	}
	/*
	 * Fills the square with values, each row and column separately adding up to a magic number
	 */
	private void fillSquare() {
		square[numRows][numCols] = 1;
		for (int i = 2; i <= n*n; i++) {
            if (square[(numRows + 1) % n][(numCols + 1) % n] == 0) {
            	numRows = (numRows + 1) % n;
            	numCols = (numCols + 1) % n;
            }
            else {
            	numRows = (numRows - 1 + n) % n;
            }
            square[numRows][numCols] = i;
        }
	}

}
