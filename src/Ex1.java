public class Ex1 {
    public  void  printRange(int first, int last){
        if (first <= last){
        for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
        }}
        else {for (int i = first; i >= last; i--) {
            System.out.print(i + " ");
        }}
    }
}
