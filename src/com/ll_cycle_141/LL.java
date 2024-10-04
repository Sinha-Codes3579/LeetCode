//package com.ll_cycle_141;
//
//public class CLL {
//    private Node head;
//    private Node tail;
//    private class Node{
//        int value;
//        Node next;
//        public Node(int value){
//            this.value = value;
//        }
//
//    }
//    public CLL(){
//        this.head = null;
//        this.tail = null;
//    }
//    public void insertFirst(int val){
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//        if(tail == null){
//            tail = head;
//        }
//        size++;
//    }
//    public void insertLast(int val){
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size++;
//        if(tail == null){
//            insertFirst(val);
//            return;
//        }
//    }
//    public void display(){
//        Node node = head;
//        while(node != null){
//            System.out.print(node.value + " -> ");
//            node = node.next;
//        }
//        System.out.println("END");
//    }
//
//    public boolean hasCycle(Node head){
//        Node fast = head;
//        Node slow = head;
//        while(fast != null && slow != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        LL fast = new LL();
//        LL slow = new LL();
//
//    }
//}
