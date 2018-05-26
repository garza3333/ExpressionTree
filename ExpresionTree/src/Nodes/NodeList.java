package Nodes;

/**
 * Clase Node para almacenamiento de información
 * @author Daniel
 */
public class NodeList {
    private NodeList previous;
    private NodeList next;
    private String value;
    
    
    
    public NodeList(){
        this("");
    }
    /**
     * 
     * @param value - es el valor a almacenar
     */
    public NodeList(String value){
        this.value = value;
        this.next = null;
        this.previous = null;
     
    }
    /**
     * 
     * @param value - edita el valor del Node
     */
    public void setValue(String value){
        this.value =  value;
    }
    /**
     * 
     * @return - retorna el valor dentro del nodo 
     */
    public String getValue(){
        return this.value;
    }
    /**
     * 
     * @return retorna la posicion del siguiente Node
     */
    public NodeList getNext(){
        return this.next;
    }
    public void setNext(NodeList node){
        this.next = node;
    }
    public void setPrevious(NodeList node){
        
        this.previous = node;
    }
    public NodeList getPrevious(){
    return this.previous;
    }

    
}
