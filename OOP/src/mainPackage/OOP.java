package mainPackage;

public class OOP {
	
	//pillars OOP: incapsulare, mostenire, polimorfism, abstract

	public static void main(String[] args) {
		System.out.println("hello world");
		
		User u = new User("Alin" , "Bronze");
		User u2 = new User();
		
		
		System.out.println(u2.get_name());
		System.out.println(u2.get_membership());
		
	}

}
