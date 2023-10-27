import java.util.*;
 
public class Arrays_list {
    public static void main(String [] args) {
        // Integer | Float |  String | Boolean

        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Boolean> list = new ArrayList<Boolean>();
        // ArrayList<Float> list = new ArrayList<Float>();☻

        // add elements
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list);

        // get

        System.out.println(list.get(0));
        list.get(1);
        list.get(2);


        // add element in  between

        list.add(1,1);
        System.out.println(list);

        // set
        list.set(0, 7);
        System.out.println(list);

        // delete

        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        // sort
       list.add(0);
       Collections.sort(list);
       System.out.println(list);

    }
}
