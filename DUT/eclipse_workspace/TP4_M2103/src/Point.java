public class Point {
	
	private float abscisse;
	private float ordonnée;
	public static final Point POINT_ORIGINE = new Point(0.0F, 0.0F);
	
	public Point(float abscisse, float ordonnée) {
		this.abscisse = abscisse;
		this.ordonnée = ordonnée;
	}
	
	public float getAbscisse() {
		return this.abscisse;
	}
	
	public float getOrdonnée() {
		return this.ordonnée;
	}
	
	public void translater(float tx, float ty) {
		this.abscisse += tx;
		this.ordonnée += ty;
	}
	
	public void mettreAEchelle(float h) throws IllegalArgumentException {
		if (h <= 0.0F)
			throw new IllegalArgumentException("facteur erroné" + h);
		this.abscisse *= h;
		this.ordonnée *= h;
	}
}
