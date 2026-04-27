#include<stdio.h>
#include<string.h>

void main(){
        int c=1,ch,len=0,flag=1,i;
	char str[100];
	printf("\nEnter a String value :");
	scanf("%s",&str);
        while(c==1)
        {
                printf("\nString Operations : \n\t\t 1.String length \n\t\t 2.Reverse \n\t\t 3.Palindrome");
                printf("\n Enter the choice :");
                scanf("%d",&ch);
                while(str[len]!=0)
		                len++;
                switch(ch){
                        case 1:
				printf("Length :%d",len);
                                break;
                        case 2:
				for(i=len-1;i>=0;i--)
					printf("%c",str[i]);
                                break;
                        case 3:
				for(i=0;i<len/2;i++)
					if(str[i]!=str[len-i-1]){
						flag=0;
						break;
					}
				if(flag)
					printf("Given string is Palindrome");
				else
					printf("Given string is Not a Palindrome");
                                break;
                        default:
                                printf("Invalid choice");
                                break;
                }
                printf("\nEnter 1 if you want to continue :");
                scanf("%d",&c);
        }
}


