package chap2OperatorsAndStatements;

class Cast{
	public static void main(String... args){
		// incompatible types: char cannot be converted to String
		// String a = 'a';
		// either add a char to a String or use a StringBuilder or String.valueOf('c');
		String a = ""+'a';

		int anInt = 1;
		// ClassCastException
		// String test = (String)anInt;
		String test = Integer.valueOf(anInt).toString();

		int[] array = new int[]{1, 2, 3};
		Object obj = array;
		// ClassCastException 
		// String[] array2 = (String[]) obj;

		int aaa = new Integer(789);
		$l1: System.out.println(aaa);
	}
}