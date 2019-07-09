package function_rebuild.replace_method_with_methodobject;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Gamma {
    private final Account_Rebuild _account;
    private int inputVal;
    private int quantity;
    private int yearToData;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account_Rebuild _account, int inputVal, int quantity, int yearToData) {
        this._account = _account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToData = yearToData;
    }

    int compute(){
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * quantity) + 100;
        importantThing();
        importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    private void importantThing(){
        if(yearToData - importantValue1 > 100){
            importantValue2 -= 20;
        }
    }
}
