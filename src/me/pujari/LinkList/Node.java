package me.pujari.LinkList;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 07/09/2017.
 *
 * Stage 2 - Link-List Node
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value,Node next){
        this.value = value;
        this.next  = next;
    }

    public Node getNext(){
        return next;
    }

    public int getValue(){
        return value;
    }
}
