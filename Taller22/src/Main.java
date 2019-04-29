
public class Main {
	public static void main(String Args[]) {
		Metodos metodo = new Metodos();
		double[] x = {2	,4,6,8,10,12,14,16};
		double [] y = {4.5,1.5,1,4,5.5,8.5,11,18};
		
		double[] xCuadrado = metodo.ElevarUnGrado(x, x);
		double[] xCubo = metodo.ElevarUnGrado(xCuadrado, x);
		double[] xCuatro = metodo.ElevarUnGrado(xCubo, x);
		double[] xy = metodo.Xy(x,y);
		double[] xCuadradoY= metodo.XCuadradoY(xCuadrado, y);
				
		double sumX = metodo.Sumatoria(x);
		double sumY = metodo.Sumatoria(y);
		double sumXCuadrado= metodo.Sumatoria(xCuadrado);
		double sumXCubo= metodo.Sumatoria(xCubo);
		double sumXCuatro = metodo.Sumatoria(xCuatro);
		double sumXY = metodo.Sumatoria(xy);
		double sumXCuadradoY= metodo.Sumatoria(xCuadradoY);
		
		double promY = (metodo.Sumatoria(y))/y.length;
		double st = metodo.St(y, promY);
		System.out.println("ST: "+ st);
		
		double[][] formulas = {{x.length,sumX,sumXCuadrado}
		,{sumX,sumXCuadrado,sumXCubo},{	sumXCuadrado,sumXCubo,sumXCuatro}};
		double[] rts = {sumY,sumXY,sumXCuadradoY};
		Gauss gaus = new Gauss();
 		double[] A = Gauss.gauss(formulas, rts );
 		for (int i = 0; i < A.length; i++) {
			System.out.println("a"+i+ "= "+A[i]);
		}
		
		double sr= metodo.Sr(y, x, A[0], A[1], A[2]);
	
		
		System.out.println("Y : "+A[0]+A[1]+"x+"+A[2]+"x^2");
		
		System.out.println("r: "+metodo.R(st,sr));
		
}
}