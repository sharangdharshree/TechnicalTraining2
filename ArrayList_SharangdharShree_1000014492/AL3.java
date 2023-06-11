import java.util.ArrayList;

public class AL3 {

    // the i in the parameter has the work to iterate over the arraylist, its value should be given 0 i.e start of the list
    static int findHighest(ArrayList<Integer> arr, int i) {
        int highest = Integer.MIN_VALUE;
        if (i == arr.size()) {
            return highest;
        }
        highest = findHighest(arr, i + 1);
        if (arr.get(i) > highest) {
            highest = arr.get(i);
        }
        return highest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(2);
        arr.add(0);
        arr.add(845);
        arr.add(41);
        System.out.println(findHighest(arr, 0));
    }
}
