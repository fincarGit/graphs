package com.ac.trees.binary.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TreeTest {


    @Test
    public void emptyTreeHasNoNodes(){
        Tree tree = new Tree();
        assertEquals(0, tree.getNumNodes());
    }

    @Test
    public void SimpleNodeTreeHasExactlyOneNode(){
        Tree tree = new Tree(new Node(0));
        assertEquals(1, tree.getNumNodes());
    }
}