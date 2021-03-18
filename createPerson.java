
public class createPerson {
	//Attributes
	String relation;
	String name;
	String surname;
	String tellNum;
	String email;
	String physicalAddress;
	
	public createPerson(String relation, String name, String surname, String tellNum, String email, String physicalAddress) {
		this.relation = relation;
		this.name = name;
		this.surname = surname;
		this.tellNum = tellNum;
		this.email = email;
		this.physicalAddress = physicalAddress;
	}
	public String getSurname (){
		return surname;
	}
	public String getName () {
		return name;	
	}
	public String toString() {
		//converts everything to a String with toSting function
	      String output = relation; 
	      output +=	"\nName:" + name;
	      output += "\nSurname:" + surname;
	      output += "\nTelephone Number: " + tellNum ;
	      output += "\nemail: " + email;
	      output += "\nPhysical address: " + physicalAddress;
	      
	      return output;
	}
	
	
	

}
