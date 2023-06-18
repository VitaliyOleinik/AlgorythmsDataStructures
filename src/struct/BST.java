package struct;

import java.util.Arrays;
import java.util.Objects;

class Node {
    Node left;
    Node right;
    int value;
    int cnt;

    Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public void add(int x) {
        Node result = this.add(this.root, x);
        if (Objects.isNull(root)) {
            root = result;
        }
    }

    public void print() {
        this.print(this.root);
    }

    private Node add(Node current, int x) {
        if (Objects.isNull(current)) {
            current = new Node(x);
        } else if (current.value > x) {
            if (Objects.isNull(current.left)) {
                current.left = add(current.left, x);
            } else {
                add(current.left, x);
            }
        } else if (current.value < x) {
            if (Objects.isNull(current.right)) {
                current.right = add(current.right, x);
            } else {
                add(current.right, x);
            }
        }
        return current;
    }

    private void print(Node current) {
        if (Objects.nonNull(current)) {
            print(current.left);
            System.out.print(current.value + " ");
            print(current.right);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 11, 8, 5, 4, 12};
//        int n = sizeof(a) / sizeof(int);

        BST b = new BST();

        for(int i = 0; i < 6; ++i){
            b.add(a[i]);
        }

        b.print();
    }
}
