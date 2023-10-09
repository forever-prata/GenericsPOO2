package att4;

public class Main {
	public static void main(String[] args) {
		Lista l = new Lista();
		Nodo<Integer> n1 = new Nodo<Integer>("N", 1);
		Nodo<Double> n2 = new Nodo<Double>("N", 1.5);
		Nodo<String> n3 = new Nodo<String>("N3", "Uma String");
		Nodo<String> n4 = new Nodo<String>("N3", "Uma String");
		Nodo<Double> n5 = new Nodo<Double>("N5", 1.5);
		Nodo<Boolean> n6 = new Nodo<Boolean>("N5", false);
		Nodo<Boolean> n7 = new Nodo<Boolean>("N7", false);
		
		System.out.println(l.inserir(n1));
		System.out.println(l.inserir(n2));
		System.out.println(l.inserir(n3));
		System.out.println(l.inserir(n4));
		System.out.println(l.inserir(n5));
		System.out.println(l.inserir(n6));
		System.out.println(l.inserir(n7));
	
		
	}
}
