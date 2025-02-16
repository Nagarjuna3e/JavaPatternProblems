package patterProgrames;

public class Butterfly {

	public static void main(String[] args) {
		String str="arjun";
		System.out.println(str.substring(0,str.length()));

	}
	public static void pattern5(int num) {
		for(int i=1;i<2*num;i++) 
		{
			for(int j=1;j<2*num;j++)
			{
				if((i>=j && i+j<=2*num)||(i<=j && i+j>=2*num))
					{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
