package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 10:43
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Node {
    private Node preNode;
    private String item;
    private Node nextNode;//下一个结点
    @Override
    public String toString() {
        return "Node{" +
                "preNode=" + preNode +
                ", item='" + item + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }

    public Node getPreNode() {
        return preNode;
    }

    public void setPreNode(Node preNode) {
        this.preNode = preNode;
    }

    public Node(Node preNode, String item, Node nextNode) {
        this.preNode = preNode;
        this.item = item;
        this.nextNode = nextNode;
    }



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {
    }
    public Node(String item, Node nextNode) {
        this.item = item;
        this.nextNode = nextNode;
    }
}
