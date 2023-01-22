import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {

    static List<List<Integer>> find(int arr[]) {


        Set<List<Integer>> set = new HashSet<>();

        get(set, 0, arr, new ArrayList<>());

        List<List<Integer>> list = new ArrayList<>(set);

        return list;
    }


    static void get(Set<List<Integer>> set, int startingIndex, int[] arr, List<Integer> childList) {


        if (childList.size() >= 2) {
            set.add(new ArrayList(childList));

        }

        if (startingIndex == arr.length)
            return;


        for (int i = startingIndex; i < arr.length; i++) {
            if (childList.size() == 0 || childList.get(childList.size() - 1) <= arr[i]) {
                childList.add(arr[i]);
                get(set, i + 1, arr, childList);
                childList.remove(childList.size() - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(find(arr));


    }
}
