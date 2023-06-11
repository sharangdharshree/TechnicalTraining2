import java.util.*;

public class AL1 {

    static ArrayList<Integer> productOfList(ArrayList<Integer> arr, int i) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int product;
        if (i == 0) {
            list.add(arr.get(0));
            return list;
        }
        list = productOfList(arr, i - 1);
        product = arr.get(i) * list.get(i - 1);
        list.add(product);
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        System.out.println(productOfList(arr, 4));
    }
}
