public class Node {
	int data;
	int height;
	Node left, right;

	public Node(int value) {
		data = value;
		height = 1;
		left = right = null;
	}
}
