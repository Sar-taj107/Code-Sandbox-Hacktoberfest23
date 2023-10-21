#include <iostream>
#include <string>
#include <cctype> // Include this for case-insensitive comparison

bool isPalindrome(const std::string &s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        // Skip non-alphanumeric characters from both ends
        while (left < right && !isalnum(s[left])) {
            left++;
        }
        while (left < right && !isalnum(s[right])) {
            right--;
        }
        // Compare the characters (case-insensitive)
        if (tolower(s[left]) != tolower(s[right])) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

int main() {
    std::string s;
    std::cout << "Enter a string: ";
    std::cin >> s;

    if (isPalindrome(s)) {
        std::cout << "The string is a palindrome." << std::endl;
    } else {
        std::cout << "The string is not a palindrome." << std::endl;
    }

    return 0;
}
