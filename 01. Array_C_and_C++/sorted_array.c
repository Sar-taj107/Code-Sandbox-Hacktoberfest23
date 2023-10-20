// inserting in a sorted array
// checking if an array is sorted
// Rearranging an array to bring negative integers on left side

#include<stdio.h>

struct Array
{
    int A[20];
    int size;
    int length;
};

void display(struct Array arr)
{
    int i;
    for(i=0; i<arr.length; i++)
        printf("%d\t",arr.A[i]);
    printf("\n");
}

void swap(int* x, int* y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

// Insert element in a sorted array
void InsertSort(struct Array* arr, int x)
{
    int i=arr->length-1;
    // array is full
    if(arr->length == arr->size)
        return;

    while(i>=0 && arr->A[i]>x)
    {
        arr->A[i+1] = arr->A[i];
        i--;
    }
    arr->A[i+1] = x;
    arr->length++;
}

// check if an array is sorted
int isSorted(struct Array arr)
{
    int i;
    for(i=0; i<arr.length-1; i++)
    {
        if(arr.A[i]>arr.A[i+1])
            return 0;
    }
    return 1;
}

// bring -ve on left side
void REarrange(struct Array *arr)
{
    int i, j;
    i=0;
    j=arr->length-1;

    while(i<j)
    {
        while(arr->A[i]<0) i++;
        while(arr->A[j]>0) j--;
        if(i<j) swap(&arr->A[i], &arr->A[j]);
    }
}

int main()
{
    struct Array arr={{4,8,13,16,20,25,28,33},20,8};
    display(arr);
    InsertSort(&arr, 18);
    printf("%d\n",isSorted(arr));
    display(arr);

    struct Array arr2={{2,-3,25,10,-15,-7},20,6};
    display(arr2);
    REarrange(&arr2);
    display(arr2);
    return 0;
}