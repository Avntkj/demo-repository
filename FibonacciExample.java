
public class FibonacciExample {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1, nextTerm,count=0;
        System.out.print("First " + n + " terms: ");
        while(count<n)
        {
            System.out.print(t1 + " + ");
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
            count++;
        }
    }
}
