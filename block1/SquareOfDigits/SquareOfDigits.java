package SPWeekPrac.block1.SquareOfDigits;

public class SquareOfDigits {
    //consider what makes a square?
    /**
     * 
     * @param data a array of string that from a rightangle cinsist of 0-9 digits
     * @return the make space of a square
     */
    public int getMax(String[] data){
        int maxSquareSide = 1;
        int rows = data.length;
        int cols = data[0].length();

        for (int k = 0; k < rows; k++) {
            for (int i = 0; i < cols - 1; i++) {
                char currentDigit = data[k].charAt(i);

                for (int j = i + 1; j < cols; j++) {
                    if (data[k].charAt(j) == currentDigit) {
                        int sideLength = j - i;
                        if (k + sideLength < rows) {
                            if (data[k + sideLength].charAt(i) == currentDigit &&
                                data[k + sideLength].charAt(j) == currentDigit) {
                                maxSquareSide = Math.max(maxSquareSide, sideLength + 1);
                            }
                        }
                    }
                }
            }
        }
        return maxSquareSide * maxSquareSide;
    }

//     public static void main(String[] args) {
//         SquareOfDigits s = new SquareOfDigits();
//         String[] data = 
//         {"1255",
//  "3455"};

//         int result = s.getMax(data);
//         System.out.println("Result: " + result); // Expected: 9
//     }
}
