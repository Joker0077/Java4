package jicheng;
/**
 * 2018/1/20
 * @author asus
 */

/*
public class Penguin {
	private String name;
	private int id;
	public Penguin (String myName, int myid){
		name = myName ;
		id= myid;
	}
public void eat(){
	System.out.println(name+ "�Է�");
}
public void sleep(){
	System.out.println(name+"sleep");
}
public void number(){
	System.out.println("��Һã�����"  +id+ "��"+name+".");
}
} */
public class Penguin extends Animal{
	public Penguin (String myName, int myid){
		super(myName, myid);
	}
}