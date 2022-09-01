class Neuron {
    double[][] values;
    double[][] weights;
    double funnyfunction;
    public Neuron(double[][] valArr,double[][] weightArr)
    {
      double[][] weightedValues = double[valArr.length][weightArr.length];
      for(int i = 0; i < values.length; i++) {
          for(int j = 0, j < values[i].length){
            weightedValues[i][j] = values[i][j]*weights[i][j];
          }
      }
      double funnyfunction; //this is gonna be our final number no fucky touchy
         for(int i = 0; i < values.length; i++) {
          for(int j = 0, j < values[i].length){
            funnyfunction += weightedValues[i][j];  
          }
      }
      funnyfunction = tanh(funnyfunction);
    }
 }
    //it all happens inside the neuron so
      
    }
    public double getValue()
    {
        return 0;
    }
    public double getConfidence(){
      return funnyfunction;
    }
    
}