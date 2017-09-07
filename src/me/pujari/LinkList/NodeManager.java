package me.pujari.LinkList;

import java.util.Objects;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 07/09/2017.
 *
 * Stage 3 - NodeManager to manage node and simulate LinkedList
 */
public class NodeManager {
    private Node head;
    private Node temp;

    public NodeManager(){

    }

    public void addNode(int value){
        if(head == null){
            head = new Node(value,head);
        }else{
            head = new Node(value,head);
        }
    }

    public String removeNode(){
        temp = head;
        head = head.getNext();
        return String.valueOf(temp.getValue());
    }

    public void print(){
        temp = head;
        for(int i = 1;true;i++){
            System.out.println("Value["+i+"] = "+head.getValue());
            head = head.getNext();
            if(head == null){
                break;
            }
        }
        head = temp;
    }
}
