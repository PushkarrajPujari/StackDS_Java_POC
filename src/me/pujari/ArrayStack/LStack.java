package me.pujari.ArrayStack;

import me.pujari.LinkList.NodeManager;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 9/7/2017.
 */

public class LStack {
    private NodeManager nodeManager;

    public LStack(){
        nodeManager = new NodeManager();
    }
    public void push(int v){
        nodeManager.addNode(v);
    }

    public int pop(){
       return Integer.parseInt(nodeManager.removeNode());
    }

    public void print(){
        System.out.println("============================ X OutPut X ============================");
        nodeManager.print();
        System.out.println("============================ X End X ============================");
    }
}
