package a1;
 
import java.util.Scanner;
import java.util.Random;

public class Application {
	
	AccountDetails allAccount[] = new AccountDetails[1000000];
	int noOfAccountDetails = 0;


	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Application app=new Application();
	while (true) {
		System.out.println(" ------------Bank Detail-----------");
		System.out.println("1. Submit user details ");
		System.out.println("2. Do Deposit Operation ");
		System.out.println("3. Do withDrawal Operation ");
		System.out.println("4. Print user all details");
		System.out.println("5  Print user Contact Details");
		System.out.println("6. Print user KYC document details");
		System.out.println("7. Print Balance");
		System.out.println("8. Change Mobile Number");
		System.out.println("9. Change EmailId");


		System.out.println("0. Exit ");

		System.out.println("Enter ur choice :- ");

		switch (app.sc.nextInt()) {

		case 1:
			app.submitUserDetails();
			break;
		case 2:
			app.deposit();
			break;
		case 3:
			app.withdraw();
			break;
		case 4:
			app.viewAllUserDetails();
			break;
		case 5:
			app.viewContactDedtails();
			break;
		case 6:
			app.viewKycVerification();
			break;
		case 7:
			app.balance();
			break;
		case 8:
			app.changeMobileNumber();
			break;
		case 9:
			app.changeEmailId();
			break;



		default:
			System.out.println("Exit ");
			System.exit(0);
		}//end of switch

	}

}
public void submitUserDetails() {
	// TODO Auto-generated method stub
	System.out.println("Enter your Name");
	String name=scStr.nextLine();
	
	System.out.println("Enter your Account Number");
	long accNo=sc.nextLong();
	
	
	System.out.println("Enter your Password");
	String password=scStr.nextLine();

	System.out.println("Enter your Balance");
	int balance=sc.nextInt();
	
	System.out.println("Enter your PanNumber");
	String panNo=scStr.nextLine();
	
	System.out.println("Enter your Aadhar Number");
	long aadhar=sc.nextLong();
	
	System.out.println("Enter the document type");
	String doctype=scStr.nextLine();
	
	System.out.println("Enter the document Number");
	String docNo=scStr.nextLine();
	

	System.out.println("Enter the house number");
	String houseNo=scStr.nextLine();
	

	System.out.println("Enter the Locality Name");
	String locName=scStr.nextLine();
	

	System.out.println("Enter the City Name");
	String cityName=scStr.nextLine();
	
	
	System.out.println("Enter the State Name");
	String stateName=scStr.nextLine();
	

	System.out.println("Enter the Country Name");
	String countryName=scStr.nextLine();
	

	System.out.println("Enter the pincode");
	long pincode=sc.nextLong();
	
	System.out.println("Enter the Mobile Number");
	long mobileNo=sc.nextLong();
	
	System.out.println("Enter the EmailId");
	long email=sc.nextLong();
	


	
	ContactDetails contact =new ContactDetails(houseNo,locName,cityName, stateName, countryName, pincode, mobileNo, email);
	KycVerification kyc= new KycVerification(panNo, aadhar, doctype, docNo);
	AccountsDetails a= new AccountDetails(int()accNo,name,password,balance);

	a.setK(kyc);
	a.setC(contact);
	
	allAccount[noofAccountDetails++]=a;
	System.out.println(" "+a);
	System.out.println("Added in the list");

}


public void deposit() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Deposit amount");
	int amount=sc.nextInt();
	System.out.println("Enter the Account Number to be Deposited");
	int searchAccNumber=sc.nextInt();
	
	for(int i=0;i<noofAccountDetails;i++)
	{
		AccountDetails a= allAccount[i];
		boolean isFound=(a.getAccNo() == searchAccNumber)?true:false;
		
		if(isFound)
		{
			a.setBalance(a.getBalance()+amount);
			System.out.println("Amount Transfer Done");
			System.out.println(a.getAccNo()+"-"+a.getBalance());
		}
	}
	
	
}


public void withdraw() {
	// TODO Auto-generated method stub
	System.out.println("Enter the WithDrawal amount");
	int amount=sc.nextInt();
	System.out.println("Enter the Account Number");
	int searchAccNumber=sc.nextInt();
	
	for(int i=0;i<noofAccountDetails;i++)
	{
		AccountDetails a= allAccountDetails[i];
		boolean isFound=(a.getAccNo() == searchAccNumber)?true:false;
		
		if(isFound)
		{
			a.setBalance(a.getBalance()-amount);
			System.out.println("Withdrawal of amount has to been done");
			System.out.println(a.getAccNo()+"-"+a.getBalance());
		}
	}
}


public void viewAllUserDetails() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Nummber");
	long searchAccNo=sc.nextInt();
	AccountDetails a=printall(searchAccNo);
	System.out.println("a");
	
}


public void viewContactDedtails() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Nummber");
	long searchAccNo=sc.nextInt();
	AccountDetails a=printall(searchAccNo);
	System.out.println(a.getContactDetails());

}


private void viewKycVerification() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Nummber");
	long searchAccNo=sc.nextInt();
	AccountDetails a=printall(searchAccNo);
	System.out.println(a.getKyc());
}


private void balance() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Nummber");
	long searchAccNo=sc.nextInt();
	AccountDetails a=printall(searchAccNo);
	System.out.println(a.getBalance());

}


private void changeMobileNumber() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Nummber");
	long searchAccNo=sc.nextInt();
	AccountDetails a=printall(searchAccNo);
	System.out.println(a.getMobileNumber());
	System.out.println("Enter the mobile Nummber");
	long mobileNo=sc.nextInt();
}


private void changeEmailId() {
	// TODO Auto-generated method stub
	System.out.println("Enter the Account Number");
	long accNo = sc.nextLong();

	AccountDetails a = printall(accNo);

	System.out.println(a.getContactDetails());

	System.out.println(" Enter New Email Id ");
	String eID = scStr.nextLine();

	a.getContactDetails().setEmailId(eID);

	System.out.println("your new Email Id-    " + a.getContactDetails().getEmailId());

   }

}
	


