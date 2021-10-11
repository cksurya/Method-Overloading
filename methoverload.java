class Methoverload{
	void Test(int ivalue){
	System.out.println(ivalue +" Increasing Parameter list");
	}
	void Test(int ivalue, int jvalue){
	System.out.println(ivalue+" Increasing Parameter list "+ jvalue);
		}
	void Test(int ivalue, int jvalue, int kvalue){
		System.out.println(ivalue+" Increasing Parameter list "+ jvalue + " "+ kvalue);
	}

	public static void main(String[] args){
	Methoverload obj = new Methoverload();
	obj.Test(5);
	obj.Test(2,3);
	obj.Test(2,3,4);
}
}
