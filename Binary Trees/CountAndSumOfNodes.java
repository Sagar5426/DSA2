public class CountAndSumOfNodes extends BinaryTrees {

    public static int countNodes(Node root) {
        if (root == null) return 0;

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes+1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Total Nodes: "+countNodes(root));
        System.out.println("Sum of Nodes: "+sumOfNodes(root));
    }
}
