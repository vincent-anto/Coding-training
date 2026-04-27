#include<stdio.h>
int main(){
	int n,i,search,found=0;
	int rollno[100];
	char name[100][50];
	float mark[100];
	printf("\t\t\t***Student table using array");
	printf("Enter number of students:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("\nEnter details for student :");
		printf("\nRoll no :");
		scanf("%d",&rollno[i]);
		printf("\nName :");
		scanf("%s",&name[i]);
		printf("\nMark :");
		scanf("%f",&mark[i]);
	}
	printf("Enter Roll no to search :");
	scanf("%d",&search);
	for(i=0;i<n;i++){
		if(rollno[i]==search){
			printf("Roll no:%d \nname:%s \nmark:%f\n",rollno[i],name[i],mark[i]);
			found+=1;
			break;
		}
	}
	printf("\t\t\t---Student details---\n\n");
	for(i=0;i<n;i++)
		printf("Roll NO:%d\nName:%s\nmark:%2f\n\n",rollno[i],name[i],mark[i]);
	return 0;
}
