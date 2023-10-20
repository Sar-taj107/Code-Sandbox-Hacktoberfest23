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

void append(struct Array* arr, int x)
{
    if(arr->length,arr->size)
    {
        arr->A[arr->length++] = x;
    }
}

void insert(struct Array* arr, int index, int x)
{
    int i;
    if(index>=0 && index<=arr->length)
    {
        for(i=arr->length; i>index; i--)
            arr->A[i]=arr->A[i-1];
        arr->A[index]=x;
        arr->length++;
    }
}

void delete(struct Array* arr, int index)
{
    int i, x;
    if(index>=0 && index<arr->length)
    {
        x=arr->A[index];
        for(i=index; i<arr->length-1; i++)
            arr->A[i]=arr->A[i+1];
        arr->length--;
        printf("%d was deleted\n",x);
    }
}

int main()
{
    struct Array arr={{1,2,3,4,5},20,5};
    display(arr);
    append(&arr, 6);
    display(arr);
    insert(&arr, 2, 7);
    display(arr);
    delete(&arr, 2);
    display(arr);

    return 0;
}