package com.undergrowth.leetcode;

public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(0);
		TreeNode left1=new TreeNode(1);
		TreeNode right1=new TreeNode(2);
		TreeNode left11=new TreeNode(3);
		TreeNode right11=new TreeNode(4);
		TreeNode left111=new TreeNode(5);
		TreeNode left1111=new TreeNode(6);
		root.left=left1;
		root.right=right1;
		left1.left=left11;
		left1.right=right11;
		left11.left=left111;
		left111.left=left1111;
		Solution solution=new Solution();
		System.out.println(solution.isBalanced(root));
	}

	/**
	 * Given a binary tree, determine if it is height-balanced.
	 * 
	 * For this problem, a height-balanced binary tree is defined as a binary
	 * tree in which the depth of the two subtrees of every node never differ by
	 * more than 1.
	 * 
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 * 
	 * ƽ�������
	 * 	--�����������ÿһ���������������������Ĳ�ֵ������1 ��Ϊƽ�������
	 * 
	 *  --ʹ�õݹ��˼�� �����ҳ����ڵ����� Ȼ����в��ϵ���
	 * 
	 */

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static class Solution {
		public boolean isBalanced(TreeNode root) {
			if(root==null) return true;
			//if(root.left==null&&root.right==null) return true;
			if(Math.abs(depth(root.left)-depth(root.right))>1) return false;
			return isBalanced(root.left)&&isBalanced(root.right);
		}

		/**
		 * �鿴�������
		 * @param left
		 * @return
		 */
		private int depth(TreeNode root) {
			// TODO Auto-generated method stub
			if(root==null) return 0;
			return 1+Math.max(depth(root.left), depth(root.right));
		}
	}

}
