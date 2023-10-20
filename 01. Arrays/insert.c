// inserting an element in array

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
    {
        printf("%d\t",arr.A[i]);
    }
    printf("\n");
}

// adding element at end of a array
void add(struct Array* arr, int x)
{
    if(arr->length<arr->size)
    {
        arr->A[arr->length] = x;
        arr->length++;
    }
}

// inserting at a given index
void insert(struct Array* arr, int index, int x)
{
    int i;
    if(index>=0 && index<=arr->length)
    {
        for(i=arr->length; i>index; i--)
            arr->A[i] = arr->A[i-1];
        arr->A[index] = x;
        arr->length++;
    }
}

int main()
{
    struct Array arr={{8,3,7,12,6,9},20,6};
    display(arr);
    add(&arr, 15);
    display(arr);
    insert (&arr,3,20);
    display(arr);

    return 0;
}