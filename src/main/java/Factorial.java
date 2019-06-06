
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		Factorial factorial=new Factorial();
		int result=factorial.factorialProcedure(number);
		int result2=factorial.factorialRecursive(number);
		System.out.println("The Factorial procedure is "+result);
		System.out.println("The Factorial recursive is "+result2);
	}
	
	public int factorialProcedure(int number) {
		int result=1;
		if(number>0) {
			for(int i=1;i<=number;i++) {
				result=result*i;
			}
			return result;
		}
		return result;
	}
	
	public int factorialRecursive(int number) {
		int result=1;
		if(number>0)
			result=number*factorialRecursive(number-1);
		return result;
	}

}
