public class Fibonacci {
    public void calculate(int n){
        int a = 0, b = 1, res = 0;
           if (n == 0 || n == 1){
                res = a+b;
            } else{
               for (int i = 0; i<n; i++) {
                   res = a + b;
                   a = b;
                   b = res;
               }
            }
        System.out.println(res);
    }

    public void calculateRec(int cont){
        System.out.println(fiboRec(cont));
    }

    static int fiboRec (int n)
    {
        if ((n == 0) || (n == 1))
            return 1;
        else
            return fiboRec(n-1) + fiboRec(n-2);
    }
}
