package Collections;

import java.util.HashMap; import java.util.Iterator; import java.util.Map; import java.util.Map.Entry; import java.util.Set;

public class hashMapexample {

public static void main(String[] args) { // TODO Auto-generated method stub

HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(0, "hello"); 
hm.put(1, "Gudbye");
hm.put(42, "morning");
hm.put(3, "evening");

for(Map.Entry<Integer,String> entry : hm.entrySet() )

{

System.out.println(entry.getKey());

System.out.println(entry.getValue());

}


}}
