// Defining array datatype

#include<stdio.h>
#include<stdlib.h>

struct Array
{
    int* A;
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
}

int main()
{
    struct Array arr;
    int n,i;
    
    printf("Enter size of arry: ");
    scanf("%d",&arr.size);

    arr.A = (int*)malloc(arr.size*sizeof(int));
    arr.length=0;

    printf("Enter number of elements to enter: ");
    scanf("%d",&n);

    printf("Enter the elements: ");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr.A[i]);
        arr.length++;
    }

    display(arr);
    return 0;
}