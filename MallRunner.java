class MallRunner{
	public static void main(String[] args)
	{
		Mall mall=new Mall();
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+mall.type);
		System.out.println("stores"+mall.stores);
		System.out.println("mallRentPrice"+mall.mallRentPrice);
		System.out.println("mallLocation"+mall.mallLocation);
		System.out.println("owner"+mall.owner);
		
       Mall mall1=new Mall("Fashion mall","beauty products");
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+mall1.type);
		System.out.println("stores"+mall1.stores);
		Mall mall2=new Mall("Fashion mall","beauty products",10000,"Rajajinagar","Deepthi");
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+mall2.type);
		System.out.println("Stores"+mall2.stores);
		System.out.println("mallRentPrice"+mall2.mallRentPrice);
		System.out.println("mallLocation"+mall2.mallLocation);
		System.out.println("ownwer"+mall2.owner);
		
		
	}
}
	