public class Point {
	
	private float abscisse;
	private float ordonn�e;
	public static final Point POINT_ORIGINE = new Point(0.0F, 0.0F);
	
	public Point(float abscisse, float ordonn�e) {
		this.abscisse = abscisse;
		this.ordonn�e = ordonn�e;
	}
	
	public float getAbscisse() {
		return this.abscisse;
	}
	
	public float getOrdonn�e() {
		return this.ordonn�e;
	}
	
	public void translater(float tx, float ty) {
		this.abscisse += tx;
		this.ordonn�e += ty;
	}
	
	public void mettreAEchelle(float h) throws IllegalArgumentException {
		if (h <= 0.0F)
			throw new IllegalArgumentException("facteur erron�" + h);
		this.abscisse *= h;
		this.ordonn�e *= h;
	}
}
