package org.tnsif.multipleinheritance;

public class TeamMembers extends TeamLead{
	
	private int size;
	private int duration;
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}

	


	public TeamMembers(String deptName, String name, int empId, String leadName, String projectName,
			int size, int duration) {
		super(deptName, name, empId, leadName, projectName);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.duration=duration;
	}



	@Override
	public String toString() {
		return "TeamMembers [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
