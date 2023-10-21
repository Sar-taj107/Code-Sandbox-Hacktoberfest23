// deleting an element from array

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

int Delete(struct Array *arr, int index)
{
    int x=0, i;
    if(index>=0 && index<arr->length)
    {
        x=arr->A[index];
        for(i=index; i<arr->length; i++)
            arr->A[i] = arr->A[i+1];
        arr->length--;
    }
    return x;
}

int main()
{
    struct Array arr={{8,3,7,15,6,9,10},20,7};
    display(arr);
    printf("%d\n",Delete(&arr,3));
    display(arr);

    return 0;
}