package function_rebuild.replace_method_with_methodobject;

/**替换之后的函数
 * @author:tianhaolin
 * @version:1.0
 */
public class Account_Rebuild {
    int gamma(int inputVal,int quantity,int yearToData){
        return new Gamma(this,inputVal,quantity,yearToData).compute();
    }

    public int delta(){
        return 20;
    }
}

