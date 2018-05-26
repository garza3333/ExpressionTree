
package expresiontree;

import Converter.Converter;
import Nodes.Node;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {
        
        Converter c = new Converter();
        c.convertTOtree("((A+(B*C))-D)");
//            ArrayList l = new <Node>ArrayList();
//            Node n = new Node("n");
//            Node nn = new Node("nn");
//            Node nnn = new Node("nnn");
//            l.add(n);
//            l.add(nn);
//            l.add(nnn);
//            Node m = (Node)l.get(l.size()-1);
//            System.out.println(m.getKey());


    }
    
}
