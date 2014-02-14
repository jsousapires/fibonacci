package fibonacci.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	
	public int valorElemento(int elemento) {
		// TODO Auto-generated method stub
		if(elemento==0)
			return 0;
		else 
			if(elemento == 1)
				return 1;
			else
				return valorElemento(elemento-2) + valorElemento(elemento-1);
	}


}
