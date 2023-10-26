#include <iostream>

struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

void printList(ListNode *head)
{
    while (head != nullptr)
    {
        std::cout << head->val << " -> ";
        head = head->next;
    }
    std::cout << "nullptr" << std::endl;
}

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

int main()
{
    // Create a linked list
    ListNode *head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    head->next->next->next->next = new ListNode(5);

    std::cout << "Original Linked List:" << std::endl;
    printList(head);

    // Reverse the linked list
    head = reverseList(head);

    std::cout << "Reversed Linked List:" << std::endl;
    printList(head);

    return 0;
}