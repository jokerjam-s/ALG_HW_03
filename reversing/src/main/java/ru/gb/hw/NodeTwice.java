package ru.gb.hw;

public class NodeTwice {
    private int data;
    private NodeTwice next;
    private NodeTwice prev;

    public NodeTwice(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public NodeTwice() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeTwice getNext() {
        return next;
    }

    public void setNext(NodeTwice next) {
        this.next = next;
    }

    public NodeTwice getPrev() {
        return prev;
    }

    public void setPrev(NodeTwice prev) {
        this.prev = prev;
    }
}
