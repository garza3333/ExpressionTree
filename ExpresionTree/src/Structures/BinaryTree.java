package Structures;


import Nodes.Node;
import java.util.ArrayList;

/**
 * @author Daniel
 */
public class BinaryTree {
	/**
	 * Métodos públicos del árbol
	 */
        private ArrayList list;
	private int size;
	private Node root;
        String result = "";
        
	/**
	 * Constructor del árbol le da valor nulo a la raíz
	 */
	public BinaryTree() {
		this.root = null;	
                this.list = new <Node>ArrayList();
	}


	/**
	 * regresa true si la raíz es nula
	 * @return
	 */
	public boolean isEmpty() {
		return this.root == null;
	}
	/**
	 * retorna la raíz del árbol
	 * @return
	 */
	public Node getRoot() {
		return this.root;
	}
	/**
	 * Inserta un nuevo valor en el árbol
	 * @param key
	 * @return
	 */
	public boolean insert(String key) {
		return this.in(key);
	}

	/**
	 * Imprime las llaves del árbol de menor a mayor
         * @param r
	 */
	public void inOrder(Node r) {
		this.printOrder(r);
	}
        /**
         * Obtiene un string los nodos recorriendo el arbol en orden
         * @param node
         * @return 
         */
        public String getInOrder(Node node){
            result = "";
            this.getorder(node);
            return result;
        }

        /**
         * retorna la cantidad de nodos en la lista
         * @return 
         */
        public int getSize(){
            return this.size;
        }

	
	/**
	 * Métodos privados del árbol
	 * 
	 * 
	 */
	
	/**
	 * INSERT
	 * inserta un nuevo elemento en el árbol
	 * @param key
	 * @param node
	 * @return
	 */
	private boolean in(String key) {
            String signs = "+-*/";
            
            
            if(!signs.contains(key)){
                Node nw = new Node(key);
                list.add(nw);
                Node m = (Node)list.get(list.size()-1);
                System.out.println(m.getKey());
                
            }else{
                
                Node nn = new Node(key);
                Node nr = (Node)list.get(list.size()-1);
                nn.setRight(nr);
                list.remove(list.size()-1);
                Node nl = (Node)list.get(list.size()-1);
                nn.setLeft(nl);
                list.remove(list.size()-1);
                
                list.add(nn);
                  
            }
            return true;
            
	}


	/**
	 * INORDER
	 * Imprime las llaves del árbol de menor a mayor
	 * @param node
	 */
	private void printOrder(Node node) {
		if(node != null) {
			printOrder(node.getLeft());
			System.out.println(node.getKey());
			printOrder(node.getRight());
		}
	}

        /**
         * Llama al metodo print de la clase BTreePrinter
         * Imprime los nodos y las ramas del arbol de manera precisa.
         * @param r
         */
	public void see(Node r) {
            
            BTreePrinter.printNode(r);
            	
	}
        public ArrayList getList(){
            return this.list;
        }
        private void getorder(Node node){
		if(node != null) {
			getorder(node.getLeft());
			result += node.getKey();
			getorder(node.getRight());            
            }
        }
}
