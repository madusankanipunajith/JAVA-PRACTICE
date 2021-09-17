
public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	
	
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}


	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		if(vehicle.getSelledOut() == false) {
			if(finance == true) {
				double balance = vehicle.getPrice() - this.cashOnHand;
				System.out.println("Dear "+this.name +", You have to pay "+ balance+" dollars more....");
				
			}else if(vehicle.getPrice() <= this.cashOnHand) {
				System.out.println("Transaction has completed...Employee name is "+employee.getName());
				this.setCashOnHand(this.cashOnHand-vehicle.getPrice());
				vehicle.setSelledOut(true);
				
				System.out.println("New Customer updated details\n"+"Customer new cashOnHand is "+ this.cashOnHand);
			}else {
				System.out.println("Sorry you cannot buy this car...");
			}
			
		}else {
			System.out.println("Vehicle is already sold out...");
		}
		
	}

}
