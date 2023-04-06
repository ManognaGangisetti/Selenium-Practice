import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
//        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
//        hashMap.put("a",20);
//        hashMap.put("b",3);
//        hashMap.put("c",34);
//        System.out.println(hashMap.get("b"));
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("manu@mail.com","1wed");
        map.put("jiojs@ygmail.com","23mk");
        System.out.println(map);
        System.out.println(map.containsKey("jiojs@ygmail.com"));
        System.out.println(map.containsValue("1wed"));
        System.out.println(map.size());
         System.out.println(map.values());
    }
}