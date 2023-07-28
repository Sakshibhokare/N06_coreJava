
package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {

		HDFC h=new HDFC();
		h.setAccType("Saving Accout");
		h.setAccountNo(3796329601709l);
		h.setAtmCardNo(97896964);
		h.setPinNo(7585);
		

//		System.out.println("Account No is:" + h.getAccountNo());
		
//		below line will call tostring() method 
		System.out.println(h);
	}

}
