class MinAndMax {
	public static void main(String[] args){
		String baseStrD = "%s: от %d до %d\n";
		String baseStrE = "%s: от %e до %e\n";
		
		System.out.printf(baseStrD, "byte", Byte.MIN_VALUE, Byte.MAX_VALUE); // byte занимает 8 бит
		System.out.printf(baseStrD, "short", Short.MIN_VALUE, Short.MAX_VALUE); // short занимает 16 бит
		System.out.printf(baseStrD, "int", Integer.MIN_VALUE, Integer.MAX_VALUE); // int занимает 32 бита
		System.out.printf(baseStrD, "long", Long.MIN_VALUE, Long.MAX_VALUE); // long занимает 64 бит
		
		System.out.printf(baseStrE, "float", Float.MIN_VALUE, Float.MAX_VALUE); // float занимает 32 бита
		System.out.printf(baseStrE, "double", Double.MIN_VALUE, Double.MAX_VALUE); // double занимает 64 бит
	}
}