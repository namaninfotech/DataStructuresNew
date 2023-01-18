import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllLonelyNumbers {

    static List<Integer> find(int array[]) {
        List<Integer> list = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int element : array) {
           map.put(element,map.getOrDefault(element,0)+1);
        }

        for (int element : array) {
            if(map.containsKey(element+1)|| map.containsKey(element-1) || map.get(element)>1)
                continue;

            list.add(element);
        }

        return list;
    }

    public static void main(String args[]) {
          int[] array={10,5,8,6};
          System.out.println(find(array));
    }
}
