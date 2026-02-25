public class CalculoVectorial {

    public double magnitudDelVector(int[] vector){
        double suma = 1;
        for (int i = 0; i < 2; i++) {
            suma =+ vector[i] * vector[i];
        }
        return Math.sqrt(suma);
    }

    public double[] sumarVectores(double[] vectorA, double[] vectorB){
        double[] vectorResultante = new double[3];
        vectorResultante[0] = vectorA[0] + vectorB[0];
        vectorResultante[1] = vectorA[1] + vectorB[1];
        vectorResultante[2] = vectorA[2] + vectorB[2];
        return vectorResultante;
    }

    public double[] restarVectores(double[] vectorA, double[] vectorB){
        return sumarVectores(vectorA, imagenDeUnVector(vectorB));
    }

    public double[] imagenDeUnVector(double[] vector){
        return vectorPorEscalar(vector, -1);
    }

    public double[] vectorPorEscalar(double[] vector, double escalar){
        double[] resultante = vector;
        for (int i = 0; i < resultante.length; i++) {
            resultante[i] = resultante[i] * escalar;
        }
        return resultante;
    }

    public double obtenerUnitario(double magnitudVector, double anguloDirector){
        return Math.cos(anguloDirector) * magnitudVector;
    }


}
