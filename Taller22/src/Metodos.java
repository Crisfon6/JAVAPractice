
public class Metodos {
	public double Sumatoria(double[] x) {
		double sumatoria =0;
		for (int i = 0; i < x.length; i++) {
			sumatoria += x[i];
		}
		return sumatoria;
	}
	public double[] Xy(double[]x, double[]y) {
		double [] Xy= new double[x.length];
		for (int i = 0; i < y.length; i++) {
			Xy[i] = x[i]*y[i];
		}
		return Xy;
	}
	public double[] ElevarUnGrado(double[]x,double[]xx ) {
		double[] elevado = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			elevado[i] = xx[i]*x[i];
		}
		return elevado;
	}
	public double[] XCuadradoY(double[]xCuadrado ,double[]y ) {
		double[] xCuadradoY = new double[xCuadrado.length];
		for (int i = 0; i < y.length; i++) {
			xCuadradoY[i] =  xCuadrado[i]*y[i];
		}
		return xCuadradoY;
	}
	public double St(double[]y,double py) {
		double st = 0;
		for (int i = 0; i < y.length; i++) {
			st += Math.pow((y[i]-py),2);
		}
		return st;
	}
	public double Sr(double[]y,double[]x,double a0,double a1,double a2) {
		double Sr =0;
		for (int i = 0; i < x.length; i++) {
			Sr += Math.pow((y[i]-a0-(a1*x[i])-(a2*Math.pow(x[i], 2))), 2);
		}
		return Sr;
	}
	public double R(double st, double sr) {
		double r = Math.pow((st-sr)/st, 0.5);
		return r;
	}

}
