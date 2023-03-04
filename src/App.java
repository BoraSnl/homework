public static int findMax(int[] arr) {
    int max = arr[0]; // start with the first element as the maximum
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i]; // update the maximum value

    }
    return max;
}