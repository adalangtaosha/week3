package week3;

import week3.supermarket.Category;
import week3.supermarket.CategoryMy;

import java.util.Scanner;

public class UseEnumMy {
    public static void main(String[] args) {
        // >> TODO 获取所有枚举，看看枚举实例有哪些方法
        for (CategoryMy category : CategoryMy.values()) {
            System.out.println("-----------" + category.getLowerPrice() + "------------");
            System.out.println("-----------" + category.getHigherPrice() + "------------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
        }

        System.out.println();
        // >> TODO 根据名字获取枚举
        System.out.println(Category.valueOf("FOOD"));//查找FOOD的id
//        System.out.println(Category.valueOf("food"));



    }
}
