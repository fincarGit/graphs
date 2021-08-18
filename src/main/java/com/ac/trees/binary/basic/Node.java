package com.ac.trees.binary.basic;

public class Node {
    Integer value;
    Node left;
    Node right;

    public Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(Integer value) {
        this.value = value;
    }
}
