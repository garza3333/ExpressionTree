package Structures;


import Nodes.NodeList;

/**
 *
 * @author Daniel
 */
public class Stack {
    NodeList tail;
    NodeList head;
    int size;
    public Stack(){
    this.tail = null;
    }
    public void push(String value){
        this.in(value);
    }
    public String pop(){
        return this.del();
    }
    public Object peek(){
        return this.last();
    }
    public boolean isEmpty(){
        return this.tail == null;
    }
    public void show(){
        this.se();
    }
    public int getSize(){
        return this.size;
    }

    
    private void in(String value){
        if(isEmpty()){
            this.tail = this.head = new NodeList(value);
        }else{
            NodeList aux = tail;
            NodeList n = new NodeList(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
           
        }
        this.size++;
    }
    private String del(){
        if(size==1){
            size=0;
            NodeList aux = tail;
            tail = head = null;
            return aux.getValue();
            
        }
        NodeList aux = tail;
        aux.getPrevious().setNext(null);
        this.tail = aux.getPrevious();
        size--;
        return aux.getValue();
 
    }
    private Object last(){
        System.out.println(tail.getValue());
        return tail.getValue();
    }
        private void se(){
        
        NodeList temp = head;
        System.out.print("[");
        while(temp.getNext()!=null){
            System.out.print(String.valueOf(temp.getValue())+",");
            temp = temp.getNext();
        } System.out.println(String.valueOf(temp.getValue())+"]");
    }
        
    
}
