package week3.intf;

// >> TODO 接口也可以继承接口。接口可以继承多个接口，接口之间的继承要用extends
// >> TODO 接口不可以继承类
// >> TODO 继承的接口，可以有重复的方法，但是签名相同时，返回值必须完全一样，否则会有编译错误
// >> TODO 但是签名不同时，返回值类型可不同，同重载
public interface Intf3 extends Intf1, Intf2{
    void m3();
}