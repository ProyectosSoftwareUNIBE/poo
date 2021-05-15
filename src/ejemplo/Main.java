package ejemplo;

import java.util.Arrays;

import ejemplo.cuenta.Account;
import ejemplo.cuenta.Matriz;

public class Main {

	public static void main(String[] args) {

		Account account= new Account();
		
		account.setAmount(100.00);
		
		Account account1=new Account("Rafael", "2012089Ty","Ahorros", 123.10, 2.2);
		
		System.out.println(account.toString());
		
		System.out.println(account1.getInterestOfAccount(12,0));
		int[] arreglo= {1,4,-9,10};
		Matriz matriz= new Matriz(arreglo);
		int result=matriz.getHigherNumner();
		int [] resultArray= matriz.getArreglo();
		System.out.println(result);
		System.out.println(Arrays.toString(resultArray));
		
		
		
		

	}

}
