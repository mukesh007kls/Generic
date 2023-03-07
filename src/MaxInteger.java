public class MaxInteger<T extends Comparable<T>> {
    T arr[];

    public MaxInteger(T[] arr) {
        this.arr = arr;
    }

    public T findMax() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String x = "Orange", y = "Banana", z = "Peach";
        //Float x=0.111F,y=0.423F,z= 0.123F;
        //Integer x=20,y=10,z=114;
        Integer numArray[] = {10, 15, 25, 13, 26};
        String stringArray[] = {"apple", "peach", "banana", "orange"};
        Float floatArray[] = {0.123F, 0.564F, 0.2564F, 0.1F, 0.9F};

        MaxInteger<Integer> integerMaxInteger = new MaxInteger<Integer>(numArray);
        MaxInteger<String> stringMaxInteger = new MaxInteger<String>(stringArray);
        MaxInteger<Float> floatMaxInteger = new MaxInteger<Float>(floatArray);

        System.out.println("Max in Integer:-"+integerMaxInteger.findMax());
        System.out.println("Max in String:-"+stringMaxInteger.findMax());
        System.out.println("Max in Float:-"+floatMaxInteger.findMax());

    }
}