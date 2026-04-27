#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 7

int c_queue[MAX_SIZE];
int front = -1;
int rear = -1;

int isFull() {
    return (rear + 1) % MAX_SIZE == front;
}

int isEmpty() {
    return front == -1;
}

void enqueue(int data) {
    if (isFull()) {
        printf("Queue overflow\n");
        return;
    }
    if (isEmpty()) {
        front = 0;
    }
    rear = (rear + 1) % MAX_SIZE;
    c_queue[rear] = data;
    printf("Element %d inserted\n", data);
}

int dequeue() {
    if (isEmpty()) {
        printf("Queue underflow\n");
        return -1;
    }
    int data = c_queue[front];
    if (front == rear) {
        front = rear = -1;
    } else {
        front = (front + 1) % MAX_SIZE;
    }
    printf("Element %d dequeued\n", data);
    return data;
}

void display() {
    if (isEmpty()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    int i = front;
    while (i != rear) {
        printf("%d ", c_queue[i]);
        i = (i + 1) % MAX_SIZE;
    }
    printf("%d\n", c_queue[rear]);
}

int main() {
    int choice, data;
    while (1) {
        printf("\n\t\t\tCircular queue\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter Your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("\nEnter the data to include: ");
                scanf("%d", &data);
                enqueue(data);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
                break;
            default:
                printf("Invalid option...Try again...\n");
                break;
        }
    }
    return 0;
}
