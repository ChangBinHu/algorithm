/**
 * @(#)TreeNode.java, 5月 04, 2024.
 * <p>
 * Copyright 2024 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author huchangbin
 */
public class TreeNode {
    private int val;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode leftChild, TreeNode rightChild) {
        this.val = val;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}