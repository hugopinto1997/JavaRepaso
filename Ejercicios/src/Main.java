import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int v = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite un numero: ");
        String s = scanner.nextLine();
        System.out.println(v);
        System.out.println(s);*/

        Integer [] arr = {2,1,5,4,3};
        //String palabra = "fdsas";

        //Posicion de una palabra
        //palabra.charAt(0);

        //Ordenar de mayor a menor
        //Arrays.sort(arr, Collections.reverseOrder());
        //Arrays.sort(arr, 0, 5);
        List<Integer> lista = new ArrayList<Integer>(Arrays.asList(arr));
        lista.addAll(Arrays.asList(arr));
        Collections.sort(lista, Collections.reverseOrder());
       // lista.addAll(Arrays.asList(1,2,3,4));
        lista.remove(0);
        List<Integer> subLista = lista.subList(2,4);
        /*for (Integer n: lista) {
           System.out.println(n);
        }*/
        lista.forEach((final Integer n) -> System.out.println(n));
        System.out.println(subLista.toString());

/*
        String cadena = "Comidac";
        String rep = cadena.replace("c","f");
        String rep2 = cadena.replaceAll("(?i)[a-z]","");
        System.out.println(rep);
        System.out.println(rep2);*/

        /*System.out.println("Fibonacci");
        Fibonacci f = new Fibonacci();
        f.calculate(6);

        System.out.println("Fibonacci Rec");
        f.calculateRec(6);*/
        /*SquareFun f = new SquareFun();
        System.out.println(f.findNextSquare(4));*/

      /* Kata k = new Kata();
        int arr [] = {1,2,3,4,3,2,1};
        System.out.println(k.findEvenIndex(arr));*/

       /*BinaryArrayToNumber b = new BinaryArrayToNumber();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(0);
        l.add(1);
        l.add(1);
       System.out.println(b.convertBinaryArrayToInt(l));*/

        //Solution s = new Solution();
        //System.out.println(s.whoLikesIt("Hugo", "Hugo", "Hugo", "Hugo"));
    }
}
