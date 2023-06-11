import java.util.*;

public class AL2 {

    static ArrayList<String> toUpper(ArrayList<String> arr, int i) {
        String upper;
        ArrayList<String> list = new ArrayList<String>();
        if (i < 0) {
            return list;
        }
        list = toUpper(arr, i - 1);
        upper = arr.get(i);
        upper = upper.toUpperCase();
        list.add(upper);

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("ram");
        arr.add("sita");
        arr.add("shyam");
        System.out.println(toUpper(arr, 2));
    }
}
