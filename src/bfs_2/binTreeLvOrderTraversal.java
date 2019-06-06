/*
 
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 
 Input£º{1,2,3}
Output£º[[1],[2,3]]
Explanation£º
  1
 / \
2   3
it will be serialized {1,2,3}
level order traversal


Input£º{1,#,2,3}
Output£º[[1],[2],[3]]
Explanation£º
1
 \
  2
 /
3
it will be serialized {1,#,2,3}
level order traversal

 
 */

package bfs_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.io.*;
import java.util.*;

import javax.swing.tree.TreePath;

import javax.swing.tree.TreeNode;

public class binTreeLvOrderTraversal {
	
	
	public List<List<Integer>> levelOrder(TreeNode root){
		List result = new ArrayList();
		
		
		if(root == null){
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while (!queue.isEmpty()){
			ArrayList<Integer> level = new ArrayList<Integer>();
			int size = queue.size();
			for(int i = 0; i < size; i++){
				TreeNode head = queue.poll();
				level.add(head.val);
				if(head.left != null){
					queue.offer(head.left);
				}
				if(head.right != null){
					queue.offer(head.right);
				}
			}
			
			result.add(level);
			
		}
		
		return result;
		
		return result;
	}
	
	
}
