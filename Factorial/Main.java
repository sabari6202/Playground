#include<stdio.h>
int main()
{
	//your code here
  int i;long int fact=1;
  scanf("%d",&i);
  for(int j=1;j<=i;j++)
  {
    fact=fact*j;
    
  }
  printf("%ld",fact);
  return 0;
}