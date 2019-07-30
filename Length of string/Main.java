#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[100];
  gets(a);
  int length=strlen(a);
  printf("%d",length);
  return 0;
}