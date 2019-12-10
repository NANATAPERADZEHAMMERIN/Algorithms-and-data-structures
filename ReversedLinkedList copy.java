package com.company;
import javax.xml.soap.Node;

class linkedList {

   static Node head;

   static class Node{
        int data;
        Node next;

        Node(int n){
            data =n;
            next = null;
        }
    }
    public static linkedList insert(linkedList list, int data){
        Node nd = new Node(data);
        nd.next = null;
        if(list.head == null){
            list.head = nd;
        }else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = nd;
        }
        return list;
    }

    public static void print(linkedList list){
       Node current = list.head;

        System.out.print("Linked list: ");

        while(current != null){

            System.out.print(current.data + " ");

            current = current.next;
        }
   }

   Node reverse(Node node){

       Node prev = null;
       Node current = node;
       Node next = null;

       while(current != null){

           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       node = prev;
       return node;
   }

   void printReversed(Node node){

       while(node != null){
           System.out.print(node.data + " ");
           node = node.next;
       }
   }

   public static void main(String [] argc){
       linkedList list = new linkedList();

       list = insert(list, 2);
       list = insert(list, 4);
       list = insert(list, 6);
       list = insert(list, 8);

       print(list);

       head = list.reverse(head);
       System.out.print("\n" + "Reversed linked list: ");
       list.printReversed(head);

   }

}
