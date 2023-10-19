#include <iostream>

int main() {
    const int arraySize = 5; 
    int myArray[arraySize];

    
    std::cout << "Please enter " << arraySize << " integer values:" << std::endl;
    for (int i = 0; i < arraySize; i++) {
        std::cout << "Enter value " << (i + 1) << ": ";
        std::cin >> myArray[i];
    }

    
    std::cout << "You entered the following values:" << std::endl;
    for (int i = 0; i < arraySize; i++) {
        std::cout << "Value " << (i + 1) << ": " << myArray[i] << std::endl;
    }

    return 0;
}
