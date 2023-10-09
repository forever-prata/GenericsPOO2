package att1;

public class Main {

	public static void main(String[] args) {
		MeuString<String> tipoString = new MeuString<String>("Uma String");
		MeuString<Integer> tipoInteger = new MeuString<Integer>(123);
		MeuString<Boolean> tipoBoolean = new MeuString<Boolean>(false);
		
		String s = tipoString.getDado();
		Integer i = tipoInteger.getDado();
		Boolean b = tipoBoolean.getDado();
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(b);
		

	}

}
