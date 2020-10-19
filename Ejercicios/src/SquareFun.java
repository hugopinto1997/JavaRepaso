
public class SquareFun {
    public long findNextSquare(long sq){
        double ans = Math.sqrt(sq);
        if((ans % 1) != 0){
            return -1;
        }else{
            return (long) Math.pow(ans+1, 2);
        }
    }
}
