class Palindrome
{
	public static void main(String args[])
	{
		int num =676;
		int rem,sum =0,temp;
		temp = num;
	while (num>0)
	{
		rem = num%10;
		sum = (sum*10)+rem;
		num = num/10;
	}
		if(temp==sum)
		System.out.println("palindrome number");
		else
		System.out.println("Not palindrome number");
	}
}
		
		