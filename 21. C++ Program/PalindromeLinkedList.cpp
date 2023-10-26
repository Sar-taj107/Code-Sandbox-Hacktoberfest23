#include <iostream>

// Definition for singly-linked list.
struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

// Helper function to print a linked list for testing
void printList(ListNode *head)
{
    while (head != nullptr)
    {
        std::cout << head->val << " -> ";
        head = head->next;
    }
    std::cout << "nullptr" << std::endl;
}

// Helper function to reverse a linked list
ListNode *reverseList(ListNode *head)
{
    ListNode *prev = nullptr;
    ListNode *current = head;

    while (current != nullptr)
    {
        ListNode *next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    return prev;
}

// Function to check if a linked list is a palindrome
bool isPalindrome(ListNode *head)
{
    if (!head || !head->next)
    {
        return true; // An empty list or a single-node list is a palindrome.
    }

    // Find the middle of the linked list using the slow and fast pointer approach.
    ListNode *slow = head;
    ListNode *fast = head;
    while (fast && fast->next)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    // Reverse the second half of the linked list.
    slow = reverseList(slow);

    // Compare the first half and the reversed second half of the linked list.
    while (slow != nullptr)
    {
        if (head->val != slow->val)
        {
            return false; // If values don't match, it's not a palindrome.
        }
        head = head->next;
        slow = slow->next;
    }

    return true;
}

int main()
{
    // Create a sample palindrome linked list: 1 -> 2 -> 2 -> 1
    ListNode *head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(2);
    head->next->next->next = new ListNode(1);

    printList(head);
    bool result = isPalindrome(head);
    std::cout << "Is Palindrome: " << (result ? "Yes" : "No") << std::endl;

    return 0;
}
