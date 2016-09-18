#include
 #include
 int main(void)
 {
  char str[80];
  int i,j;

 puts("Enter a string:");
  gets(str);
  for(i=0,j=strlen(str)-1;i<j;j--)
  {
   str[i]^=str[j]^=str[i]^=str[j];
 }
  puts(str);
  putchar('\n');
  return 0;
 }


 str[i]^=str[j]^=str[i]^=str[j];
