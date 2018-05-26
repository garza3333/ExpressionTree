package Converter;
import Nodes.Node;
import Structures.BinaryTree;
import Structures.Queue;
import Structures.Stack;


/**
 *
 * @author Daniel
 */
public class Converter {
    BinaryTree outputTree;
    Queue queue;
    Stack stack;
    
    public Converter(){
        queue = new Queue();
        stack = new Stack();
        outputTree = new BinaryTree();
        
    }
    public void convertTOtree(String expression){
        stack = new Stack();
        queue = new Queue();
        String xp = expression;
        String signs = "+-*/(";
        String var = "abcdefghijkmnlopqrstuvwxyz";
        
        while(!xp.equals("")){
            String i = xp.substring(0, 1);
            System.out.println(xp);
            System.out.println("");
            xp = xp.substring(1,xp.length());
            
            if(var.contains(i.toLowerCase())){
                queue.enqueue(i);
                System.out.println("QUEUE:");
                queue.show();
                System.out.println("");
            }else if(signs.contains(i)){
                stack.push(i);
                System.out.println("STACK:");                
                stack.show();
                System.out.println("");
                
            }else if(i.equals(")")){

                String p = stack.pop();
                queue.enqueue(p);
                stack.pop();
                System.out.println("QUEUE:");                
                queue.show();
                System.out.println("");
            }else{
                System.out.println("Caracter invalido en la expresion");
                break;
            }
        }
        while(!(queue.getSize()==0)){
            outputTree.insert(queue.dequeue());
        }
        outputTree.see((Node)outputTree.getList().get(outputTree.getList().size()-1));
        outputTree.inOrder((Node)outputTree.getList().get(outputTree.getList().size()-1));
        String r = outputTree.getInOrder((Node)outputTree.getList().get(outputTree.getList().size()-1));
        System.out.println(r);
   
        }
        
    }
    
    

