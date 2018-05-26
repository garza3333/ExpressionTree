package Structures;


import Nodes.NodeList;

/**
 *
 * @author Daniel
 */
public class Queue {
    int size;
    NodeList head;
    NodeList tail;
    public Queue(){
        this.head = tail = null;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public void enqueue(String value){
        this.enq(value);
    }
    public String dequeue(){
        return this.deq();
    }
    public Object peek(){
        return this.pek();
    }
    public void show(){
        this.se();
    }
    public int getSize(){
        return this.size;
    }
    private void enq(String value){
        
        if(isEmpty()){
            this.head = tail =  new NodeList(value);
        }else{
            NodeList aux = tail;
            NodeList n = new NodeList(value);
            tail.setNext(n);
            n.setPrevious(aux);
            this.tail = n;
        }
        this.size++;
        
    }
    private String deq(){
        
        NodeList aux = head;
        head = aux.getNext();
        aux.setNext(null);
        this.size--;
        return aux.getValue();
  
    }
    private Object pek(){
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
