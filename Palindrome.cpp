#include <stdio.h>

int main()
{
int num,n,sum=0,temp;
scanf("%d",&num);
temp=num;

for (int i=0;i<num;i++)
	{   n=num%10;
		sum=sum*10+n;
		n=n/10;
}

if (temp==sum)
	printf("Given no. is a Palindrome");
else
	printf("Entered no. is not a Palindrome");

return 0;

}


