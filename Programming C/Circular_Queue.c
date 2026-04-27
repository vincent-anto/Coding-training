#include<stdio.h>
#include<stdlib.h>
int queue[];
int front=-1,rear=-1,size,data;
int isFull()
    return (rear + 1) % size == front;
int isEmpty()
     return front == -1;
void enqueue(int data)
{
    if (isFull()) {
        printf("Queue overflow\n");
        return;
    }
    if (front == -1) {
        front = 0;
    }
    rear = (rear + 1) % size;
    queue[rear] = data;
    printf("Element %d inserted\n", data);
}
int dequeue()
{
    if (isEmpty()) {
        printf("Queue underflow\n");
        return -1;
    }
    int data = queue[front];
    if (front == rear) 
        front = rear = -1;
    else 
        front = (front + 1) % size;
    return data;
}
void display()
{
     if (isEmpty()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    int i = front;
    while (i != rear) {
        printf("%d ", queue[i]);
        i = (i + 1) % size;
    }
     printf("%d\n", queue[rear]);
}
void main(){
	int choice;
	while(1){
		printf("\n\t\t\tCircular queue \n 1.Enqueue \n 2.Dequeue \n 3.Display \n 4.Exit \n Enter Your choice :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				printf("\nEnter the data to include :");
				scanf("%d",&data);
				enqueue(data);
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			case 4:
				end(0);
				break;
			default:
				printf("Invalid option...Try again...");
				break;
		}
	}
}
