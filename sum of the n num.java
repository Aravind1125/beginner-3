class java 
{
	public static void main (String[] args)                
{
int i,x;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		System.out.println("Enter value ..." +i);
		for(x = 0; x <= i; x++)
		{
			sum = sum + x;
		}
		System.out.println("Sum of the given num" +sum);
}
}