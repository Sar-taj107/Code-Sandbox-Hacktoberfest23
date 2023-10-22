#include <iostream>

void selectionSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i;

        // Find the index of the minimum element in the unsorted part of the array
        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap the minimum element with the first element in the unsorted part of the array
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

int main() {
    int myArray[] = {3, 6, 8, 10, 1, 2, 1};
    int size = sizeof(myArray) / sizeof(myArray[0]);

    selectionSort(myArray, size);

    for (int i = 0; i < size; i++) {
        std::cout << myArray[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}
