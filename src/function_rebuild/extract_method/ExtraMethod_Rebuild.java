package function_rebuild.extract_method;

import java.util.Enumeration;
import java.util.Vector;

/**该示例表示重构后的类
 * 该示例是最复杂的情况,需要局部变量并且对局部变量做改变
 * @author:tianhaolin
 * @version:1.0
 */
public class ExtraMethod_Rebuild {
    private Vector _orders = new Vector();

    void printOwing(){
        double outstanding = getOutStanding();
        printDetails(outstanding);
    }

    void printDetails(double outstanding){
        System.out.println(outstanding);
    }

    //Enumeration变量e只在被提炼的代码段中用到
    double getOutStanding(){
        Enumeration e = _orders.elements();
        double result = 0.0;
        while(e.hasMoreElements()){
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }
}
