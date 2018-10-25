package com.Practice.Ch7.Day4.Class;

public class Person {
	String name;
	int age;
	
	@Override
//	要实现对一个父类方法的重写，但是外面是使用子类来调用。
//	因为这里是重写，所以外壳不能变
//	我写这个方法的目的是为了自己构建一个（person）对equals方法的重写
//	object的equals方法对比的是它们的引用，即地址是否相同
//	而我想要对比两个对象的属性值是不是一样的这个需求。
//	所以传入的参数一定是一个object（父类）
	public boolean equals(Object obj) {
//		而我们需要使用的是子类的东西
//		所以这里需要拆包一下
//		就是把子类从父类中拆出来就可以使用了
		Person other = (Person)obj;
		if (this.name.equals(other.name) && (this.age == other.age)) {
			return true;
		}
		return false;
	}
}
