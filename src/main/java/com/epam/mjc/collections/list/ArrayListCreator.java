package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<String>();
        for(String str : sourceList){
            if((sourceList.indexOf(str) + 1) % 3 == 0){
                list.add(str);
                list.add(str);
            }
        }
        return list;
    }
}
