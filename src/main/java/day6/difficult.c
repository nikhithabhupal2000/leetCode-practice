/*
 * Tambourine has prepared a fitness program so that she can become more fit! The program is made of N sessions. During the i-th session, Tambourine will exercise for Mi minutes. The number of minutes she exercises in each session are strictly increasing.

The difficulty of her fitness program is equal to the maximum difference in the number of minutes between any two consecutive training sessions.

To make her program less difficult, Tambourine has decided to add up to K additional training sessions to her fitness program. She can add these sessions anywhere in her fitness program, and exercise any positive integer number of minutes in each of them. After the additional training session are added, the number of minutes she exercises in each session must still be strictly increasing. What is the minimum difficulty possible?
 */
#include<stdio.h>
#include<stdlib.h>
int difficulty(int * session, int n, int k){
    int dif[100];
    for(int i = 0; i < n - 1;i ++){
        dif[i] = session[i + 1] - session[i];
    }
    for(int i = 0; i < n - 1; i ++){
	    printf("%5d", dif[i]);
    }
    int j;
    int a = n - 1;
    int max = 1;
    while(k > 0){
    int in;
    max = 0;
      for(j = 0; j < a;j ++){
          if(dif[j] > max){
              max = dif[j];
              in = j;
          }
      }
      if(max == 1){
          return 1;
      }
      else{
          if(dif[in] % 2 == 0){
              dif[in] = dif[in] / 2;
	      dif[a] = dif[in] / 2;
	      a += 1;
          }
          else{
              dif[in] = dif[in] / 2  + 1;
	      dif[a] = dif[in] / 2;
	      a += 1;
          }
          
      }
      k --;
      for(int i = 0; i < a; i ++){                                                                              printf("%5d", dif[i]);                                                                        } 
      printf("\n");
    }
     for(int i = 0; i < a; i ++){                                                                              printf("%5d", dif[i]);                                                                        }  
    max = 0;
    for( j = 0; j < a;j ++){
          if(dif[j] > max){
              max = dif[j];
          }
      }
      return max;
    
}
int main(){
    int noOfTestCases;
    scanf("%d",&noOfTestCases);
    while(noOfTestCases --){
        int n; int k; 
        scanf("%d%d",&n,&k);
        int * session = (int *)malloc(sizeof(int) * n);
        int i;
        int z = 1;
        for(i = 0; i < n; i ++){
            scanf("%d",&session[i]);
        }
        int sol = difficulty(session, n, k);
        printf("Case #%d: %d\n", z , sol);
        z += 1;
    }
} 
