class WoodRunner{
	public static void main(String[] args)
	{
		Wood wood=new Wood();
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+wood.type);
		System.out.println("type"+wood.usedFor);
		System.out.println("type"+wood.price);
		System.out.println("type"+wood.weight);
		System.out.println("type"+wood.exportedFrom);
		
		Wood wood1=new Wood("Sandal","Door");
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+wood1.type);
		System.out.println("type"+wood1.usedFor);
		Wood wood2=new Wood("Sandal","Door",10000,500,"Mysore");
		System.out.println("Invokin woodrunner in constructor");
		System.out.println("type"+wood2.type);
		System.out.println("type"+wood2.usedFor);
		System.out.println("type"+wood2.price);
		System.out.println("type"+wood2.weight);
		System.out.println("type"+wood2.exportedFrom);
		
	}
}
	