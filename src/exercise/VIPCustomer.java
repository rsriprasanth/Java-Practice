package exercise;

/**
 * Class for Vip Customer Challenge
 * 
 * @author rsrip
 *
 */
public class VIPCustomer {
	private String name;
	private int creditLimit;
	private String emailAddress;

	public VIPCustomer() {
		this("VIPCustomer", 10000, "vipcustomer@gmail.com");
	}

	public VIPCustomer(String name, int creditLimit) {
		this(name, creditLimit, "vipcustomer@gmail.com");
	}

	public VIPCustomer(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static void main(String[] args) {
		VIPCustomer sri = new VIPCustomer();
		System.out.println("Name: " + sri.getName() + " Credit Limit: " + sri.getCreditLimit() + " Email: "
				+ sri.getEmailAddress());
		VIPCustomer jake = new VIPCustomer("Jake", 12000);
		System.out.println("Name: " + jake.getName() + " Credit Limit: " + jake.getCreditLimit() + " Email: "
				+ jake.getEmailAddress());
		VIPCustomer dawn = new VIPCustomer("Dawn", 15000, "dawn@gmail.com");
		System.out.println("Name: " + dawn.getName() + " Credit Limit: " + dawn.getCreditLimit() + " Email: "
				+ dawn.getEmailAddress());
	}

}
