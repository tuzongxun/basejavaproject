package classtest;

/**
 * MyInterface的子类2
 * 
 * @author 涂宗勋
 * @date 2018年12月25日
 */
public class WeixinPayClass extends MyAbsClass implements PayInterface {
	/**
	 * //public void test(){};没有static修饰的，属于对象，也就是需要new 之后再调用 例如：WeixinPayClass
	 * wx=new WeixinPayClass(); wx
	 */
	// 实例变量，只属于对象，也就是new了以后才能用；
	private String name;
	// 有static的叫类变量，或者叫静态变量
	private static String name1;// public static void test(){};
	// 常量，只是特殊的静态变量，使用方式同静态变量
	private static final String NAME = "";
	// private static String WeixinPayClass;

	public String pay() {
		// 静态变量直接用类名调用
		System.out.println(WeixinPayClass.name1);
		// 实例变量必须用new出来的对象调用
		WeixinPayClass weixinPay = new WeixinPayClass();
		System.out.println(weixinPay.name);

		return "微信支付";
	}

	@Override
	public void test1() {
		System.out.println("wx ");

	}

	public static void main(String[] args) {

	}

	public void test() {

	}

	public static void test2() {

	}

	/**
	 * 重写：快捷键alt+shift+s ；重写最简单直接的理解就是：基于父类和子类，方法名和参数定义都一模一样，只是具体实现不一样
	 * 但是，重写的概念不止这些
	 */
	@Override
	public void reWriteTest() {
		System.out.println("");
	}

	/**
	 * 重载：最直观的感受就是，同一个类里边，方法名一样，参数不一样(个数、顺序等)
	 * 
	 * @auth 涂宗勋
	 * @param name
	 */
	public void getUserInfo(String name) {
		System.out.println(name);
	}

	public void getUserInfo(String name, int age) {
		if (name != null && age != 0) {
			System.out.println(name + age);
		} else {
			System.out.println("输入信息有误");
		}

	}

	public void getUserInfo(int age, String name) {

	}

	public void getUserInfo(String name, int age, String phone) {

	}

}
