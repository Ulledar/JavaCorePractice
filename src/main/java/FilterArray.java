import java.util.LinkedList;
import java.util.List;

public class FilterArray {

    public static void main(String[] args) {
        Object[] array = {"2123", "asbb", 7, 54, "31", "asadd", 16, 99999, "15", 31, "12312"};

        for (Integer listElement : filterListFromStrings(array)) {
            System.out.println(listElement);
        }
    }

    public static List<Integer> filterListFromStrings(Object[] ar) {
        List<Integer> filteredList = new LinkedList<>();

        for (Object o : ar) {
            if (o.getClass() != String.class) {
                filteredList.add((int) o);
            }
        }

        return filteredList;
    }
}
