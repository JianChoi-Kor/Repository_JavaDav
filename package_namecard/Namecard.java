package package_namecard;

public class Namecard {
	
	private String name, phoneno, componyname; 
	
	public Namecard(String name, String phoneno, String componyname) {
		
		this.name = name;
		this.phoneno = phoneno;
		this.componyname = componyname;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public String getComponyname() {
		return componyname;
	}
	public void setComponyname(String componyname) {
		this.componyname = componyname;
	}
	
}

