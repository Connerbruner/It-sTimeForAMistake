class Main {
    public static void main(String[] args) {
        Neuron test = new Neuron(
        new double[][] {
            {1, 0, 0},
            {1, 0, 0},
            {1, 0, 0}
        },
        new double[][] {
            {0.3, 0.1, 0.3},
            {0.1, 0.2, 0.1},
            {0.3, 0.1, 0.3}
        });
        System.out.print(test.funnyfunction);
    }
}