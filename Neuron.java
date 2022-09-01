import static java.lang.Math.tanh;

class Neuron {
    double[][] values;
    double[][] weights;
    double funnyfunction = 0;

    public Neuron(double[][] valArr, double[][] weightArr) {

        double[][] weightedValues = new double[valArr.length][weightArr.length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                weightedValues[i][j] = values[i][j] * weights[i][j];
            }
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                funnyfunction += weightedValues[i][j];
            }
        }
        funnyfunction = tanh(funnyfunction);
    }
}
