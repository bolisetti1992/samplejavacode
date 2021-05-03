//given number is amstrong or not

class Amstrong{
	public static void main(String[] args) 	{
		int c=0,n=407,temp,a;
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		System.out.println("given number  is amstrong");

		else{
		System.out.println("given number is not amstrong");
		}
	}
}
