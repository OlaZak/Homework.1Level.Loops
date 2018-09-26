public class Ex5 {
    public void  printFilledMatrix(int rows, int cols, int filler) {
        if ((rows < 0) || (cols < 0)) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int l = 1; l <= cols; l++) {
                    System.out.print(filler + " ");
                }
                System.out.println();
            }
        }
    }
    }









