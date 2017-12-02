package Other;

import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        //HashMap из массива
        int[] array = {1,2,3,5,4,6,88,4,1,2,1,1,1};
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) map.put(array[i],1);
            else {
                map.put(array[i],map.get(array[i]) + 1) ;
            }
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        for (Map.Entry<Integer,Integer> me : set ) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());

        }
    }
}
