public class Ex2 {
    public void printRange(int first, int last, int step) {

        if (first < last && step < 0) throw new IllegalArgumentException("Incorrect");
        else if (first > last && step > 0) throw new IllegalArgumentException("Incorrect");

        if (first < last) {
            for (int i = first; i < last; i = i + step)
                System.out.print(i + " ");
        }
             else if (first > last) {
                for (int i = first; i > last;  i = i +step) {
                    System.out.print(i + " ");
                }
            }
        }

    }