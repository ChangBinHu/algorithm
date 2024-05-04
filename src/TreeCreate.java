/**
 * @(#)TreeCreate.java, 5月 04, 2024.
 * <p>
 * Copyright 2024 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author huchangbin
 */
public class TreeCreate {

    private TreeNode root;

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        TreeCreate tree = new TreeCreate(arr);
        tree.preOrderTraverse();
    }


    public TreeCreate() {
    }
    public TreeCreate(int [] arr) {
        this.root = createTree(arr, 0);
    }

    private TreeNode createTree(int arr[], int i) {
        if (i >= arr.length) {
            return null;
        }
        TreeNode treeRoot = new TreeNode(arr[i]);
        treeRoot.setLeftChild(createTree(arr, i * 2 + 1));
        treeRoot.setRightChild(createTree(arr, i * 2 + 2));
        return treeRoot;
    }

    public void preOrderTraverse() {
        preOrderTraverse(root);
    }

    private void preOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getVal());
        preOrderTraverse(root.getLeftChild());
        preOrderTraverse(root.getRightChild());
    }
}