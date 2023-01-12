package oldFashionPound;



public class Utils {
	public static Prezzo fromStringToPrezzo(String s) {
		
		String[] ar = convertToArray(s);
		Prezzo p= new Prezzo(Integer.parseInt(ar[0]),Integer.parseInt(ar[1]),Integer.parseInt(ar[2]));
		
		return p;
		
	}
	
	public static String[] convertToArray(String s) {
		String[] ar = s.split(" ");
		for(int i=0; i<ar.length;i++) {
			String num = ar[i].substring(0, ar[i].length()-1);
			ar[i]=num;
		}
		return ar;
	}
	
	public static double convertToPennies(Prezzo p) {
		double prezzo_pennies = (Double)(p.getP()*20.0*12.0 + p.getS()*12.0 + p.getD());
		
		return prezzo_pennies;
		
	}
	
	public static Prezzo convertToPrezzo(double tot) {
		Prezzo p= new Prezzo(0,0,0);
		
		double prezzop=(((tot)/12.0)/20.0);
		double prezzos=((tot)/12)%20;
		double prezzod=((tot)%12);
		p.setP((int)prezzop);
		p.setS((int)prezzos);
		p.setD((int)prezzod);
		
		
		return p;
		
	}
	
	

}
