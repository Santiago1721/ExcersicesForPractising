public class Multiplica10PrimerosImpares {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		long productoImpares = 1;  //se empieza desde 1 ya que los impares empiezan desde tal numero
		
		for(int i = 1;i <20; i+=2) {           //empleamos un bucle for que leera los valores introducidos hasta que sean menores a 20, y mientras la condicion se cumpla,
			productoImpares = productoImpares*i; //se sumara de dos en dos por cada valor impar
			
			System.out.println("el resultado de la multiplicacion"
					+ " de los numeros impares es" +productoImpares);
		}

	}

}
