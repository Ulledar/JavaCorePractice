import java.util.*;
import java.util.stream.Collectors;

public class FilterArray {

    public static void main(String[] args) {
        Object[] array = {"2123", "asbb", 7, 54, "31", "asadd", 16, 99999, "15", 31, "12312"};

        for (Integer listElement : filterArrayFromStrings(array)) {
            System.out.print(listElement+", ");
        }

        System.out.println();

        for (Object listElement : filterArrayFromStringsByStreamApi(array)) {
            System.out.print(listElement+", ");
        }
    }

    public static List<Integer> filterArrayFromStrings(Object[] ar) {
        List<Integer> filteredList = new LinkedList<>();

        for (Object o : ar) {
            if (o.getClass() != String.class) {
                filteredList.add((int) o);
            }
        }

        return filteredList;
    }

    public static List<Object> filterArrayFromStringsByStreamApi(Object[] ar) {
        return Arrays.stream(ar)
                .filter(s -> s.getClass() == Integer.class)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
