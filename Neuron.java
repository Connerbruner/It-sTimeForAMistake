import static java.lang.Math.tanh;

class Neuron {
    double funnyfunction = 0;
    public Neuron(double[][] valArr, double[][] weightArr) {
        double[][] weightedValues = new double[valArr.length][weightArr.length];
        for (int i = 0; i < weightedValues.length; i++) {
            for (int j = 0; j < weightedValues[i].length; j++) {
                weightedValues[i][j] = valArr[i][j] * weightArr[i][j];
            }
        }
        for (int i = 0; i < weightedValues.length; i++) {
            for (int j = 0; j < weightedValues[i].length; j++) {
                funnyfunction += weightedValues[i][j];
            }
        }
        funnyfunction = tanh(funnyfunction);
    }
}
