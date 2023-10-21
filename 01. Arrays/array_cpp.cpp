#include<iostream>
typedef int type;

using namespace std;

template<class T>
class Array
{
    T *A;
    int size;
    int length;
    void swap(T *a, T *b);
  public:
    Array();
    Array(int sz);
    void display();
    void append(T x);
    void insert(int index, T x);
    int linearSearch(T key);
    int binarySearch(T key);
    T get(int index);
    void set(int index, T x);
    T max();
    T min();
    T sum();
    float avg();
    void reverse();
    void insertSort(T x);
    int isSorted();
    void rearrange();
    void merge(Array<T> arr);
    void merge_sorted(Array<T> arr);
    // Array* Union(Array arr);
    // Array* intersection(Array arr);
    // Array* difference(Array arr);
    // ~Array();
};

template<class T>
void Array<T>:: swap(T *a, T *b)
{
    T temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

template<class T>
Array<T>:: Array()
{
    size = 10;
    A = new int[10];
    length = 0;
}

template<class T>
Array<T>:: Array(int sz)
{
    size = sz;
    A = new int[sz];
    length = 0;
}

template<class T>
void Array<T>:: display()
{
    int i;
    for(i=0; i<length; i++)
        cout<<A[i]<<"\t";
    cout<<"\n";
}

template<class T>
void Array<T>::append(T x)
{
    A[length]= x;
    length++;
}

template<class T>
void Array<T>::insert(int index, T x)
{
    if(index>0 && index<length)
    {
        int i;
        for(i=length; i>index; i--)
            A[i] = A[i-1];
        A[index] = x;
        length++;
    }
}

template <class T>
int Array<T>::linearSearch(T key)
{
    int i;
    for(i=0; i<length; i++)
    {
        if(A[i] == key)
            return i;
    }
    return -1;
}

template<class T>
int Array<T>::isSorted()
{
    int i;
    for(i=0; i<length-1; i++)
    {
        if(A[i]>A[i+1])
            return 0;
    }
    return 1;
}

template<class T>
int Array<T>::binarySearch(T key)
{
    int l=0, h=length-1;
    int mid;
    while(l<=h)
    {
        mid = (l+h)/2;
        if(A[mid]==key)
            return key;
        else if(A[mid]<key)
            h=mid+1;
        else
            l=mid-1;
    }
    return -1;
}

template<class T>
T Array<T>::get(int index)
{
    if (index<0 && index>length-1)
    {
        cout<<"Invalid Index"<<endl;
        return -1;
    }
    else 
        return A[index];
}

template<class T>
void Array<T>::set(int index, T x)
{
    if (index<0 && index>length-1)
        cout<<"Invalid Index"<<endl;
    else
        A[index] = x;
}

template <class T>
T Array<T>::max()
{
    int i=0;
    T maximum=A[0];
    for(i=1; i<length; i++)
    {
        if(A[i]>maximum)
        {
            maximum = A[i];
        }
    }
    return maximum;
}

template <class T>
T Array<T>::min()
{
    int i=0; 
    T minimum=A[0];
    for(i=1; i<length; i++)
    {
        if(A[i]<minimum)
        {
            minimum = A[i];
        }
    }
    return minimum;
}

template<class T>
T Array<T>::sum()
{
    int i;
    T total = 0;
    for(i=0; i<length; i++)
    {
        total += A[i];
    }
    return total;
}

template<class T>
float Array<T>::avg()
{
    return sum()/length;
}

template<class T>
void Array<T>::reverse()
{
    int i;
    for(i=0; i<length/2; i++)
        swap(&A[i], &A[length-i-1]);
}

template<class T>
void Array<T>::insertSort(T x)
{
    int i = length-1;
    if(length == size)
        return;
    while(i>=0 && A[i]>x)
    {
        A[i+1] = A[i];
        i--;
    }
    A[i+1] = x;
    length++;
}

template<class T>
void Array<T>::rearrange()
{
    int i, j;
    i=0;
    j=length-1;
    while(i<j)
    {
        while(A[i]<0){i++;}
        while(A[j]>0){j--;}
        if(i<j)
            swap(&A[i], &A[j]);
    }
}

template<class T>
void Array<T>::merge(Array<T> arr)
{
    if(length + arr.length > size)
    {
        cout<<"Arrays cannot be merged"<<endl;
        return;
    }
    int i;
    for(i=0; i<arr.length; i++)
    {
        A[length+i] = arr.A[i];
    }
    length += arr.length;
}

template<class T>
void Array<T>::merge_sorted(Array<T> arr)
{
    int i=0, j=0, k=0;
    Array<type> temp(size + arr.size);
    while(i<length && j<arr.length)
    {
        if(A[i]<arr.A[j])
            temp.append(A[i++]);
        else
            temp.append(arr.A[j++]);
    }

    for(; i<length; i++)
        temp.append(A[i]);
    for(; j<arr.length; j++)
        temp.append(arr.A[j]);

    this->A = temp.A;
    this->length = this->length + arr.length;
    this->size = temp.size;
}

int main()
{
    type x;
    int sz, ch, i, n;
    cout<<"Enter size of array: ";
    cin>>sz;
    Array<type> arr(sz);

    do
    {
        cout<<"\n\n";
        cout<<"1.  Display"<<endl;   
        cout<<"2.  Append"<<endl;   
        cout<<"3.  Insert"<<endl;   
        cout<<"4.  Get"<<endl;   
        cout<<"5.  Set"<<endl;   
        cout<<"6.  Linear Search"<<endl;   
        cout<<"7.  Binary Search"<<endl;   
        cout<<"8.  Maximum"<<endl;   
        cout<<"9.  Minimum"<<endl;   
        cout<<"10. Sum"<<endl;   
        cout<<"11. Average"<<endl;   
        cout<<"12. Reverse Array"<<endl;   
        cout<<"13. Insert Sort"<<endl;   
        cout<<"14. check Sorted"<<endl;   
        cout<<"15. Rearrange"<<endl;   
        cout<<"16. Merge"<<endl;   
        cout<<"17. Union"<<endl;   
        cout<<"18. Intersection"<<endl;   
        cout<<"19. Difference"<<endl; 
        cout<<"20. Exit"<<endl;
        cout<<"\nEnter your choice:- ";
        cin>>ch;

        switch(ch)
        {
            case 1: arr.display();
                    break;
            case 2: cout<<"Enter element to append :- ";
                    cin>>x;
                    arr.append(x);
                    break;
            case 3: cout<<"Enter element to insert:- ";
                    cin>>x;
                    cout<<"Enter index :- ";
                    cin>>i;
                    arr.insert(i, x);
                    break;
            case 4: cout<<"Enter index :- ";
                    cin>>i;
                    cout<<"Element is :- "<<arr.get(i)<<endl;
                    break;
            case 5: cout<<"Enter element to set:- ";
                    cin>>x;
                    cout<<"Enter index :- ";
                    cin>>i;
                    arr.set(i, x);
                    break;
            case 6: cout<<"Enter element to search:- ";
                    cin>>x;
                    cout<<"Element found at index: "<<arr.linearSearch(x)<<endl;
                    break;
            case 7: if(arr.isSorted()==1)
                    {
                        cout<<"Enter element to search:- ";
                        cin>>x;
                        cout<<"Element found at index: "<<arr.linearSearch(x)<<endl;
                    }
                    else
                        cout<<"Binary search is performed on sorted arrays"<<endl;
                    break;
            case 8: cout<<"The maximum is :- "<<arr.max()<<endl;
                    break;
            case 9: cout<<"The minimum is :- "<<arr.min()<<endl;
                    break;
            case 10:cout<<"Sum of all elements is :- "<<arr.sum()<<endl;
                    break;
            case 11:cout<<"Average of all elements is :- "<<arr.avg()<<endl;
                    break;
            case 12:arr.reverse();
                    break;
            case 13:if(arr.isSorted()==1)
                    {
                        cout<<"Enter element to insert:- ";
                        cin>>x;
                        arr.insertSort(x);
                    }
                    else
                        cout<<"This insert can only be performed on sorted arrays"<<endl;
                    break;
            case 14:if(arr.isSorted()==1)
                        cout<<"Array is sorted"<<endl;
                    else
                        cout<<"Array is not sorted"<<endl;
                    break;
            case 15:arr.rearrange();
                    break;
            case 16:cout<<"Enter number of elements in second array: ";
                    cin>>n;
                    Array<type> temp(n);
                    for(i=0; i<n; i++)
                    {
                        cout<<"Enter element "<<i+1<<": ";
                        cin>>x;
                        temp.append(x);
                    }

                    if(arr.isSorted()==1 && temp.isSorted()==1)
                        arr.merge_sorted(temp);
                    else
                        arr.merge(temp);
                    break;
        }

    } while (ch != 20);
    
    return 0;
}