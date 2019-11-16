package com.company;
public class addElement {
    public static void main(String [] argc){
        Tree tr = Tree.createTheTree();
        System.out.println(tr.includesValue(89));
        System.out.println(tr.includesValue(2));

    }
}
class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class Tree {

    Node root;
    private Node addElement(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addElement(current.left, value);
        } else if (value > current.value) {
            current.right = addElement(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value){
        root = addElement(root, value);
    }

    public static Tree createTheTree(){
        Tree num = new Tree();
        num.add(3);
        num.add(8);
        num.add(25);
        num.add(18);
        num.add(63);
        num.add(89);
        num.add(10);
        num.add(19);

        return num;
    }

    private boolean isElementInTree(Node current, int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }
        return value < current.value
             ?   isElementInTree(current.left, value)
                : isElementInTree(current.right, value);
    }
    public boolean includesValue(int value){
        return isElementInTree(root, value);
    }

}



