package com.example.demolinklist;
/*
     Develop a Java application that implements a Singly LinkedList. Each node of the
    linked list has three fields: item (String), count(int), and a link to the next
    node. Create a linked list, then test it by:

    Developed by: Adrian Paz Alonso
    Script Date: 22-June-2021
    Purpose:  Develop a Java application that implements a Singly LinkedList. Each node of the
              linked list has three fields: item (String), count(int), and a link to the next
              node. Create a linked list, then test it by:

            1. Write a method to print all the elements of the list.
            2. Add a head node with some dummy data, then print the list.
            3. Append four new nodes with dummy data, then print the list.
            4. Delete the head node then print the list.
            5. Check if the list has a node that contains an "orange" value in its item field.
            6. Write a method to insert a node with some dummy data after the nth node of the
                list, then print the list.
            7. Write a method to delete the nth node of the list, then print the list.
            8. Empty the list, then print the list.
 */

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node{
        private String item;
        private int count;
        private Node next;

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

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
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
        }
        else {
            node.next = first;
            first = node;

//            first.next = node; // address of the node in the heap memory
//            first = node;
        }
        size++;
    }

    /**************************** removeFirst ************************************/
    public void removeFirst(){
        //  [10 -> 20 -> 30]

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else
        {
            // assigning the address of the second node to variable second
            var second = first.next;

            // removing link from first to second
            first.next = null;

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
                    current.item + " " + current.count);
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
