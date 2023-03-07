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
        Integer x=20,y=30,z=14;
        findMax(x,y,z);
    }
}