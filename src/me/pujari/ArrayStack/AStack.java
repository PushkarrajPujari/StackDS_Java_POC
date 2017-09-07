package me.pujari.ArrayStack;

import me.pujari.Interface.IStack;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 07/09/2017
 *
 * Stage 1 - Implementation of Basic Stack
 * */

 public class AStack implements IStack{
    private int [] stack = new int[10];
    private int stackPoint = 10;
    private String poppedValue;

    public void push(int v){
        if(stackPoint == 0){
            System.out.println("Stack Over Flow .....");
        }else {
            stack[--stackPoint] = v;
            System.out.println(stack[stackPoint] + " Pushed in stack");
        }
    }
    public Object pop(){
        if(stackPoint == 10){
            System.out.println("Stack Empty ....");
            poppedValue = "StackEmpty";
        }else{
            poppedValue = String.valueOf(stack[stackPoint++]);
        }
        return poppedValue;
    }
    public void print(){
        System.out.println("--------------------------X Output X-----------------------------");
        for(int i = stackPoint;i<stack.length;i++){
            System.out.println("Stack["+(i+1)+"] = "+stack[i]);
        }
        System.out.println("--------------------------X End X-----------------------------");
    }


}
