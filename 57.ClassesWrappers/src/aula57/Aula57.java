package aula57;

public class Aula57 {

	public static void main(String[] args) {
		
		/* Classes Wrappers são classes dos tipos primitivos,
		 * no entanto em versões Java a partir do 9 as classes Warppers
		 * estão depreciadas */
		
		boolean var1 = true;
		char var2 = 'v';
		
		byte var3 = 10;
		short var4 = 20;
		int var5 = 30;
		long var6 = 40L;
		float var7 = 50f;
		double var8 = 60.0;
		
		var1 = new Boolean(var1);
		var2 = new Character(var2);
		
		var3 = new Byte(var3);
		var4 = new Short(var4);
		var5 = new Integer(var5);
		var6 = new Long(var6);
		var7 = new Float(var7);
		var8 = new Double(var8);
		

	}

}
