package classtest;

/**
 * 抽象类
 * 
 * @author 涂宗勋
 * @date 2018年12月25日
 */
public abstract class MyAbsClass {

	/**
	 * 抽象方法,继承时必须实现
	 * 
	 * @auth 涂宗勋
	 */
	public abstract void test1();

	/**
	 * 非抽象方法可以不用管
	 * 
	 * @auth 涂宗勋
	 */
	public void checkData() {
		System.out.println("公共数据校验");
	}

	/**
	 * 重写父类示例
	 * 
	 * @auth 涂宗勋
	 */
	public void reWriteTest() {
		System.out.println("父类方法");
	}
}
