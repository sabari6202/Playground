#include <stdio.h>
int main() {
	// Type your code here
  char alp;
  scanf("%c",&alp);
  if(alp<95)
    printf("%c",alp+32);
  else
    printf("%c",alp-32);
	return 0;
  
}