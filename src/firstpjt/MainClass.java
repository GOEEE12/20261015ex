package firstpjt;

public class MainClass {

	public static void main(String[] args) {
		
		int num = 10;
		int num2;
		num2 = 20;
		
		System.out.println("num: " + num);		
		System.out.println("num2: " + num2);
		
		int address = System.identityHashCode(num);
		System.out.println("address: "+ address);  //
		
		
		int n1 = 10;
		int n2 = 20;
		
		//Q) n1과 n2의 값을 교환하시오.
		int n0 = 0;
		n0 = n1;
		n1 = n2;
		n2 = n0;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		//Q) 가로와 세로 변수를 각각 만들고 방의 넓이를 구해보자
		int width;
		int height;
		
		width = 100;
		height = 50;
		System.out.println("방의 넓이: " + (width * height));


	}

}
