import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTree {

	class Node {
		Node left;
		Node right;

		public Node() {

		}
	}

	public static void main(String[] args) {
		MinimumDepthOfBinaryTree m = new MinimumDepthOfBinaryTree();
		m.findMinDepth();
		List<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>();
	}

	public void findMinDepth() {
		Node node = new Node();
		node.left = new Node();
		node.right = new Node();

		System.out.println(minDepth(node));
	}

	public int minDepth(Node root) {
		if (null == root)
			return 0;
		return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
	}
}
