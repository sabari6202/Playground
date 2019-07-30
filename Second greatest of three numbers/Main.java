#include<stdio.h>
int main()
{
  int a,b,c,temp;
  scanf("%d%d%d",&a,&b,&c);
  l1:
  if(a>b)
  {
    temp=a;
    a=b;
    b=temp;
  }
  if(b>c)
  {
    temp=b;
    b=c;
    c=b;
    goto l1;
  }
  printf("%d",b);
  return 0;
}