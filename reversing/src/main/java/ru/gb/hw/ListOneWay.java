package ru.gb.hw;

public class ListOneWay {
    private NodeOnce head;

    public void add(int data) {
        NodeOnce node = new NodeOnce(data);

        if (this.head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }

    }

    public String listToString(){
        NodeOnce node = head;
        StringBuilder result = new StringBuilder();

        while (node != null){
            result.append(node.getData()).append(" ");
            node = node.getNext();
        }
        return result.toString();
    }

    public void reverse(){
        NodeOnce tmp, oldHead;

        oldHead = head;
        tmp = oldHead;
        head = null;

        while (tmp != null){
            this.add(tmp.getData());
            tmp = tmp.getNext();
        }

        oldHead = null;
    }
}
