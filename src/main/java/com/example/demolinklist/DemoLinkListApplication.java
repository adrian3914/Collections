package com.example.demolinklist;

/*
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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLinkListApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLinkListApplication.class, args);

        System.out.println("**************************** Assignment 01 ************************");
        TestingSingleLInkedList();

        System.out.println("\n\n**************************** Assignment 02  ************************");

        DoublyLinkedList myLinkedList = new DoublyLinkedList();



        System.out.println("***************** Add three elements at first. *******************");
        myLinkedList.addFirst("C", 3);
        myLinkedList.addFirst("B", 2);
        myLinkedList.addFirst("A", 1);

        myLinkedList.displayAllNodes();

        System.out.println("***************** Last three elements at first. *******************");
        myLinkedList.addLast("D", 4);
        myLinkedList.addLast("E", 5);
        myLinkedList.addLast("F", 6);
        myLinkedList.displayAllNodes();

        System.out.println("***************** Delete first Node. *******************");
        myLinkedList.removeFirst();
        myLinkedList.displayAllNodes();

        System.out.println("***************** Delete last Node. *******************");
        myLinkedList.removeLast();
        myLinkedList.displayAllNodes();


        System.out.println("**************************** Assignment Push using the DoublyLinkedList ************************");

        Stack myStack = new Stack();

        myStack.push("First Push", 1);
        myStack.push("Second Push", 2);
        myStack.push("Second Push", 3);

        myStack.displayItems();

        System.out.println("The size of this stack is: " +  myStack.size());

    }


    //  single LinkedList Demo
    public static void TestingSingleLInkedList()
    {
        LinkedList myLinkedList = new LinkedList();

        System.out.println("***************** Add a head node with some dummy data, then print the list. *******************");
        myLinkedList.addFirst("Zebra",1);
        myLinkedList.displayAllNodes();

        System.out.println("***************** Append four new nodes with dummy data, then print the list. *******************");
        myLinkedList.addLast("Orange", 2);
        myLinkedList.addLast("Monkey", 3);
        myLinkedList.addLast("Snake", 4);
        myLinkedList.addFirst("Tiger", 5);
        myLinkedList.displayAllNodes();

        System.out.println("***************** Delete the head node then print the list. *******************");
        myLinkedList.removeFirst();
        myLinkedList.displayAllNodes();

        System.out.println("***************** Check if the list has a node that contains an \"orange\" value in its item field. *******************");
        String target = "Orange";
        if (myLinkedList.contains(target))
            System.out.println(target + " is in the list.");
        else System.out.println(target +  " is not in the list.");

        System.out.println("****** Write a method to insert a node with some dummy data after the nth node of the list, then print the list. *****************");
        myLinkedList.addLast("Apples",6);
        myLinkedList.displayAllNodes();

        System.out.println("****************** Write a method to delete the nth node of the list, then print the list.*******************************");
        myLinkedList.removeLast();
        myLinkedList.displayAllNodes();


        System.out.println("*****************************Empty the list, then print the list.***********************************");
        myLinkedList.deleteAllNodes();
        myLinkedList.displayAllNodes();

    }

}
