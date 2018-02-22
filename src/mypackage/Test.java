package mypackage;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Otteniamo un array di metodi della classe caricata. In questo caso è solo un metodo
			Method[] method= Test.class.getClassLoader().loadClass("mypackage.UseAnnotation").getMethods();
			
			// condizione vera se il metodo è stato annotato con l'annotazione specificata
			// in questo caso @MethodInfo
			if(method[0].isAnnotationPresent(MethodInfo.class)){
				System.out.println("The annotation is used.");
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
