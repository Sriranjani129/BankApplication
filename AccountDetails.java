package a1;

public class AccountDetails {
	private long accountNumber;
	private String userName;
	private String passWord;
	private int balance;
	private KycVerification kycDetails;
	private ContactDetails contactDetails;
	private int cashBack;
	
	public AccountDetails()
	{
		super();
	}
	
	public KycVerification getK()
	{
		return kyc;
	}

	public void setK(KycVerification kyc)
	{
		this.kyc= kyc;
	}
	
	public ContactDetails getC()
	{
		return contact;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KycVerification getKycDetails() {
		return kycDetails;
	}
	public void setKycDetails(KycVerification kycDetails) {
		this.kycDetails = kycDetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public int getCashBack() {
		return cashBack;
	}
	public void setCashBack(int cashBack) {
		this.cashBack = cashBack;
	}
	public AccountDetails(long accountNumber, String userName, String passWord, int balance, KycVerification kycDetails,
			ContactDetails contactDetails, int cashBack) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.balance = balance;
		this.kycDetails = kycDetails;
		this.contactDetails = contactDetails;
		this.cashBack = cashBack;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", userName=" + userName + ", passWord=" + passWord
				+ ", balance=" + balance + ", kycDetails=" + kycDetails + ", contactDetails=" + contactDetails
				+ ", cashBack=" + cashBack + "]";
	}
	
	

}
