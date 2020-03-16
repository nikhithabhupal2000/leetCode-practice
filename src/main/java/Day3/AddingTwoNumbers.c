/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode * insert(struct ListNode * root, int n){
    struct ListNode * temp = (struct ListNode *)malloc(sizeof(struct ListNode));
    temp -> val = n;
    temp -> next = NULL;
    if(root == NULL){
        root = temp;
    }
    else{
        struct ListNode * p = root;
        while(p -> next){
            p = p -> next;
        }
        p -> next = temp;
    }
    return root;
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int carry = 0;
    struct ListNode * sol = NULL;
    int in;
    int ans;
    while(l1 || l2){
        if(l1 && l2){
            ans = carry + l1 -> val + l2 -> val;
             l1 = l1 -> next;
             l2 = l2 -> next;
        }
        else if(l1 && !l2){
            ans = carry + l1 -> val;
            l1 = l1 -> next;
        }
        else{
            ans = carry + l2 -> val;
            l2 = l2 -> next;
        }
        in = ans % 10;
        carry = ans / 10;
        sol = insert(sol, in);
       
    }
    if(carry != 0){
        sol = insert(sol,carry);
    }
    return sol;

}


