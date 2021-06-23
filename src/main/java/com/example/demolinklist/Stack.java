package com.example.demolinklist;

import org.apache.logging.log4j.util.Strings;

public class Stack {
    // reference variable
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    /******************************** Push ***************************************************/
    public boolean push(String item, int count){

        if (!(Strings.isBlank(item) || Strings.isEmpty(item))){
        doublyLinkedList.addLast(item, count);
        return true;
        }
        else
            return false;
    } // end Push

    /******************************** Pop ***************************************************/
    public boolean pop(){
        doublyLinkedList.removeLast();
        return true;
    }

    /******************************** Display ***************************************************/
    public void displayItems(){
        doublyLinkedList.displayAllNodes();
    }

    /******************************** size ***************************************************/
    public int size(){
        return doublyLinkedList.size();
    }

    /******************************** clear ***************************************************/
    public void clear(){
        doublyLinkedList.deleteAllNodes();
    }


}
