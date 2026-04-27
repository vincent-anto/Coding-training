#include<stdio.h>
#include<stdlib.h>
struct Node{    
	int data;
	struct Node *next;
};
struct Node *head=NULL;
struct Node *createNode(int value){
	struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
	newNode->data=value;
	newNode->next=NULL;
}
void InsertBeginning(int data){
	struct Node *newNode=createNode(data);
	if(head==NULL)
        	head=newNode;
	else{
		newNode->next=head;
		head=newNode;
	}
}
void InsertEnd(int data){
        struct Node *newNode=createNode(data);
        if(head==NULL){
		head=newNode;
		return;
	}
	struct Node *temp=head;
	while(temp->next!=NULL)
		temp=temp->next;
	temp->next=newNode;
}
void InsertAtPosition(int data,int pos){
	if(pos<=1){
		InsertBeginning(data);
		return;
	}
        struct Node *newNode=createNode(data);
	struct Node *temp=head;
	int i;
	for(i=1;temp!=NULL&&i<pos-1;i++)
		temp=temp->next;
	if (temp==NULL){
		InsertEnd(data);
		return;
	}
	newNode->next=temp->next;
	temp->next=newNode;
}
void DeleteBeginning(){
        if(head==NULL){
		printf("\nList is empty\n");
		return;
	}
	struct Node *temp=head;
	head=head->next;
	printf("\nDeleted %d\n",temp->data);
	free(temp);
}
void DeleteEnd(){
	if(head==NULL){
                printf("\nList is empty\n");
                return;
        }
        struct Node *temp=head;
        while(temp->next->next!=NULL)
                temp=temp->next;
	struct Node *del=temp->next;
        printf("\nDeleted : %d",del->data);
	free(del);
	temp->next=NULL;
}
void DeleteAtPosition(int pos){
        if(head==NULL){
                printf("\nList is empty\n");
                return;
        }
	if(pos<=1){
		DeleteBeginning();
		return;
	}
        struct Node *temp=head;
        struct Node *prev=NULL;
        int i;
        for(i=1;temp!=NULL&&i<pos-1;i++)
		temp=temp->next;
        
        prev=temp->next;
        temp->next=prev->next;
	printf("\nDeleted : %d",prev->data);
	free(prev);
}
void search(int key){
	struct Node *temp=head;
	int posi=1,flag=0;
	while(temp!=NULL){
		if(temp->data==key){
			printf("\nElement %d found at Position %d\n.",key,posi);
			flag++;
			return;
		}
		temp=temp->next;
		posi++;
	}
	if(flag==0)
		printf("\nElement %d is not found in the linked list.\n",key);
}
void display(){
	int i;
	struct Node *temp=head;
	if(temp==NULL){
		printf("\nList is empty");
		return;
	}
	printf("\nList:\n");
	for(i=0;temp!=NULL;i++){
		printf("%d -> %d\n",i+1,temp->data);
		temp=temp->next;
	}
	printf("Null\n");
}
void main(){
        int con=1,ch,data,pos;
        while(con==1)
        {
                printf("\nLinked List Operations : \n\t\t 1.Insert at beginning \n\t\t 2.Insert at ending \n\t\t 3.Insert at position \n\t\t 4.Delete at beginning \n\t\t 5.Delete at ending \n\t\t 6.Delete at position \n\t\t 7.Search \n\t\t 8.Display list \n\t\t 9.Exit \n");
                printf("\n Enter the choice :");
                scanf("%d",&ch);
                switch(ch){
                        case 1:
				printf("\nEnter value :");
				scanf("%d",&data);
				InsertBeginning(data);
                                break;
                        case 2:
				printf("\nEnter value :");
                                scanf("%d",&data);
				InsertEnd(data);
                                break;
                        case 3:
				printf("\nEnter value :");
                                scanf("%d",&data);
				printf("\nEnter position :");
                                scanf("%d",&pos);
				InsertAtPosition(data,pos);
                                break;
                        case 4:
				DeleteBeginning();
                                break;
                        case 5:
				DeleteEnd();
                                break;
			case 6:
                                printf("\nEnter position :");
                                scanf("%d",&pos);
				DeleteAtPosition(pos);
                                break;
			case 7:
				printf("\nEnter value to search :");
                                scanf("%d",&data);
				search(data);
                                break;
			case 8:
				display();
                                break;
			case 9:
				end(0);
				break;
                        default:
                                printf("\nInvalid choice");
                                break;
                }
        }
}
