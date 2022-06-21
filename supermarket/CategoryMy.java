package week3.supermarket;
/*
    商品种类
 */
// >> TODO 使用enum而非class声明
public enum CategoryMy {

    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(20,200),
    DRINKS(2,200),
    COOK(100,500),
    SNACK(5,50),
    CLOTHES(20,2000),
    ELECTRIC(9,10000);

    // 可以有属性
    int lowerPrice;
    int higherPrice;

    // >> TODO 构造方法必须是private的，不写也是private的
    CategoryMy(int lowerPrice,int higherPrice) {
        this.lowerPrice = lowerPrice;
        this.higherPrice = higherPrice;
    }

    public int getLowerPrice() {
        return lowerPrice;
    }
    public void setLowerPrice(int lowerPrice){
        this.lowerPrice = lowerPrice;
    }

    public int getHigherPrice() {
        return higherPrice;
    }
    public void setHigherPrice(int higherPrice) {
        this.higherPrice = higherPrice;
    }




}
