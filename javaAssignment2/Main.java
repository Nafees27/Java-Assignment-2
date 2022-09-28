package javaAssignment2;

public class Main {


	enum typeOfAccount
	{
		SAVINGS,
		CURRENT;
	}
	public static void main(String[] args)
	{
		Bank ob = new ICICI("12345","ICICI","ICIC000213","NOida",typeOfAccount.CURRENT,10000);
		System.out.println(ob.getAccountNo());
		System.out.println(ob.getBalance());
		System.out.println(ob.getIFSC());
		System.out.println(ob.getTp());
		System.out.println(ob.getName());
		ob.withdraw(2000);


		System.out.println(ICICI.getBankName());

		ob.deposit(100);
		ob.withdraw(20);
		System.out.println("balance after Transation : "+ob.getBalance());
	}


}
