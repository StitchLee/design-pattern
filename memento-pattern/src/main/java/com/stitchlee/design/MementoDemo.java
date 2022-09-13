package com.stitchlee.design;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        //设置状态：满血
        originator.setState("Full Blood");
        //保存当前状态
        caretaker.addMemento("1",originator.saveToMemento());

        //状态改变：半血
        originator.setState("Half Blood");
        System.out.println(originator.getState());
        //读取保存状态
        originator.restoreState(caretaker.getMemento("1"));
        System.out.println(originator.getState());

    }

}
