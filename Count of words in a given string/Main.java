#include<stdio.h>
#include<string.h>

int main()
{
  //Type your code here
  char s[300];
  int count=1;
  gets(s);
  for(int i=0;s[i]!='\0';i++)
  {
     if(s[i]==' ' || s[i]=='\n' || s[i]=='\t')
     { count++;
     }
  }
  printf("%d",count);
  return 0;
  
  
}