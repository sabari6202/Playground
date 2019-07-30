#include<stdio.h>
int main()
{
  //Type your code here
  int n,s,n1,n3;
  scanf("%d",&n);
  n1=(n/100);
  n3=(n%10);
  s=n1+n3;
  printf("%d",s);
  return 0;
}