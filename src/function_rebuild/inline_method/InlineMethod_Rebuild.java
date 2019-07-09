package function_rebuild.inline_method;

/**一个简单的使用内联函数的示例
 * @author:tianhaolin
 * @version:1.0
 */
public class InlineMethod_Rebuild {
    private int _numberOfLateDeliveries;
    int getRating(){
        return (_numberOfLateDeliveries>5?2:1);
    }
    /*
    boolean moreThanFiveLateDeliveries(){
        return _numberOfLateDeliveries > 5;
    }
    */
}
