package JavaProgram;

public class Suming {
	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1;i<=30;i++) {
//			if(i%2==0) {
//				sum =sum+i;	
//			}}
//			System.out.println(sum);
//			
//		}
//	}
 
		int num =123;
		int sum=0;
		while (num>0) {
			sum=num%10;
			num=num/10;
		}
		System.out.println(sum);
			
	}}