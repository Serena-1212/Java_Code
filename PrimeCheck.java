class PrimeCheck{
	public static boolean isPrime(){
	int a = 7;
	for(int i=2; i<= a/2; i++){
		if(a % i == 0){
			return false;
		}
	}
		return true;
	}

	public static void main(String[] args){
		boolean isCheck = isPrime();
		System.out.print(isCheck);
	}
}
