package ru.gb.hw;

public class NodeOnce {
    private int data;
    private NodeOnce next;

    public NodeOnce(int data) {
        this.data = data;
    }

    public NodeOnce() {
        this.data = 0;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeOnce getNext() {
        return next;
    }

    public void setNext(NodeOnce next) {
        this.next = next;
    }
}
