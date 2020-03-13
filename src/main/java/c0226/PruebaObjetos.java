package c0226;

public class PruebaObjetos {

	public static void main(String[] args) throws Exception {
		ElementoDiccionario obj1 = new ElementoDiccionario();
		ElementoDiccionario obj2 = new ElementoDiccionario("objeto 2", 5);
		ElementoDiccionario obj3 = new ElementoDiccionario("abcd", 6);
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
		
		
		NumeroRacional n1 = new NumeroRacional(2,3);
		NumeroRacional n2 = new NumeroRacional(1,2);
		NumeroRacional n3 = n1.suma(n2);
		
		System.out.println("N1 es: " + n1);
		System.out.println("N2 es: " + n2);
		System.out.println("N3 es: " + n3);
		

	}

}
