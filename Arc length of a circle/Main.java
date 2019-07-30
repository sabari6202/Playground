#include<stdio.h>
int main()
{
  float rad,ang,arc;
  scanf("%f\n%f",&rad,&ang);
  arc=(ang/360)*(2*3.14*rad);
  printf("%0.2f",arc);
  return 0;
}