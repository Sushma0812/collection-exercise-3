package com.stackroute;
import java.util.HashMap;
import java.util.Map;
public class RemoveValue {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("value1","java");
        stringMap.put("value2","C++");
        // Map - before removing a value
        System.out.println("before: " + stringMap);
        stringMap.replace("value1"," ");
        stringMap.replace("value2","java");
        // Map - after removing a value
        System.out.println("after: " + stringMap);
    }

}
