package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareToIgnoreCase(this.name) > 0){
            if (this.right != null) {
                this.right.add(nameOfNewNode);
            }
            else {
                this.right = new Node(nameOfNewNode);
            }
        }
        else {
            if (this.left != null) {
                this.left.add(nameOfNewNode);
            }
            else {
                this.left = new Node(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> leftNames;
        List<String> rightNames;
        if (this.left != null) {
            leftNames = this.left.names();
        }
        else {
            leftNames = new ArrayList<String>();
        }
        leftNames.add(this.name);

        if (this.right != null) {
            rightNames = this.right.names();
        }
        else {
            rightNames = new ArrayList<String>();
        }

        leftNames.addAll(rightNames);
        return leftNames;
    }
}
