public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ///////////////////////////////////////////////
		// Student类是一种类型,可以用来声明变量.引用类型的变量又被称为引用.
		Student stu1;
		Student stu2;

		// ////////////////////////////////////////////////
		// 引用类型有两种存放形式,一个是引用.一个是对象
		// new Student()会创建一个对象(也被称为实例).我们创建好一个对象,然后把对象赋值给一个引用
		// 这样的话,我们就可以通过引用来调用对象上面定义好的属性和方法
		// 引用和对象之间的关系就是现实中遥控器和电视之间的关系
		Student stu = new Student();

		// 通过引用来调用对象上面定义好的属性
		stu.age = 23;
		stu.name = "张三";
		stu.schoolName = "动力";
		// stu.job = "高级软件工程师"; // Student类中并没有定义job属性,所以无法调用

		// 通过引用来调用对象上面的方法
		stu.study("CoreJava");
		String info = stu.getInfo();
		System.out.println(info);
	}
}
