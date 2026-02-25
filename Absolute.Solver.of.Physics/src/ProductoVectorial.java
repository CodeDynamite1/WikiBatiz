public class ProductoVectorial extends CalculoVectorial{
    private double[][] matriz = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    public ProductoVectorial(double[] vectorA, double[] vectorB){
        if(vectorA.length > 3 || vectorB.length > 3){
            out("Uno de tus vectores no coincide con la forma [x , y , z]");
        }else{
            matriz[1][0] = vectorA[0];
            matriz[1][1] = vectorA[1];
            matriz[1][2] = vectorA[2];

            matriz[2][0] = vectorB[0];
            matriz[2][1] = vectorB[1];
            matriz[2][2] = vectorB[2];
        }
    }



    public void out(String mensaje){System.out.println(mensaje);}

}
