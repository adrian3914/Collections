package com.example.demolinklist;

import org.apache.logging.log4j.util.Strings;
import org.w3c.dom.Node;

import java.util.Stack;

public class Queue {
    DoublyLinkedList items = new DoublyLinkedList();

    /******************************** Offer ***************************************************/
    public boolean offer(String item, int count){
        if (!(Strings.isBlank(item) || Strings.isEmpty(item))) {
            items.addLast(item, count);
            return true;
        }
            else
                return false;
    }

    /******************************** Remove ***************************************************/
    public DoublyLinkedList.Node remove(){
        var removedNode = items.getFirst();
        items.removeFirst();
        return removedNode;
    }

    /******************************** Peek ***************************************************/
    public DoublyLinkedList.Node peek(){

        if (items.getFirst() != null)
            return items.getFirst();
        else
            return null;
    }
    /******************************** Element  ***************************************************/
    public DoublyLinkedList.Node element(){
        return items.getFirst();
    }
    /******************************** Displaying the Items  ***************************************************/
    public void displayItems(){
        items.displayAllNodes();
    }


}
