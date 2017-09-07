package me.pujari.Main;

import me.pujari.Stack.ArrayStack.AStack;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 07/09/2017
 */
public class Main {
    public static void main(String[] args) {
        AStack aStack = new AStack();
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(40);
        aStack.push(50);
        aStack.push(60);
        aStack.push(70);
        aStack.push(80);
        aStack.push(90);
        aStack.push(100);
        aStack.print();
        aStack.pop();
        aStack.print();
    }
}
