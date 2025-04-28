import java.util.*;

public class Main {

    public static int isDuplicate(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) { 
                set.remove(list.get(i));
            } else {
                set.add(list.get(i));
            }
        }
        for (int num : set) { 
            return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        System.out.print(isDuplicate(list)); 
    }
}
