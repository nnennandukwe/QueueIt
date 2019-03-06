package com.company;

public class LQueue {

    private Node head;
    private Node tail;
    private int count;

    public String remove() {
        if(isEmpty()){
            return null;
        } else {
            String tmp = head.getData();
            if (count == 1){
                head = tail = null;
                count = 0;
            } else {
                head = head.getNext();
                count--;
            }
            return tmp;
        }
    }

    public boolean add(String data) {

        Node n = new Node();
        n.setData(data);
        n.setNext(null);

        // add to tail if no nodes exist in linked list queue
        if (count == 0) {
            head = tail = n;
            count = 1;
        } else {
            // add to end of tail if linkedlist not empty
            tail.setNext(n);
            tail = n;
            count++;
        }

        return true;
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public boolean isFull(){
        return false;
    }

    public String peek(){
        if (isEmpty()){
            return null;
        } else {
            return head.getData();
        }
    }

    public int size(){
        return count;
    }

    public int maxSize(){
        return Integer.MAX_VALUE;
    }

    public String toString(){

        String rtn = "Head -> ";
        Node tmp = head;

        while (tmp != null){
            rtn += tmp.getData() + "\n";
            tmp = tmp.getNext();
        }

        return rtn;
    }
}
