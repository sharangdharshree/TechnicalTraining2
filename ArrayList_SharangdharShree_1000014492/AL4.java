import java.util.ArrayList;

public class AL4 {

    // the i in the parameter will take the maximum/largest index of the arraylist
    // i.e if the size of the arraylist is n then i should be n-1
    // its work is to iterate over the arraylist
    static ArrayList<Double> netSalary(ArrayList<Double> arr, int i) {
        ArrayList<Double> list = new ArrayList<Double>();
        if (i < 0) {
            return list;
        }
        list = netSalary(arr, i - 1);
        double netSal = arr.get(i) + (0.1 * arr.get(i));
        list.add(netSal);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(50000.0);
        arr.add(20000.0);
        arr.add(10000.0);
        arr.add(84500.0);
        arr.add(41000.0);
        System.out.println(netSalary(arr, 4));
    }
}
