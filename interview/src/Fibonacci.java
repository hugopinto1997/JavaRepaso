public class Fibonacci {
    public void fibonacci(int x){
        int a = 0,b = 1, res = 0;
        for (int i=0; i<x; i++){
             if (i == 0){
                 System.out.print(a+" ");
             }else if(i == 1){
                 System.out.print(b+" ");
              }else{
                 res = a+b;
                 a = b;
                 b = res;
                 System.out.print(res+" ");
             }
            }

    }
}
