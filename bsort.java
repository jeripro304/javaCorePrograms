import java.util.Scanner;
class bsort
{
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int num=sc.nextInt();
		int n[]=new int[num];
		for(int i=0;i<num;i++)
		{
			n[i]=sc.nextInt();
		}
		int temp;
		for (int j=0;j<num;j++){
			for (int g=0;g<num-1;g++){
				if (n[g]>n[g+1]){
					temp=n[g];
					n[g]=n[g+1];
					n[g+1]=temp;
				}
			}
		}
		System.out.print("[");
		for (int t=0;t<num;t++){
			System.out.print(" "+n[t]);
		}
		System.out.print("]");
	}
	

}