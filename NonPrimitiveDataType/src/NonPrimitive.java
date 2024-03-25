public class NonPrimitive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "test";
        System.out.println("String is " + str);
        // String str1 is not declared. It will cause an error when trying to print it.
        // System.out.println("Another String: " + str1);

        int arr[];
        arr = new int[2]; // Increase the size of the array to 3
        arr[0] = 0;
        arr[1] = 1;
//        arr[2] = 2;

        System.out.println(arr); // This prints the reference of the array
        System.out.println(arr[0]); // This prints the first element of the array
    }

}
