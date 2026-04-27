#include<stdio.h>

void main(){
	int li[100],con=1,ch,data,pos,search,n,count=0,i;
	printf("\nEnter the length of the array:");
	scanf("%d",&n);
	printf("\nEnter the value for array :");
	for (i=0;i<n;i++){
		printf("\nEnter the %d value in array :",i+1);
		scanf("%d",&li[i]);
	}
	while(con==1)
	{
		printf("\nArray Operations : \n\t\t 1.Insert \n\t\t 2.Delete \n\t\t 3.Search \n\t\t 4.Display");
		printf("\n Enter the choice :");
		scanf("%d",&ch);
		switch(ch){
			case 1:
				printf("\nEnter the Insertion data :");
				scanf("%d",&data);
				printf("\nEnter the Position to insert :");
				scanf("%d",&pos);
				for (i=n-1;i>=pos-1;i--)
					li[i+1]=li[i];
				li[pos-1]=data;
				n++;
				break;
			case 2:
               		         printf("\nEnter the Position to delete :");
                	         scanf("%d",&pos);
                       		 for (i=pos-1;i<=n-1;i++)
                               		 li[i]=li[i+1];
		   		 n--;
	   			 break;
			case 3:
				printf("\nEnter the search value :");
                        	scanf("%d",&search);
                        	for (i=0;i<n;i++)
					if (search==li[i]){
						printf("Search value found in position : %d",i+1);
						count++;
				}
				if (count==0)
					printf("Not found");
				break;
			case 4:
				printf("\n Display the list :");
				for(i=0;i<n;i++)
					printf("\nElement %d:%d",i+1,li[i]);
				break;
			default: 
				printf("Invalid choice");
				break;
		}
		printf("\nEnter 1 if you want to continue :");
                scanf("%d",&con);
	}
}

