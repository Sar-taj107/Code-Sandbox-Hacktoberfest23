// Reverse an array

#include<stdio.h>
#include<stdlib.h>

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

void swap(int* a, int* b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

// using auxilary array:
void reverse1(struct Array* arr)
{
    int* B;
    int i, j;

    B=(int*)malloc(arr->length*sizeof(int));

    for(i=arr->length-1, j=0; i>=0; i--, j++)
        B[j] = arr->A[i];

    for(i=0; i<arr->length; i++)
        arr->A[i] = B[i];
}

// using swap:
void reverse2(struct Array* arr)
{
    int i,j;
    for(i=0, j=arr->length-1; i<j; i++, j--)
        swap(&arr->A[i], &arr->A[j]);
}

// my solution:
void Mreverse(struct Array* arr)
{
    int i;
    for(i=0; i<arr->length/2; i++)
    {
        swap(&arr->A[i],&arr->A[arr->length-1-i]);
    }
}

int main()
{
    struct Array arr={{8,3,9,15,6,10,7,2,12,4},20,10};
    display(arr);
    reverse2(&arr);
    display(arr);

    return 0;
}