package mainPackage;

public class User {
	


	private String _name;
	private String _membership = "Bronze";
	
	public User() {
		
	}
	
	public User(String name, String membership) {
		set_name(name);
		set_membership(membership);
	}


	void set_name(String name) {
		_name = name;
	}
	
	
	String get_name() 
	{
		return _name;
	}
	
	void set_membership(String membership) {
		_membership = membership;
	}
	
	void set_membership(UserMemb membership) {
		_membership = membership.name();

	}

	public enum UserMemb {
		Bronze, Gold, Silver;

	}

	
	String get_membership() {
		return _membership;
	}

	}

