#include <iostream>
#include<bits/stdc++.h>
using namespace std;

class node
{
    public:
    int data;
    node* npx;
};

node* XOR(node* a, node* b)
{
    return reinterpret_cast<node *>(reinterpret_cast<uintptr_t>(a) ^ reinterpret_cast<uintptr_t>(b));
}

void insert(node** head_ref, int data)
{
    node * new_node = new node();
    new_node->data = data;

    new_node->npx=*head_ref;

    if (*head_ref != NULL) 
    { 
        (*head_ref)->npx = XOR(new_node, (*head_ref)->npx); 
    } 
 
    *head_ref = new_node;
}

void printList (node *head) 
{ 
    node *curr = head; 
    node *prev = NULL; 
    node *next; 
 
    while (curr != NULL) 
    {  
        cout<<curr->data<<" ";
        next = XOR (prev, curr->npx); 
        prev = curr; 
        curr = next; 
    } 
} 
int main() {
    node *head = NULL; 
    insert(&head, 10); 
    insert(&head, 20); 
    insert(&head, 30); 
    insert(&head, 40); 
    printList (head); 
    return (0); 
}
