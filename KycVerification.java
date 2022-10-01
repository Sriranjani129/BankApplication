package a1;

public class KycVerification {
     private String panNUmber;
     private long aadharNumber;
     private String documentType;
     private String documentNumber;
	public String getPanNUmber() {
		return panNUmber;
	}
	public void setPanNUmber(String panNUmber) {
		this.panNUmber = panNUmber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public KycVerification(String panNUmber, long aadharNumber, String documentType, String documentNumber) {
		super();
		this.panNUmber = panNUmber;
		this.aadharNumber = aadharNumber;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	@Override
	public String toString() {
		return "KycVerification [panNUmber=" + panNUmber + ", aadharNumber=" + aadharNumber + ", documentType="
				+ documentType + ", documentNumber=" + documentNumber + "]";
	}
     
}
