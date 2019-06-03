package classes;
import java.util.*;

public class maxArea {
    public static int calculate_Area(Rectangle arr[]) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            li.add(arr[i].area());
        }
        return Collections.max(li);
    }
}

