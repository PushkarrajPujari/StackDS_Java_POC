package me.pujari.Main;

import me.pujari.LinkList.NodeManager;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 9/7/2017.
 */
public class MainLinkedListTest {
    public static void main(String[] args) {
        NodeManager linkList = new NodeManager();
        linkList.addNode(10);
        linkList.addNode(20);
        linkList.addNode(30);
        linkList.addNode(40);
        linkList.addNode(50);
        linkList.print();
        System.out.println("===============================");
        linkList.removeNode();
        linkList.print();
    }
}
