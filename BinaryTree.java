public class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	void insert(int value) {
		root = insertRec(root, value);
	}

	Node insertRec(Node node, int value) {
		if (node == null) {
			node = new Node(value);
			return node;
		}

		if (value < node.data) {
			node.left = insertRec(node.left, value);
		} else if (value > node.data) {
			node.right = insertRec(node.right, value);
		}

		return node;
	}

	void printInOrder() {
		printInOrderRec(root);
	}

	void printInOrderRec(Node node) {
		if (node != null) {
			printInOrderRec(node.left);
			System.out.print(node.data + " ");
			printInOrderRec(node.right);
		}
	}

	void printInOrderRightToLeft() {
		printInOrderRecRightToLeft(root);
	}

	void printInOrderRecRightToLeft(Node node) {
		if (node != null) {
			printInOrderRecRightToLeft(node.right);
			System.out.print(node.data + " ");
			printInOrderRecRightToLeft(node.left);
		}
	}

	void printPreOrder() {
		printPreOrderRec(root);
	}

	void printPreOrderRec(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			printPreOrderRec(node.left);
			printPreOrderRec(node.right);
		}
	}

	void printPreOrderRightToLeft() {
		printPreOrderRecRightToLeft(root);
	}

	void printPreOrderRecRightToLeft(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			printPreOrderRecRightToLeft(node.right);
			printPreOrderRecRightToLeft(node.left);
		}
	}

	void printPostOrder() {
		printPostOrderRec(root);
	}

	void printPostOrderRec(Node node) {
		if (node != null) {
			printPostOrderRec(node.left);
			printPostOrderRec(node.right);
			System.out.print(node.data + " ");
		}
	}

	void printPostOrderRightToLeft() {
		printPostOrderRecRightToLeft(root);
	}

	void printPostOrderRecRightToLeft(Node node) {
		if (node != null) {
			printPostOrderRecRightToLeft(node.right);
			printPostOrderRecRightToLeft(node.left);
			System.out.print(node.data + " ");
		}
	}
}
