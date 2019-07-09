package function_rebuild.extract_method;

import java.util.Enumeration;
import java.util.Vector;

/**该示例表示重构前的类
 * 该示例是最复杂的情况,需要局部变量并且对局部变量做改变
 * @author:tianhaolin
 * @version:1.0
 */
public class ExtraMethod {
    private Vector _orders = new Vector();

    void printOwing(){
        Enumeration e = _orders.elements();
        double outstanding = 0.0;
        //calculate outstanding
        while(e.hasMoreElements()){
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        printDetails(outstanding);
    }

    void printDetails(double outstanding){
        System.out.println(outstanding);
    }

}
class Order{
    public double getAmount(){
        return 1.0;
    }
}
