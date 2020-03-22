/*
 *There are N houses for sale. The i-th house costs Ai dollars to buy. You have a budget of B dollars to spend.

What is the maximum number of houses you can buy?
 *
 */
#include<stdio.h>
#include<stdlib.h>
void readInput(int * cost, int noHouses){
    for(int i = 0; i < noHouses; i ++){
            scanf("%d",&cost[i]);
        }
}
int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}
int getMaxNoHouses(int *cost, int noHouses, int budget){
    int max = 0;
    int i,j;
    qsort(cost, noHouses, sizeof(int), cmpfunc);
    for(i = 0; i < noHouses; i ++){
        int avail = budget;
        int count = 0;
        if(budget < cost[i]){
            break;
        }
        else{
            avail = avail - cost[i];
            count ++;
        }
        for(j = i + 1; j < noHouses; j ++){
            if(cost[j] <= avail){
                avail = avail - cost[j];
                count ++;
            }
        }
        if(count > max){
            max = count;
        }
    }
    return max;
}
int main(){
    int noTestCases;
    scanf("%d",&noTestCases);
    int i = 1;
    while(noTestCases){
        int noHouses;
        int budget;
        scanf("%d",&noHouses);
        scanf("%d",&budget);
        int * cost = (int *)malloc(sizeof(int) * noHouses);
        readInput(cost,noHouses);
        int sol = getMaxNoHouses(cost, noHouses, budget);
        printf("Case #%d: %d",i, sol);
        i += 1;
        noTestCases --;
    }
}
