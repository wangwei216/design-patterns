package com.CollectionTest;

import java.util.*;

public class TestList {


    public static void main(String[] args) {


        Map map = new TreeMap();

        Set set = new HashSet();

        ArrayList<String> list = new ArrayList<String>();
        list.add("a"); 
        list.add("b");
        list.add("b"); 
        list.add("c"); 
        list.add("c"); 
        list.add("c");
        System.out.println("删除之前的："+Arrays.toString(list.toArray()));
        for (int i = 0; i < list.size();i++){
            if (list.get(i).equals("b")){
                list.remove(i);
            }
        }
        System.out.println("删除之后的："+Arrays.toString(list.toArray()));
        
//        =============================//

//        for (String s : list) {
//            if(s.equals("b")){
//                list.remove(s);
//            }
//        }

        System.out.println("foreach遍历删除之后的："+Arrays.toString(list.toArray()));
        
        
    }
    
    
    

}
