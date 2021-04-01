##include<stdio.h>
#include<math.h>
 
int main()
{
    float xa, ya, xb, yb, difx, dify;
    printf("Enter xa: ");
    
    scanf("%f", &xa);
    printf("Enter ya: ");
    scanf("%f", &ya);
    printf("Enter xb: ");
    scanf("%f", &xb);
    printf("Enter yb: ");
    scanf("%f", &yb);
    
    difx = (xa) - (xb);
    dify = (ya) - (yb);
    printf("Diference x on A,B = %f",difx);
    printf("Diference y on A,b = %f",dify);
    return 0;  
}
