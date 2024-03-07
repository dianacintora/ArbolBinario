public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.insert(1);
		tree.insert(5);
		tree.insert(6);
		tree.insert(4);
		tree.insert(9);

		System.out.println("\nIn Order Left-Right:");
		tree.printInOrder();
		System.out.println("\n\nIn Order Right-Left:");
		tree.printInOrderRightToLeft();
		System.out.println("\n\nPost Order Left-Right:");
		tree.printPostOrder();
		System.out.println("\n\nPost Order Right-Left:");
		tree.printPostOrderRightToLeft();
		System.out.println("\n\nPre Order Left-Right:");
		tree.printPreOrder();
		System.out.println("\n\nPre Order Right-Left:");
		tree.printPreOrderRightToLeft();
	}
}
