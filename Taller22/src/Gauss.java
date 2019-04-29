
public class Gauss {
	public static double[] gauss(double[][] a, double[] b) {
		double[][] aAux = duplicarArreglo(a);
		double[] bAux = duplicarArreglo(b);

		int n = bAux.length;

		// Se construye la matriz triangular superior
		for (int i = 0; i < n; i++) {
			// Pivoteo
			double mayorAux = Math.abs(aAux[i][i]);
			int indiceAux = i;
			for (int k = i; k < n; k++) {
				if (Math.abs(aAux[k][i]) > mayorAux) {
					mayorAux = Math.abs(aAux[k][i]);
					indiceAux = k;
				}
			}
			if (indiceAux != i) {
				double[] filaAux = aAux[i];
				aAux[i] = aAux[indiceAux];
				aAux[indiceAux] = filaAux;

				double valoAux = bAux[i];
				bAux[i] = bAux[indiceAux];
				bAux[indiceAux] = valoAux;
			}

			// Normalizacion

			double divisor = aAux[i][i];
			for (int k = 0; k < aAux.length; k++) {
				aAux[i][k] /= divisor;
			}

			bAux[i] /= divisor;

			// Reducción
			for (int k = 0; k < n; k++) {
				if (i != k) {
					double fact = -aAux[k][i] / aAux[i][i];

					for (int j = i; j < n; j++) {
						aAux[k][j] += (aAux[i][j] * fact);
					}

					bAux[k] += (bAux[i] * fact);
				}
			}

		}

		return bAux;
	}

	private static double[][] duplicarArreglo(double[][] m) {
		double[][] duplicado = new double[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			System.arraycopy(m[i], 0, duplicado[i], 0, m[i].length);
		}

		return duplicado;
	}

	private static double[] duplicarArreglo(double[] v) {
		double[] duplicado = new double[v.length];
		System.arraycopy(v, 0, duplicado, 0, v.length);

		return duplicado;
	}

}
