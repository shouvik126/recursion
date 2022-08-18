import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;  i <= 10; i++) {
            list.add(new Random().nextInt(90));
        }
        System.out.println("Before Sort-----");
        System.out.println(list);
        listSort(list);
        System.out.println("After Sort-----");
        System.out.println(list);
    }

    private static void listSort(List<Integer> list) {
        if (list.size() == 1)
            return;

        int lastValue = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        listSort(list);
        insertAtList(list, lastValue);
    }

    private static void insertAtList(List<Integer> subList, Integer no) {
        if (subList.size() == 0 || subList.get(subList.size() - 1) <= no) {
            subList.add(no);
            return;
        }
        int lastEle = subList.get(subList.size() - 1);
        subList.remove(subList.size() - 1);
        insertAtList(subList, no);
        subList.add(lastEle);
    }
}