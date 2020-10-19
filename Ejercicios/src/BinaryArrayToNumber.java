import java.util.List;

public class BinaryArrayToNumber {
    public int convertBinaryArrayToInt(List<Integer> binary){
        int number = 0, index = binary.size() - 1;
        for (int i=0; i<binary.size(); i++){
           if(binary.get(i) == 1){
               number+=Math.pow(2,index);
           }
            index--;
        }
        return number;
    }
}
