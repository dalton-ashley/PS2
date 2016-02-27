package base;

public class MyInteger {
	private int value;
	
	public MyInteger(int iValue){
		  value = iValue;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if(value%2==0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if(value%2!=0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		int i = 0;
		for(i=2;i<=value/2;i++){
			if(value%i!=0)
				return true;
		}
		return false;
	}
	
	public static boolean isEven(int value){
		if(value%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value){
		if(value%2!=0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int value){
		int i = 0;
		for(i=2;i<=value/2;i++){
			if(value%i!=0)
				return true;
		}
		return false;
	}
	
	public static boolean isEven(MyInteger iValue){
		return MyInteger.isEven(iValue.getValue());
	}
	
	public static boolean isOdd(MyInteger iValue){
		return MyInteger.isOdd(iValue.getValue());
	}
	
	public static boolean isPrime(MyInteger iValue){
		return MyInteger.isPrime(iValue.getValue());
	}
	
	public boolean equals(int iValue){
		return getValue() == iValue;
	}
	
	public boolean equals(MyInteger iValue){
		return equals(iValue.getValue());
	}
}
