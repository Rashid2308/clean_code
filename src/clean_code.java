public class clean_code {
    static class Check { //static class

        int small_number;
        int large_number;
    }
    //Method for finding smallest and largest number
    static Check find_Largest_Smallest(int Given_array[], int array_size) {
        Check obj_of_check = new Check();
        int i;

        if (array_size == 1) {
            obj_of_check.large_number = Given_array[0];
            obj_of_check.small_number = Given_array[0];
            return obj_of_check;
        }

        if (Given_array[0] > Given_array[1]) {
            obj_of_check.large_number = Given_array[0];
            obj_of_check.small_number = Given_array[1];
        } else {
            obj_of_check.large_number = Given_array[1];
            obj_of_check.small_number = Given_array[0];
        }

        for (i = 2; i < array_size; i++) {
            if (Given_array[i] > obj_of_check.large_number) {
                obj_of_check.large_number = Given_array[i];
            } else if (Given_array[i] < obj_of_check.small_number) {
                obj_of_check.small_number = Given_array[i];
            }
        }

        return obj_of_check;
    }
    //Main method
    public static void main(String args[]) {
        int Given_array[] = {1000, 11, 445, 1, 330, 3000}; //given array elements
        int array_size = 6;
        Check check = find_Largest_Smallest(Given_array, array_size); //calling the array
        System.out.printf("\nsmall_number is %d", check.small_number);
        System.out.printf("\nlarge_number is %d", check.large_number);
    }
}
