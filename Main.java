class Main {
    public static void main(String[] args) {
        Neuron test = new Neuron(
        new double[][] {
            {1, -0.5, 0},
            {1, 0.5, 1},
            {1, 1, 0}
        },
        new double[][] {
            {0.5, 0.1, 0.3},
            {0.5, 0.3, 0.1},
            {0.3, 0.1, 0.3}
        });
        System.out.print(test.test() );
    }
}