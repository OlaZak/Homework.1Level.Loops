public class Ex4 {
    public long factorial (int n){
        long factorial = 1;
        if (n < 0 | n > 20)
            throw new IllegalArgumentException();
        else if (n == 1 | n == 0)
            return factorial;
        else {
            for (; n > 1; n--)
                factorial *= n;
        }
        return factorial;
    }
}
