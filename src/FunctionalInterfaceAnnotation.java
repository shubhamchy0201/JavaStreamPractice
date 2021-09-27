public class FunctionalInterfaceAnnotation {
    @FunctionalInterface
    interface Cruncher
    {
        int crunch(int i,int j);
    };
    public int crunchService(int i,int j,Cruncher cruncher)
    {
        return  cruncher.crunch(i,j);
    }
    public static void main(String[] args) {
       FunctionalInterfaceAnnotation functionalInterfaceAnnotation= new FunctionalInterfaceAnnotation();
      // Cruncher crun1=(int i,int j) -> i*j;
        System.out.println("Multiplication is: "+functionalInterfaceAnnotation.crunchService(8,9,(int i,int j) -> i*j));
    }
}
