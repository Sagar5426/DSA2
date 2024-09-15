public class SubTreeOfAnotherTree extends BinaryTrees {

    // Helper Func
    public static boolean isIdentical(Node root, Node subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }

        if(root == null || subRoot == null) {
            return false;
        }

        if(root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    // try on solving on LeetCode as while build Subroot will give index out of bound bcz we are using a static index var
    // Can be by passing index as argument in buildTree func
    public static void main(String[] args) {
        int tree[] = {3, 4, 1, -1, -1, 2, -1, -1, 5, -1, -1};
        int subTree[] = {4, 1, -1, -1, 2, -1, -1};
        BinaryTree binTree = new BinaryTree();
        Node root = binTree.buildTree2(tree,-1);
        Node subRoot = binTree.buildTree2(subTree,-1);

//        System.out.println(isSubtree(root,subRoot));

    }
}
