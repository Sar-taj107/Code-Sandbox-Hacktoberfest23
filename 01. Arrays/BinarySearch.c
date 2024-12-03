//1. Bianry Search:  //

#include<stdio.h>
struct Array
{
    int A[15];
    int size;
    int length;
};

int binarySearch(struct Array *arr, int key)
{
    int l = 0, h = arr->length - 1;
    int mid;
    while (l <= h)
    {
        mid = (1 + h) / 2;
        if(arr->A[mid] == key)
            return mid;
        else if(arr->A[mid] < key)
            l = mid + 1;
        else 
            h = mid - 1;
    }
    return -1;
}

//2. Recursive form
int RBinarySearch(struct Array *arr, int key, int l, int h)
{
    if (l <= h) {
        int mid = (1 + h) / 2;
        if (arr->A[mid] == key)
            return mid;
        else if (arr->A[mid] < key)
            return RBinarySearch(arr, key, mid + 1, h);
        else
            return RBinarySearch(arr, key, l, mid - 1);
    }
    return -1;
}
int main()
{
    struct Array arr={{4,8,10,15,18,21,24,27,29,33,34,37,39,41,43},15,15};
    printf("Element found at index: %d\n", binarySearch(&arr, 15));
    return 0;
}
