package suanfa;

public class Test1 {
	/*
	 * 求1-100的和
	 */

	public static void Sum(){
		int sum = 0;
		for(int i = 1;i<=100;i++){
			
			sum +=i; 
		}
		System.out.println("1-100的和为：" +sum);
	}
}
