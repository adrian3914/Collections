package com.example.demolinklist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private class Node{
        private String item;
        private int count;
        private Node next;
        private Node previous;

        public Node(String item, int count) {
            this.item = item;
            this.count = count;
        }
    } // Node class

    // Reference Variables
    private Node first; //=> head
    private Node last; //=> tail
    private int size;

    /**************************** addLast ************************************/
    public void addLast(String item, int count){
        var node = new Node(item, count);

        if (isEmpty()) {
            first = last = node;
            node.previous = null;
        }
        else {
            last.next = node;
            node.previous = getPrevious(node);
            last = node;
        }
        size++;

    } // end method addLast

    /**************************** addFirst ************************************/
    public void addFirst(String item, int count){
        var node = new Node(item, count);

        if (isEmpty())
        {
            first = last = node;
            node.previous = null;

        }
        else {
            node.next = first;
            first = node;
            node.previous = getPrevious(node);


//            first.next = node; // address of the node in the heap memory
//            first = node;
        }
        size++;
    }

    /**************************** removeFirst ************************************/
    public void removeFirst(){
        //  [10 -> 20 -> 30]
        //      <- previous

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last =  null;
        else
        {
            // assigning the address of the second node to variable second
            var second = first.next;

            // removing link from first to second
            first.next = null;

            // deleting the previous link on the second
            second.previous = null;

            // updating second to be the first node in the list
            first = second;

        }
        size--; // decreasing the counter
    }

    /**************************** removeLast ************************************/
    public void removeLast(){
        if (isEmpty())
            throw  new NoSuchElementException();

        if (first == last)
            first = last = null;
        else
        {
            // finding the previous and assigning it to a variable
            var previous = getPrevious(last);

            // removing the previous from last
            last.previous = null;

            // Assigning last to be the previous node
            last = previous;

            // removing the link from previous
            last.next = null;
        }
        size--;
    }

    /*************************  Delete all nodes in the LinkedList ******************************/
    public void deleteAllNodes(){
        var current = first;

        while (!isEmpty())
        {
            removeFirst();
        }
    }


    /**************************** size ************************************/
    public int size(){
        return size;
    }

    /**************************** toArray ************************************/
    public String[] toArray(){
        String[] array = new String[size];
        var current = first;
        var index = 0;

        while (current != null)
        {
            array[index++] = current.item;
            current = current.next;
        }
        return array;
    }

    /**************************** indexOf ************************************/
    public int indexOf(String item){
        int index = 0;
        var current = first;

        while (current != null)
        {
            if (current.item == item)
                return index;
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    } // end method indexOf

    /**************************** contains ************************************/
    public boolean contains(String item){
        if (indexOf(item) != -1)
            return true;
        else
            return false;
    }

    /**************************** displayAllNodes ************************************/
    public void displayAllNodes(){
        var current = first;

        while (current != null){
            System.out.println(
                    current.item + " -> " + current.count);
            current = current.next;
        }
    }

    /**************************** getPrevious ************************************/
    public Node getPrevious(Node node){
        // traversing
        var current = first;
        while (current != null)
        {
            if (current.next == node)
                return current;
            else
                current = current.next;
        }
        return null;
    }


    /**************************** isEmpty ************************************/
    public boolean isEmpty(){
        return first == null;
    }
}
