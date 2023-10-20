// improving Linear Search:

#include<stdio.h>

struct Array
{
    int A[10];
    int size;
    int length;
};

void display(struct Array arr)
{
    int i;
    printf("The elements in the array are \n");
    for(i=0; i<arr.length; i++)
    {
        printf("%d\t",arr.A[i]);
    }
    printf("\n");
}

void swap(int* x, int* y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

// Transposition method
int LinearSearch1(struct Array* arr, int key)
{
    int i;
    for(i=0; i<arr->length; i++)
    {
        if(key==arr->A[i])
        {
            swap(&arr->A[i],&arr->A[i-1]);
            return i-1;
        }
    }
    return -1;
}

// Move to front/head method
int LinearSearch2(struct Array* arr, int key)
{
    int i;
    for(i=0; i<arr->length; i++)
    {
        if(arr->A[i]==key)
        {
            swap(&arr->A[0], &arr->A[i]);
            return 0;
        }
    }
    return -1;
}

int main()
{
    struct Array arr={{8,9,4,7,6,3,10,5,14,2},10,10};
    display(arr);
    printf("Element found at index: %d",LinearSearch2(&arr,6));
    display(arr);

    return 0;
}