// Implement Left and Right Shift and Left and Right Rotation

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

// Left Shift
void Lshift(struct Array* arr)
{
    int i;
    for(i=0; i<arr->length-1; i++)
        arr->A[i]=arr->A[i+1];
    arr->A[arr->length-1] = 0;
}

// Left Rotation
void LRotation(struct Array* arr)
{
    int i, x;
    x = arr->A[0];
    for(i=0; i<arr->length-1; i++)
        arr->A[i]=arr->A[i+1];
    arr->A[arr->length-1] = x;
}

// Right Shift
void Rshift(struct Array* arr)
{
    int i;
    for(i=arr->length-1; i>0; i--)
        arr->A[i]=arr->A[i-1];
    arr->A[0] = 0;
}

// Right Rotation
void RRotation(struct Array* arr)
{
    int i, x;
    x = arr->A[arr->length-1];
    for(i=arr->length-1; i>0; i--)
        arr->A[i]=arr->A[i-1];
    arr->A[0] = x;
}

int main()
{
    struct Array arr={{8,3,9,15,6,10,7,2,12,4},20,10};
    printf("Original array:\n");
    display(arr);
    printf("Left Shift:\n");
    Lshift(&arr);
    display(arr);
    printf("Left Rotation:\n");
    LRotation(&arr);
    display(arr);
    printf("Right Shift:\n");
    Rshift(&arr);
    display(arr);
    printf("Right Rotation:\n");
    RRotation(&arr);
    display(arr);

    return 0;
}