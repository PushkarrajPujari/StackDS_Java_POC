package me.pujari.Main;

import me.pujari.ArrayStack.LStack;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 07/09/2017.
 */
public class MainStackWithLinkedList {
    public static void main(String[] args) {
        LStack lStack = new LStack();
        lStack.push(10);
        lStack.push(20);
        lStack.push(30);
        lStack.push(40);
        lStack.push(50);
        lStack.push(60);
        lStack.print();
        lStack.pop();
        lStack.print();

    }
}
