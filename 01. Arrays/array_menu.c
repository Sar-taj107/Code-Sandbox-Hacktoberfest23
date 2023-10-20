// menu driven array program

#include<stdio.h>
#include<stdlib.h>

struct Array
{
    int *A;
    int size;
    int length;
};

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void display(struct Array *arr)
{
    int i;
    printf("Elements are:- \n");
    for(i=0; i<arr->length; i++)
        printf("%d\t",arr->A[i]);
    printf("\n");
}

void insert(struct Array *arr, int x, int index)
{
    int i;
    if(index<0 && index>arr->length)
    {
        printf("Invalid Index\n");
    }
    else
    {
        for(i=arr->length; i>index; i--)
            arr->A[i] = arr->A[i-1];
        arr->A[i] = x;
        arr->length++;
    }
}

void delete(struct Array *arr, int index)
{
    int i, x;
    if(index<0 && index>arr->length)
    {
        printf("Invalid Index\n");
    }
    else
    {
        x = arr->A[index];
        for(i=index; i<arr->length-1; i++)
            arr->A[i] = arr->A[i+1];
        arr->length--;
        printf("%d was deleted.\n",x);
    }
}

int search(struct Array *arr, int x)
{
    int i;
    for(i=0; i<arr->length; i++)
    {
        if (arr->A[i] == x)
            return i;
    }
    return -1;
}

int sum(struct Array* arr)
{
    int i, total=0;
    for(i=0; i<arr->length; i++)
        total += arr->A[i];
    return total;
}

float average(struct Array *arr)
{
    return (float)sum(arr)/arr->length;
}

int max(struct Array *arr)
{
    int i, max;
    max = arr->A[0];

    for(i=1; i<arr->length; i++)
    {
        if(arr->A[i]>max)
            max = arr->A[i];
    }
    return max;
}

int min(struct Array *arr)
{
    int i, min;
    min = arr->A[0];

    for(i=1; i<arr->length; i++)
    {
        if(arr->A[i]<min)
            min = arr->A[i];
    }
    return min;
}

void reverse(struct Array *arr)
{
    int i;
    for(i=0; i<arr->length/2; i++)
    {
        swap(&arr->A[i],&arr->A[arr->length-i-1]);
    }
}

void LeftShift(struct Array *arr)
{
    int i;
    for(i=0; i<arr->length-1; i++)
        arr->A[i] = arr->A[i+1];
    arr->A[i] = 0;
}

void RightShift(struct Array *arr)
{
    int i;
    for(i=arr->length-1; i>0; i--)
        arr->A[i] = arr->A[i-1];
    arr->A[0] = 0;
}

void LeftRotation(struct Array *arr)
{
    int i, x;
    x = arr->A[0];
    for(i=0; i<arr->length-1; i++)
        arr->A[i] = arr->A[i+1];
    arr->A[i] = x;
}

void RightRotation(struct Array *arr)
{
    int i, x;
    x = arr->A[arr->length-1];
    for(i=arr->length-1; i>0; i--)
        arr->A[i] = arr->A[i-1];
    arr->A[0] = x;
}

int isSorted(struct Array *arr)
{
    int i;
    for(i=0; i<arr->length-1; i++)
    {
        if(arr->A[i] > arr->A[i+1])
            return 0;
    }
    return 1;
}

int main()
{
    int ch1, ch2, x, index;
    struct Array *arr = (struct Array*)malloc(sizeof(struct Array));
    printf("Enter size of array: ");
    scanf("%d",arr->size);

    arr->A = (int*)malloc(arr->size * sizeof(int));
    arr->length=0;
    
    do
    {
        printf("\n\n");
        printf("1.  Insert\n");
        printf("2.  Delete\n");
        printf("3.  Display\n");
        printf("4.  Search\n");
        printf("5.  Sum\n");
        printf("6.  Average\n");
        printf("7.  Max and Min\n");
        printf("8.  Reverse\n");
        printf("9.  Shift operations\n");
        printf("10. Check sort\n");
        printf("11. Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d",&ch1);

        switch(ch1)
        {
            case 1: printf("Enter element and index: \n");
                    scanf("%d%d",&x,&index);
                    insert(arr, x, index);
                    break;
            case 2: printf("Enter index to delete: \n");
                    scanf("%d",&index);
                    delete(arr, index);
                    break;
            case 3: display(arr);
                    break;
            case 4: printf("Enter element to search: ");
                    scanf("%d", &x);
                    printf("Element found at index %d.", search(arr, x));
                    break;
            case 5: printf("The sum is: %d\n",sum(arr));
                    break;
            case 6: printf("The average is: %f\n",average(arr));
                    break;
            case 7: printf("The maximum is %d\n",max(arr));
                    printf("The minimum is %d\n",min(arr));
                    break;
            case 8: reverse(arr);
                    break;
            case 9: printf("\n");
                    printf("1. Left Shift\n"); 
                    printf("2. Right Shift\n"); 
                    printf("3. Left Rotation\n"); 
                    printf("4. Right Rotation\n");
                    printf("\nEnter the type of shift: ");
                    scanf("%d",&ch2);

                    switch(ch2)
                    {
                        case 1: LeftShift(arr);
                                break;
                        case 2: RightShift(arr);
                                break;
                        case 3: LeftRotation(arr);
                                break;
                        case 4: RightRotation(arr);
                                break;
                    }
                    break;
            case 10:printf("The array is sorted %d", isSorted(arr));
                    break;
        }
    } while (ch1!=11);
    
    return 0;
}