package function_rebuild.replace_method_with_methodobject;

/**未替换之前的函数
 * @author:tianhaolin
 * @version:1.0
 */
public class Account {
    int gamma(int inputVal,int quantity,int yearToData){
        int importValue1 = (inputVal * quantity) + delta();
        int importValue2 = (inputVal * quantity) + 100;
        if(yearToData - importValue1 > 100){
            importValue2 -= 20;
        }
        int importValue3 = importValue2 * 7;
        return importValue3 - 2*importValue1;
    }

    public int delta(){
        return 20;
    }
}

