public class HeightAndDiameterOfTree extends CountAndSumOfNodes {
    public static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    // T.C = O(n^2)
    public static int diameter(Node root) {
        if (root == null) return 0;

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));

    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // T.C = O(n)
    // returning TreeInfo class type(bcz we want to return ht and diameter together)
    public static TreeInfo diameter2(Node root) {

        // base case
        if (root == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1,diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Height of tree: " + height(root));
        System.out.println("Diameter of tree: " + diameter2(root).diam);
    }
}
