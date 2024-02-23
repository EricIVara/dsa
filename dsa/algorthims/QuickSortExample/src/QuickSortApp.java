public class QuickSortApp {
    public static void main(String[] args) {
        int[] arr = {762, 961, 514, 930, 799, 870, 215, 595, 343, 478, 293, 978, 605, 15, 274, 24, 847, 448, 817, 937, 896, 165, 172, 941, 555, 579, 703, 974, 795, 301, 403, 696, 646, 645, 621, 826, 315, 616, 633, 453, 221, 917, 43, 587, 754, 716, 854, 21, 711, 473, 306, 482, 75, 229, 672, 333, 18, 582, 753, 104, 98, 368, 770, 345, 141, 49, 323, 599, 369, 797, 337, 649, 182, 638, 391, 975, 913, 344, 929, 42, 114, 471, 163, 982, 735, 689, 349, 320, 877, 8, 314, 273, 619, 884, 195, 6, 253, 467, 216, 98};


        System.out.println("Original array:");
        printArray(arr);

        QuickSort.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
