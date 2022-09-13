package com.stitchlee.design;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    /**
     * 保存当前状态到备忘录
     */
    public Memento saveToMemento() {
        System.out.println("Saving current state: " + state);
        return new Memento(this.state);
    }

    /**
     * 读取备忘录，恢复保存的状态
     */
    public void restoreState(Memento memento) {
        System.out.println("Restore state");
        this.state = memento.getSavedState();
    }


    /**
     * 备忘录，存储当前Originator状态
     */
    public static class Memento {
        final String state;

        public Memento(String s) {
            this.state = s;
        }

        public String getSavedState() {
            return this.state;
        }

    }

}
