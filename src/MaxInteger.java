public class MaxInteger {
    public static <T extends Comparable<T>> void findMax(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        System.out.println("Max number is:-"+max);
    }
    public static void main(String[] args) {
        Float x=0.111F,y=0.423F,z= 0.123F;
        //Integer x=20,y=10,z=114;
        findMax(x,y,z);
    }
}