package ru.gb.hw;

public class ListTwoWay {
    private NodeTwice head;
    private NodeTwice tail;

    public ListTwoWay() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Метод разворота списка
     */
    public void reverse(){
        NodeTwice tmp, tmpNext;

        tmp = this.head;

        while (tmp != null){
            tmpNext = tmp.getNext();
            tmp.setNext(tmp.getPrev());
            tmp.setPrev(tmpNext);
            tmp = tmpNext;
        }

        tmp = this.head;
        this.head = tail;
        this.tail = tmp;
    }

    public void addHead(int data) {
        NodeTwice nodeTwice = new NodeTwice(data);

        if (this.head == null) {
            this.head = nodeTwice;
            this.tail = this.head;
        } else {
            this.head.setPrev(nodeTwice);
            nodeTwice.setNext(head);
            this.head = nodeTwice;
        }
    }

    public void addTail(int data) {
        NodeTwice nodeTwice = new NodeTwice(data);

        if (this.tail == null) {
            this.tail = nodeTwice;
            this.head = this.tail;
        } else {
            nodeTwice.setPrev(tail);
            this.tail.setNext(nodeTwice);
            this.tail = nodeTwice;
        }
    }

    public String listToString(){
        NodeTwice nodeTwice = this.head;
        StringBuilder result = new StringBuilder();

        while (nodeTwice != null){
            result.append(String.valueOf(nodeTwice.getData())).append(" ");
            nodeTwice = nodeTwice.getNext();
        }

        return result.toString();
    }
}
