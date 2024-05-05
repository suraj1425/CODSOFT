import java.util.*;

class task2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 subject marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		double avg=(m1+m2+m3)/3;

		if(avg>84){
			System.out.println("GRADE = A");
		}
		else if(avg>75){
					System.out.println("GRADE = B");
		}
		else if(avg>60){
					System.out.println("GRADE = C");
		}
		else if(avg>45){
					System.out.println("GRADE = D");
		}
		else if(avg>34){
					System.out.println("GRADE = E");
		}
		else if(avg<35){
							System.out.println("GRADE = F");
		}

	}

}