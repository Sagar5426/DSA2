public class Basic {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) { // T.C = O(n) with loop in main
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left SubTree
            root.left = insert(root.left, val);  // sending back instance i.e  root.left = // and return updated subtree after insertion
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean bstSearch(Node root, int key) { // T.C = O(H)  -> H = height of tree
        if (root == null) {
            return false;
        }

        if (root.data > key) { // Left subTree
            return bstSearch(root.left, key);
        }
        else if (root.data == key) {
            return true;
        }
        else { // Right SubTree
            return bstSearch(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // if bst inorder is ascending then it means that bst is correct
        System.out.print("Inorder: "); inorder(root);
        System.out.println();

        if (bstSearch(root, 1)) {
            System.out.println("Status: key found");
        } else {
            System.out.println("Status: key not found");
        }


    }

}
