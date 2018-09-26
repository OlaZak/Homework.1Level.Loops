public class Ex3 {
    public void printEvenRange (int first , int last ){
        if (first < last){
            for (int i = first; i <= last; i++) {
                if (i%2==0)
                    System.out.print(i + " ");
            }
        }

    }
}
