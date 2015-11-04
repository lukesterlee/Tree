package nyc.c4q.lukesterlee;

/**
 * Created by Luke on 11/4/2015.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.makeBST(new int[]{4,6,9,10,2,57,86,24});
        tree.printPrefix();
        System.out.println(tree.exist(4));
    }
}
