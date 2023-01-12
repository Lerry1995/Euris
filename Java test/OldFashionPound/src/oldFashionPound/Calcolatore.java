package oldFashionPound;


public class Calcolatore extends Utils{
	
	
	
	public static Prezzo somma(Prezzo p1, Prezzo p2) {
		
		double tot_pennies = (Utils.convertToPennies(p1)) + (Utils.convertToPennies(p2));
		
		return Utils.convertToPrezzo(tot_pennies);
	}
	
	public static String sottrazione(Prezzo p1, Prezzo p2) {
		double tot_pennies = (Utils.convertToPennies(p1)) - (Utils.convertToPennies(p2));
		Prezzo p= new Prezzo(Utils.convertToPrezzo(tot_pennies));
		if(p.getP()< 0 || p.getS()< 0 || p.getD()<0) {
			return "-" + moltiplicazione(p, -1);
		}
		else {
			return p.toString();
		}
	}
	
	public static String moltiplicazione(Prezzo p1, int molt) {
		
		double tot_pennies = (Utils.convertToPennies(p1) * molt);
		Prezzo p= new Prezzo(Utils.convertToPrezzo(tot_pennies));
		if(p.getP()< 0 || p.getS()< 0 || p.getD()<0) {
			return "-" + moltiplicazione(p, -1);
		}
		else {
			return p.toString();
		}
	}
	
	public static String divisione(Prezzo p1, int div) {
		String prezzo_finale="";
		
		
		double tot_pennies = Utils.convertToPennies(p1);
		double pennies_divisi= tot_pennies / div ;
		Prezzo p= new Prezzo(Utils.convertToPrezzo(pennies_divisi));
		prezzo_finale += p.toString() +" (";
		double resto=  tot_pennies % div ;
		p= new Prezzo(Utils.convertToPrezzo(resto));
		
		if(p.getP()>0) {
			prezzo_finale += p.getP() + "p ";
		}
		if(p.getS()>0) {
			prezzo_finale += p.getS() + "s ";
		}
		if(p.getD()>0) {
			prezzo_finale += p.getD() + "d";
		}
		return prezzo_finale + ")";
	}

}