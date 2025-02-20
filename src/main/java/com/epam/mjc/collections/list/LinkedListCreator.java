package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int num : sourceList){
            if(num % 2 != 0){
                list.add(0, num);
            }
            else{
                list.add(num);
            }
        }
        return list;
    }
}
