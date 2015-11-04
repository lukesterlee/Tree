package nyc.c4q.lukesterlee;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeBST(int[] array) {
        for (int n : array) {
            insert(n);
        }
    }

    public boolean exist(int data) {
        return exist(root, data);
    }

    private boolean exist(Node head, int data) {
        if (head == null)
            return false;

        if (data < head.data)
            return exist(head.left, data);
        else if (data > head.data)
            return exist(head.right, data);
        else
            return true;
    }

    public int findMin() {
        return findMin(root);
    }

    private int findMin(Node head) {
        if (head == null)
            return Integer.MAX_VALUE;

        if (head.left == null)
            return head.data;
        else
            return findMin(head.left);
    }

    public int findMax() {
        return findMax(root);
    }

    private int findMax(Node head) {
        if (head == null)
            return Integer.MIN_VALUE;

        if (head.right == null)
            return head.data;
        else
            return findMax(head.right);
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insert(root, data);
        }

    }

    private void insert(Node head, int data) {
        if (data < head.data) {
            if (head.left == null) {
                Node newNode = new Node(data);
                head.left = newNode;
            } else {
                insert(head.left, data);
            }
        }

        else if (data > head.data) {
            if (head.right == null) {
                Node newNode = new Node(data);
                head.right = newNode;
            } else {
                insert(head.right, data);
            }
        }

    }

    public void printPrefix() {
        printPrefix(root);
        System.out.println();
    }

    private void printPrefix(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printPrefix(head.left);
        printPrefix(head.right);
    }

    public void printInfix() {
        printInfix(root);
        System.out.println();
    }

    private void printInfix(Node head) {
        if (head == null)
            return;

        printInfix(head.left);
        System.out.print(head.data + " ");
        printInfix(head.right);
    }

    public void printPostfix() {
        printPostfix(root);
        System.out.println();
    }

    private void printPostfix(Node head) {
        if (head == null)
            return;

        printPostfix(head.left);
        printPostfix(head.right);
        System.out.print(head.data + " ");
    }

}
