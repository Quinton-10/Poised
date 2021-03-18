

public class project {
	//Attributes
	int projectNum;
	String projectName;
	String buildingType;
	String address;
	int erf;
	Double totalFee;
	Double amountPaid;
	String dueDate;
	
	public project(int projectNum, String projectName, String buildingType, String address, int erf, Double totalFee, Double amountPaid, String dueDate) {
		this.projectNum = projectNum;
		this.projectName = projectName;
		this.buildingType = buildingType;
		
		this.address = address;
		this.erf = erf;
		this.totalFee = totalFee;
		this.amountPaid = amountPaid;
		this.dueDate = dueDate;
	}
	public int getProjectNum() {
		return projectNum;
	}
	public String getDueDate() {
		return dueDate;
	}
	public int getErf() {
		return erf;
	}
	public String toString() {
		//using toString method to change everything to a String
	      String output = "Project Number: " + projectNum;
	      output += "\nProject Name:" + projectName;
	      output += "\nBuilding Type:" + buildingType;
	      output += "\nPhysical address for project: " + address ;
	      output += "\nERF Number: " + erf;
	      output += "\nTotal fee for project: " + totalFee;
	      output += "\nAmount paid to date: " + amountPaid;
	      output += "\nDeadline for project: " + dueDate;
	      
	      return output;
	}
}
