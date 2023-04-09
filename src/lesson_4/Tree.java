package lesson_4;

import java.util.LinkedList;
import java.util.List;

public class Tree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void add(int value) {
        root = appendNode(root, value);
    }

    private Node appendNode(Node corrent, int value) {
        if (corrent == null) {
            return new Node(value);
        }

        if (corrent.value > value) {
            corrent.left = appendNode(corrent.left, value);
        } else if (corrent.value < value) {
            corrent.right = appendNode(corrent.right, value);
        }
        return corrent;
    }

    public int findLast(){
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        int max = result.get(0);
        int n = result.size();
        for (int i = 1; i < n; i++) {
            if (result.get(i) > max) {
                max = result.get(i);
            }
        }
        return max;
    }

    private void dfs(Node current, List<Integer> result){
        if(current != null){
            dfs(current.left, result);
            result.add(current.value);
            dfs(current.right, result);
        }
    }

    public int getChildrenCount(){
        int leafNodes = getChildrenCount(root);
        return leafNodes;
    }

    private static int getChildrenCount(Node node) {
        if(node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }
        else {
            return getChildrenCount(node.left) + getChildrenCount(node.right);
        }
    }

}
