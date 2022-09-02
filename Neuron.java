import static java.lang.Math.tanh;

class Neuron {
    double Confidence = 0;

    long completeSpeed;

    public Neuron(double[][] valArr, double[][] weightArr) {
        long start = System.nanoTime();
        double[][] weightedValues = new double[valArr.length][weightArr.length];
        for (int i = 0; i < weightedValues.length; i++) {
            for (int j = 0; j < weightedValues[i].length; j++) {
                weightedValues[i][j] = valArr[i][j] * weightArr[i][j];
            }
        }
        for (double[] weightedValue : weightedValues) {
            for (double v : weightedValue) {
                Confidence += v;
            }
        }
        completeSpeed = System.nanoTime() - start;
    }

    public double getConfidence() {
        return Confidence = tanh(Confidence);
    }

    public String test() {
        return "Confidence: " + (Confidence = tanh(Confidence)) + "\nTime to complete (nanos): " + completeSpeed;
    }
}
