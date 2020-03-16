/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* insert(struct ListNode* ans, int val){
    struct ListNode* t = (struct ListNode*)malloc(sizeof(struct ListNode));
    t -> val = val;
    t -> next = NULL;
    if(ans == NULL){
        ans = t;
    }
    else{
        struct ListNode* p = ans;
        while(p -> next){
            p = p -> next;
        }
        p -> next = t;
    }
    return ans;
}
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* ans = NULL;
    if((!l1) &&(l2)){
        return l2;
    }
    else if((l1)&&(!l2)){
        return l1;
    }
    else if((!l1)&&(!l2)){
        return NULL;
    }
    else{
        
        while(l1 && l2){
            if(l1 -> val < l2 -> val){
                ans = insert(ans, l1 -> val);
                l1 = l1 -> next;
            }
            else{
                ans = insert(ans, l2 -> val);
                l2 = l2 -> next;
            }
        }
        struct ListNode * temp = ans;
        while(temp -> next){
            temp = temp -> next;
            
        }
        if(l1){
            temp -> next = l1;
        }
        if(l2){
            temp -> next =l2;
        }
        
    }
    return ans;
}


