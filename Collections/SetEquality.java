package Collection;

import java.util.HashMap;
import java.util.HashSet;

public class SetEquality {
    public static void main(String args[]){
        HashSet<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        if(set1.equals(set2)){
            System.out.println("truee");
        }else {
            System.out.println("false");
        }
    }
}
