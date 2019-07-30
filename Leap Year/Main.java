#include<stdio.h>
int main()
{
  //Type your code here
  long int year;
  scanf("%ld",&year);
  if(year%100==0)
    year=year/100;
if(year%4==0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
  
}