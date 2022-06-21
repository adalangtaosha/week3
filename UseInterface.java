package week3;


import week3.supermarket.ExpireDateMerchandise;
import week3.supermarket.GamePointCard;
import week3.supermarket.MerchandiseV2;
import week3.supermarket.VirtualMerchandise;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {

        Date produceDate = new Date();//生产日期是当天
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);//一年后过期
        GamePointCard gamePointCard = new GamePointCard(
            "手机001", "Phone001", 100, 1999, 999,
            produceDate, expireDate
        );

        // phoneExtendsMerchandise.describe();


        // >> TODO 可以用实现接口的类的引用，给接口的引用赋值。
        //    TODO   使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;

        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;

        virtual = (VirtualMerchandise) m;

        if(m instanceof ExpireDateMerchandise){
            System.out.println("m 是 ExpireDateMerchandise 类型的实例");
        }

        if(m instanceof VirtualMerchandise){
            System.out.println("m 是 VirtualMerchandise 类型的实例");
        }
        // >> TODO 父类的引用可以用子类的引用赋值，抽象类也一样
        ExpireDateMerchandise am = gamePointCard;

        System.out.println(am.notExpireInDays(366));

        System.out.println(am.leftDatePercentage());

        System.out.println(am.actualValueNow(am.leftDatePercentage()));


    }
}
