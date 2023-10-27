
#include <stdio.h>

int main()
{
    int a,b,m,n,i,j,ch;
    
    printf("Enter the order of matrix (m x n): ");
    scanf("%d %d",&m,&n);
    
    int A[m][n], R[n], C[m];
    
    // User Input
    
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("Enter the value of [%d,%d]: ",i,j);
            scanf("%d",&A[i][j]);
        }
    }
    
    // Print Matrix
    
    printf("\nGiven Matrix:\n\n");
    
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d ",A[i][j]);
        }
        printf("\n");
    }

    // User Choice
    
    printf("\nPress 1 to Swap two Rows.\nPress 2 to Swap two Columns.\n");
    printf("Enter your choice: ");
    scanf("%d",&ch);
    
    if (ch == 1)
    {
        printf("Which two rows do you want to swap? (r1 r2): ");
        scanf("%d %d",&a,&b);
        
        if (a > m || b > m || a <= 0 || b <= 0)
        {
            printf("Invalid Swap!");
            goto exit;
        }
        
        // Store the b row in Array
        
        for (i = 0; i < m; i++)
        {   
            if (i == (b-1))
            {
                for (j = 0; j < n; j++)
                {
                    R[j] = A[i][j];
                }
                break;
            }
        }
        
        // Overwrite a row over b row and replace row a with b
        
        for (i = 0; i < m; i++)
        {   
            if (i == (a-1))
            {
                for (j = 0; j < n; j++)
                {
                    A[b-1][j] = A[i][j];
                    A[i][j] = R[j];
                }
                break;
            }
        }
        
        // Print Matrix
    
        printf("\nSwapped Row %d and Row %d: \n\n",a,b);
    
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                printf("%d ",A[i][j]);
            }
            printf("\n");
        }
    }
    else if (ch == 2)
    {
        printf("Which two columns do you want to swap? (c1 c2): ");
        scanf("%d %d",&a,&b);
        
        if (a > n || b > n || a <= 0 || b <= 0)
        {
            printf("Invalid Swap!");
            goto exit;
        }
        
        // Store the b col in Array
        
        for (j = 0; j < n; j++)
        {   
            if (j == (b-1))
            {
                for (i = 0; i < m; i++)
                {
                    C[i] = A[i][j];
                }
                break;
            }
        }
        
        // Overwrite a col over b col and replace col a with b
        
        for (j = 0; j < n; j++)
        {   
            if (j == (a-1))
            {
                for (i = 0; i < m; i++)
                {
                    A[i][b-1] = A[i][j];
                    A[i][j] = C[i];
                }
                break;
            }
        }
        
        // Print Matrix
    
        printf("\nSwapped Col %d and Col %d: \n\n",a,b);
    
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                printf("%d ",A[i][j]);
            }
            printf("\n");
        }
    }
    else
    {
        printf("\nInvalid Input!");
    }
    exit:
        return 0;
}
