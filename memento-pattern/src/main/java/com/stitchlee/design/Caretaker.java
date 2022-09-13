package com.stitchlee.design;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理者
 */
public class Caretaker {
    private final Map<String, Originator.Memento> mementoMap = new HashMap<>();

    /**
     * 保存状态
     */
    public synchronized void addMemento(String id, Originator.Memento memento) {
        mementoMap.put(id, memento);
    }

    /**
     * 读取状态
     */
    public synchronized Originator.Memento getMemento(String id) {
        return mementoMap.get(id);
    }

    /**
     * 删除状态
     */
    public synchronized Originator.Memento deleteMemento(String id) {
        return mementoMap.remove(id);
    }

}
