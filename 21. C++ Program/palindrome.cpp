#include <iostream>

bool isPalindrome(int x)
{
    if (x < 0)
    {
        return false; // Negative numbers are not palindromes
    }

    int original = x;
    int reversed = 0;

    while (x > 0)
    {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
    }

    return original == reversed;
}

int main()
{
    int x;

    std::cout << "Enter an integer: ";
    std::cin >> x;

    bool result = isPalindrome(x);

    if (result)
    {
        std::cout << "True: It's a palindrome." << std::endl;
    }
    else
    {
        std::cout << "False: It's not a palindrome." << std::endl;
    }

    return 0;
}
