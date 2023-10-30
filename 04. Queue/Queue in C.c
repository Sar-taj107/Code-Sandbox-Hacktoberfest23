#include <stdio.h>
int queue[80],dig,x;
int first = -1;
int last = -1;
int choice = 0;
void enque(int n)
{
  last++;
  queue[last] = n;
  if (first == -1)
  {
    first++;
  }
}
void deque()
{
  printf("The Element Deleted!!\n");
  printf("The Deleted Element Is: %d\n",queue[first]);
  first++;
}
void location()
{
  printf("The Location Of First Pointer Is: %d\n",first);
  printf("The Location Of Last Pointer Is: %d\n",last);
}
void display()
{
  if (first == -1)
  {
    printf("Queue Is Empty\n");
  }
  else
  {
    printf("The Element Of The Queue Is\n");
    for (int i = first;i <= last;i++)
    {
      printf("%d ",queue[i]);
    }
  }
}
int main()
{
  printf("Enter The Number Of Element In A Queue: ");
  scanf("%d",&dig);
  dig = dig -1;
  while (choice != 5)
  {
    printf("\nFunction To Perform\n1)Enque\n2)Deque\n3)Location Of Pointers\n4)Display Function\n5)Quit\n");
    scanf("%d",&choice);
    if (choice == 1)
    {
      if (last == dig)
      {
        printf("Queue Is Full.Hence,Insertion Not Possible\n");
      }
      else
      {
        printf("Enter Element To Be Inserted: ");
        scanf("%d",&x);
        enque(x);
      }
    }
    else if (choice == 2)
    {
      if (first == -1)
      {
        printf("Queue Is Empty.Hence,Deletion Not Possible!!\n");
      }
      else
      {
        if (first == last)
        {
          first = last = -1;
          printf("Queue Has Only 1 Element And It Was Deleted!!\n");    
        }
        else
        {
          deque();
        }
      }
    }
    else if (choice == 3)
    {
      location();  
    }
    else if (choice == 4)
    {
      display();
    }
    else
    {
      printf("Invalid Input!!\n");
    }
  }  
  return 0;
}
