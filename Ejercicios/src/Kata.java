public class Kata {
    public int findEvenIndex(int [] arr){
        int counter = 0;
        int innerCounter = 0;
        for (int i = 0; i<arr.length; i++){
            counter += arr[i];
            innerCounter = 0;
            for(int j = arr.length - 1; j>i; j--){
                if(j != i){
                    innerCounter += arr[j];
                }
            }
            if(counter == innerCounter){
                return i;
            }
            System.out.println("counter: "+counter+" inner"+innerCounter);
        }
        return  -1;
    }
}
