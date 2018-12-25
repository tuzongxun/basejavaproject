package classtest;

/**
 * MyAbsClass的子类，具体实现test1方法 ；MyInterface的子类1
 * 
 * @author 涂宗勋
 * @date 2018年12月25日
 */
public class AliPayClass extends MyAbsClass implements PayInterface {

	@Override
	public void test1() {
		checkData();
		// 子类可以直接调用父类的方法
		reWriteTest();
		// 一个子类如果要调用另一个子类的方法，必须先创建另一个子类的对象再调用
		/**
		 * 下述两种写法作用其实是一样的
		 */
		// 写法一，直接用本类调用本类的方法
		WeixinPayClass weixinPayClass = new WeixinPayClass();
		weixinPayClass.reWriteTest();
		// 写法二，使用了java多态的特性，使用父类声明调用方法，实际调用的是子类重写后的方法
		MyAbsClass myAbsClass = new WeixinPayClass();
		myAbsClass.reWriteTest();

		System.out.println("ali 子类的实现");
	}

	public String pay() {
		return "支付宝支付";
	}

}
