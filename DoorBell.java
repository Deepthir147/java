class DoorBell{
	String music;
	String sound;
	int price;
	String connection;
	String doorBellSpeaker;
	DoorBell(){
		System.out.println("Invoking cricket in cricket");
		
		System.out.println("music"+this.music);
		System.out.println("sound"+this.sound);
		System.out.println("price"+this.price);
		System.out.println("connection"+this.connection);
		System.out.println("doorBellSpeaker"+this.doorBellSpeaker);

		System.out.println("########################");

	}
	DoorBell(String music){
		
		System.out.println("Invoking player in carrom");
		this.music=music;
		
	}
	DoorBell(String music,String sound){
		
		System.out.println("Invoking player in carrom");
		this.music=music;
		this.sound=sound;
		
	}
	DoorBell(String music,String sound,int price){
		
		System.out.println("Invoking player in carrom");
		this.music=music;
		this.sound=sound;
		this.price=price;
		
		
	}
	DoorBell(String music,String sound,int price,String connection){
		
		System.out.println("Invoking player in carrom");
		this.music=music;
		this.sound=sound;
		this.price=price;
		this.connection=connection;
	
		
		
	}
	DoorBell(String music,String sound,int price,String connection,String doorBellSpeaker){
		
		System.out.println("Invoking player in carrom");
		this.music=music;
		this.sound=sound;
		this.price=price;
		this.connection=connection;
		this.doorBellSpeaker=doorBellSpeaker;
	
		
		
	}
}
	