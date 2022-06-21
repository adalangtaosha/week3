/*
     子类
     继承
     super
 */
package week3.supermarket;

//Phone 继承了MerchandiseV2，是它的子类
public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    protected double screenSize;
    private double cpuHZ;
    int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;  //最多可以购买5部手机

    // >> TODO buy()覆盖父类 MerchandiseV2 的buy()方法
    // >> TODO 使用super可以调用父类的方法和属性（当然必须满足访问控制符的控制）
    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }
    protected String getNameOfPhone() {
        return this.brand + ":" + this.os + ":" + super.getName();
    }
    // 覆盖父类的getName()
    public String getName() {
        return this.brand + ":" + this.os + ":" + name;
    }

    // 覆盖父类的describe()
    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
            "屏幕：" + screenSize + "寸\n" +
            "cpu主频" + cpuHZ + " GHz\n" +
            "内存" + memoryG + "Gb\n" +
            "存储空间" + storageG + "Gb");
    }

    // >> TODO super是子类和父类交流的桥梁，但是并不是父类的引用
    // >> TODO super和this自引用不一样，不是简单可以模拟的
//    public MerchandiseV2 getParent(){
//        return super;
//    }

    public Phone getThisPhone(){
        return this;
    }

    // >> TODO 使用super可以调用父类的public属性，但是super不是一个引用。
    public void accessParentProps() {
        System.out.println("父类里的name属性：" + super.name);
    }

    public void useSuper() {
        // >> TODO super的用法就像是一个父类的引用。它是继承的一部分，像组合的那部分，但不是全部
        super.describe();
        super.buy(66);
        System.out.println("父类里的count属性：" + super.count);
    }

    public Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        // >> TODO 创建子类对象的同时创建了一个隐藏的父类对象

        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        // >> TODO 子类使用父类的方法
        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
