package me.pujari.ArrayStack;

import me.pujari.Interface.IStack;
import me.pujari.LinkList.NodeManager;

import java.util.Objects;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 9/7/2017.
 */

public class LStack implements IStack{
    private NodeManager nodeManager;

    public LStack(){
        nodeManager = new NodeManager();
    }
    public void push(int v){
        nodeManager.addNode(v);
        System.out.println(v + " Pushed in stack");
    }

    public Object pop(){
       return Integer.parseInt(nodeManager.removeNode());
    }

    public void print(){
        System.out.println("============================ X OutPut X ============================");
        nodeManager.print();
        System.out.println("============================ X End X ============================");
    }
}
