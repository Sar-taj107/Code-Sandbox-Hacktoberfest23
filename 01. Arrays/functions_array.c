// Get(), Set(), Max(), Min(), Sum(), Avg() functions in an array

#include<stdio.h>

struct Array
{
    int A[20];
    int size;
    int length;
};

// Function to display all elements of an array
void display(struct Array arr)
{
    int i;
    for(i=0; i<arr.length; i++)
        printf("%d\t",arr.A[i]);
    printf("\n");
}

// Function to get element at a given index
int get(struct Array arr, int index)
{
    if(index>=0 && index<arr.length)
        return arr.A[index];
    return -1;
}

// Function to set element at a given index
void set(struct Array* arr, int x, int index)
{
    if(index>=0 && index<arr->length)
        arr->A[index] = x;
}

// Function to find the maximum value from an array
int max(struct Array arr)
{
    int max=arr.A[0];
    int i;
    for(i=1; i<arr.length; i++)
    {
        if(arr.A[i]>max)
            max=arr.A[i];
    }
    return max;
}

// Function to find the minimum value from an array
int min(struct Array arr)
{
    int min=arr.A[0];
    int i;
    for(i=0; i<arr.length; i++)
    {
        if(arr.A[i]<min)
            min=arr.A[i];
    }
    return min;
}

// Function to find sum of all the elements (iterative form):
int sum(struct Array arr)
{
    int total=0, i;
    for(i=0; i<arr.length; i++)
    {
        total+=arr.A[i];
    }
    return total;
}

// Function to find sum of all the elements (recursive form):
int Rsum(struct Array arr, int n)
{
    if(n<0)
        return 0;
    return Rsum(arr,n-1) + arr.A[n];
}

// Function to find the average of elements in an array
double avg(struct Array arr)
{
    int total=0, i;
    for(i=0; i<arr.length; i++)
    {
        total += arr.A[i];
    }
    return (float)total/arr.length-1;
}

int main()
{
    struct Array arr={{4,8,10,15,18,21,24,27,29,33,34,37,39,41,43},20,15};

    // get():
    printf("Element at index 2 is %d.\n",get(arr,2));

    // set():
    set(&arr, 9, 2);
    display(arr);

    // max():
    printf("Maximum element in the array is %d\n",max(arr));

    // min():
    printf("Minimum element in the array is %d\n",min(arr));

    // sum():
    printf("The sum of all elements is %d\n",sum(arr));
    printf("The sum of all elements is %d\n",Rsum(arr, arr.length-1));

    // avg():
    printf("The average of elemets is %lf\n",avg(arr));
    return 0;
}