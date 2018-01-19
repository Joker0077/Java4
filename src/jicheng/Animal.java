package jicheng;

public class Animal {
	/**
	 * 从这两段代码可以看出来，代码存在重复了，导致后果就是代码量大且臃肿，
	 * 而且维护性不高(维护性主要是后期需要修改的时候，就需要修改很多的代码，容易出错)，
	 * 所以要从根本上解决这两段代码的问题，就需要继承，
	 * 将两段代码中相同的部分提取出来组成 一个父类：
	 */
	private String name;
	private int id;
	public Animal (String myName, int myid){
		name = myName ;
		id= myid;
	}
public void eat(){
	System.out.println(name+ "吃饭");
}
public void sleep(){
	System.out.println(name+"sleep");
}
public void number(){
	System.out.println("大家好，我是"  +id+ "号"+name+".");
}}
