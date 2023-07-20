class Wood{
	String type;
	String usedFor;
	int price;
	int weight;
	String exportedFrom;
	Wood(){
		super();
		System.out.println("Invoking in Wood Constructor");
		
	}
	Wood(String type){
		super();
		System.out.println("Invoking in Wood Constructor");
		
	}
	Wood(String type,String usedFor){
		this.usedFor=usedFor;
		
		System.out.println("Invoking in Wood Constructor");
		
	}
	Wood(String type,String usedFor,int price){
		
		this.weight=weight;
		this.exportedFrom=exportedFrom;
		System.out.println("Invoking in Wood Constructor");
		
	}
}