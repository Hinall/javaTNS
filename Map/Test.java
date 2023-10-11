package TNSjava.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //insertion operation
        map.put("india",100);
        map.put("china",104);
        map.put("uk",200);
        map.put("USA",500);

        System.out.println(map);

        //search
        if(map.containsKey("india")){
            System.out.println("key present");
        }
        else{
            System.out.println("not present");
        }
        System.out.println(map.get("india"));
        System.out.println(map.get("ind"));

        //iterating
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+""+ e.getValue());
        }
        //another method
        Set<String> keys=map.keySet();
        for(String e:keys){
            System.out.println(e +""+map.get(e));
        }
        map.remove("USA");
        System.out.println(map);

    }
}
