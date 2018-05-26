package Nodes;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class Node<T extends Comparable<?>> {
	String key;
	Node right,left;
	//Node parent;
	public Node() {
		this("");
	}
	public Node(String key) {
		this.key = key;
		this.right = null;
		this.left = null;
		
	}
	public String getKey() {
		return this.key;
	}
	public Node getRight() {
		return this.right;
	}
	public Node getLeft() {
		return this.left;
	}
//	public Node getParent() {
//		return this.parent;
//	}
	public void setRight(Node node) {
		this.right = node;
	}
	public void setLeft(Node node) {
		this.left = node;
	}
//	public void setParent(Node node) {
//		this.parent = node;
//	}    
}
