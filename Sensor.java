class Sensor{
    public static Sensor sensores[] = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;
    int[] arregloSensor = new int[8];
    public Sensor(){

    }

    public Sensor(String t, double v){
        Sensor sensorA = new Sensor();
        sensorA.setTipo(t);
        sensorA.setValor(v);
        this.sensores[posAnadir] = sensorA;
        this.posAnadir = posAnadir + 1;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String ToString(){
        return "( " + this.tipo + "," + this.valor +  ")" ;
    }

    public static String toStringSensores(){
        String cadenaSensores = "";
        String tipo;
        double valor;
        for(int i = 0; i < posAnadir; i++){
            tipo = sensores[i].getTipo();
            valor = sensores[i].getValor();
            cadenaSensores = cadenaSensores + "(" + tipo + "-" + valor + ")";
        }
        return cadenaSensores;
    }

    public static int cantidadSensores(){
        return posAnadir;

    }

}