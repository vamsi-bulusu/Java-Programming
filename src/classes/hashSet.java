package classes;
import java.util.HashSet;
import java.util.Set;
public class hashSet {
    private static Set<String> newHashSet = new HashSet<>();
    public void add(Person p1){
        newHashSet.add((p1.first_name +" "+p1.last_name));
    }
    public int size(){
        return newHashSet.size();
    }
}
