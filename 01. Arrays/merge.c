// Merging two arrays

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

struct Array* merge(struct Array* arr1, struct Array* arr2)
{
    int i=0, j=0, k=0;
    struct Array* arr3 = (struct Array*) malloc (sizeof(struct Array));

    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i] < arr2->A[j])
            arr3->A[k++] = arr1->A[i++];
        else
            arr3->A[k++] = arr2->A[j++]; 
    }

    for(;i<arr1->length;i++)
        arr3->A[k++] = arr1->A[i++];

    for(;j<arr2->length;j++)
        arr3->A[k++] = arr2->A[j++];
    
    arr3->length = arr1->length + arr2->length;
    arr3->size = 20;
    return arr3;
}

int main()
{
    struct Array arr1 = {{3,8,16,20,25},20,5};
    struct Array arr2 = {{4,10,12,22,23},20,5};
    struct Array* arr3;
    display(arr1);
    display(arr2);
    arr3 = merge(&arr1, &arr2);
    display(*arr3);
    return 0;
}