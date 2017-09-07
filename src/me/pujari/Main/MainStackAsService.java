package me.pujari.Main;

import me.pujari.Stack.LinkedListStack.LStack;
import me.pujari.Interface.IStack;
import me.pujari.Stack.ArrayStack.AStack;

import java.util.Random;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 07/09/2017.
 */
public class MainStackAsService {
    public static void main(String[] args) {
        IStack iStack = getStack();
        iStack.push(10);
        iStack.push(20);
        iStack.push(30);
        iStack.print();
        iStack.pop();
        iStack.pop();
    }

    public static IStack getStack() {
        if((new Random().nextInt())% 2 == 0){
            System.out.println("Array is used to simulate Stack");
            return new AStack();
        }else{
            System.out.println("LinkedList is used to simulate Stack");
            return new LStack();
        }
    }
}
