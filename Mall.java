class Mall{
	String type;
	String stores;
	int mallRentPrice;
	String mallLocation;
	String owner;
	Mall(){
		super();
		System.out.println("Invoking in mall Constructor");
		
	}
	Mall(String type){
		this();
		this.type=type;
		
		System.out.println("Invoking in mall Constructor");
		
	}
	Mall(String type,String stores){
		this(type);
		this.stores=stores;
		
		System.out.println("Invoking in mall Constructor");
		
	}
	Mall(String type,String stores,int mallRentPrice){
		this(type,stores);
		this.mallRentPrice=mallRentPrice;
		this.mallLocation=mallLocation;
		this.owner=owner;
		System.out.println("Invoking in mall Constructor");
		
	}
	Mall(String type,String stores,int mallRentPrice,String mallLocation){
		this(type,stores,mallRentPrice);
		this.mallLocation=mallLocation;
		this.owner=owner;
		System.out.println("Invoking in mall Constructor");
		
	}
	Mall(String type,String stores,int mallRentPrice,String mallLocation,String exportedFrom){
		this(type,stores,mallRentPrice,mallLocation);
		this.owner=owner;
		System.out.println("Invoking in mall Constructor");
		
	}
}