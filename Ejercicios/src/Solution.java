public class Solution {
    public String whoLikesIt(String... name){
        String s = "";
        switch (name.length){
            case 0: s = "no one likes this"; break;
            case 1: s= name[0]+" likes this"; break;
            case 2: s= String.format("%s and %s like this", name[0], name[1]);
            case 3: s= name[0]+", "+name[1]+" and "+name[2]+" like this"; break;
            case 4: s= name[0]+", "+name[1]+" and "+(name.length-2)+" others like this"; break;
        }
        return s;
    }
}
