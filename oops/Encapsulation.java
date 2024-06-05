package oops;


class Account{
	private String accHolderName;
	private long accNo;
	boolean access = false;
	
	public void setACCHolderName(String accHolderName ) {
		this.accHolderName = accHolderName;
	}
	
	public void setAccNo(long accNo) {	
		this.accNo = accNo;
	}
	
	public String getACCHolderName() {
		return accHolderName;
	}
	
	
	public boolean getAccess() {
		access = true;
		return access;
	}
	public long getAccNo() {
		 
		 if(access == true) {
			 return accNo;
		 }else {
			 System.out.println("get access first");
		 }
		 
		 return 0;
	}

	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", accNo=" + accNo + ", access=" + access + "]";
	}
	
	
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setACCHolderName("umesh");
		acc.setAccNo(5564414);
		acc.getAccess();
		System.out.println(acc.getAccNo());
	}
}
