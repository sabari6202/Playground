#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here       
  
  int b,e,p;
  scanf("%d\n%d",&b,&e);
  if(e<0)
  {
    printf("Wrong input");
  }
  else
  {
    p=pow(b,e);
    printf("%d",p);
  }
  return 0;
}