package LewisStructure.com;

import java.util.*;

class LinkedList {
    static class Element {
        char data;
        Element up, right, left, down;

        public Element(char data) {
            this.data = data;
            this.up = null;
            this.left = null;
            this.down = null;
            this.right = null;
        }
    }

    Element startNode;
    Element currentNode;

    public void createStartNode(char data) {
        this.startNode = new Element(data);
        this.currentNode = this.startNode;
    }

    public void appendNode(char data, String direction) {
        Element newNode = new Element(data);
        switch (direction) {
            case "North":
                this.currentNode.up = newNode;
                newNode.down = this.currentNode;
                this.currentNode = this.currentNode.up;
                break;
            case "East":
                this.currentNode.right = newNode;
                newNode.left = this.currentNode;
                this.currentNode = this.currentNode.right;
                break;
            case "West":
                this.currentNode.left = newNode;
                newNode.right = this.currentNode;
                this.currentNode = this.currentNode.left;
                break;
            case "South":
                this.currentNode.down = newNode;
                newNode.up = this.currentNode;
                this.currentNode = this.currentNode.down;
                break;
        }
    }

    public void shiftCurrentNode(String direction) {
        switch (direction) {
            case "North":
                this.currentNode = this.currentNode.up;
                break;
            case "East":
                this.currentNode = this.currentNode.right;
                break;
            case "West":
                this.currentNode = this.currentNode.left;
                break;
            case "South":
                this.currentNode = this.currentNode.down;
                break;
        }
    }

    public void displayLinkedList() {
        Set<Element> visitedNodes = new HashSet<>();
        traverseNodes(this.startNode, visitedNodes);
        for (Element element : visitedNodes) {
            System.out.print(element.data + " ");
        }
    }

    public void traverseNodes(Element node, Set<Element> visitedNodes) {
        if (node == null) {
            return;
        }
        
        visitedNodes.add(node);
        
        if (!visitedNodes.contains(node.right)) {
            traverseNodes(node.right, visitedNodes);
        }
        if (!visitedNodes.contains(node.down)) {
            traverseNodes(node.down, visitedNodes);
        }
        if (!visitedNodes.contains(node.left)) {
            traverseNodes(node.left, visitedNodes);
        }
        if (!visitedNodes.contains(node.up)) {
            traverseNodes(node.up, visitedNodes);
        }
    }
}

