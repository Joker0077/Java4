package jicheng;

public class Animal {
	/**
	 * �������δ�����Կ���������������ظ��ˣ����º�����Ǵ���������ӷ�ף�
	 * ����ά���Բ���(ά������Ҫ�Ǻ�����Ҫ�޸ĵ�ʱ�򣬾���Ҫ�޸ĺܶ�Ĵ��룬���׳���)��
	 * ����Ҫ�Ӹ����Ͻ�������δ�������⣬����Ҫ�̳У�
	 * �����δ�������ͬ�Ĳ�����ȡ������� һ�����ࣺ
	 */
	private String name;
	private int id;
	public Animal (String myName, int myid){
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
}}
