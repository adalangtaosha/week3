package week3;

import week3.supermarket.LittleSuperMarket;
import week3.supermarket.Phone;
import week3.supermarket.ShellColorChangePhone;

public class TestVizAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        // >> TODO 不同包里的代码，不可以访问缺省和protected
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);

//        System.out.println(ph.screenSize);
//        System.out.println(ph.memoryG);
        // >> TODO 不同包里的代码，不可以访问缺省和protected
        ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
//        System.out.println(scp.screenSize);
//        System.out.println(scp.memoryG);

    }

}
