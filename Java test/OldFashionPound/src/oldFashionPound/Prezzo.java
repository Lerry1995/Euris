package oldFashionPound;

public class Prezzo {
	
	private int s;
	private int p;
	private int d;
	
	
	public Prezzo(int p,int s,int d) {
		this.p=p;
		this.d=d;
		this.s=s;
	}
	public Prezzo(Prezzo p) {
		this.p=p.getP();
		this.d=p.getD();
		this.s=p.getS();
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return p + "p " + s + "s " + d + "d";
	}
	
	
	
}