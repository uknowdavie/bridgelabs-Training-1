package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("kiwi");
        HashMap<String,Integer> map=new HashMap<>();
        for(String item:list){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        System.out.println(map);
    }
}