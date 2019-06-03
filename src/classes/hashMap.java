package classes;
import java.util.HashMap;
import java.util.Map;
public class hashMap {
    static private Map<String,Integer> map = new HashMap<>();
    public  void add(String name,int mobile_no){
        map.put(name,mobile_no);
    }
    public int retrieve(String name){
        if (map.containsKey(name)) {
             return map.get(name);
        }
        return -1;
    }
}
