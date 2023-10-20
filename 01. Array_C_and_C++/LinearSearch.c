// Linear Search

#include<stdio.h>

struct Array
{
    int A[10];
    int size;
    int length;
};

int LinearSearch(struct Array arr, int key)
{
    int i;
    for(i=0; i<arr.length; i++)
    {
        if (arr.A[i]==key)
            return i;
    }
    return -1;
}

int main()
{
    struct Array arr={{8,9,4,7,6,3,10,5,14,2},10,10};
    printf("Element found at index: %d",LinearSearch(arr, 5));
    return 0;
}