/*You have n stacks of books. Each stack of books has some height arr[i] equal to the number of books on that stack ( considering all the books are identical and each book has a height of 1 unit ). In one move, you can select any number of consecutive stacks of books such that the height of each selected stack of books arr[i] <= k. Once such a sequence of stacks is chosen, You can collect any number of books from the chosen sequence of stacks.
What is the maximum number of books that you can collect this way?

Example 1

Input
8 1
3 2 2 3 1 1 1 3
Output
3
Explanation 
We can collect maximum books from consecutive stacks numbered 5, 6, and 7 having height less than equal to K.*/

class Solution {
    long max_Books(int arr[], int n, int k) {
       
       long score=0,maxscore=0;
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]<=k)
           {
               score+=arr[i];
           }
           
           else{
               score=0;
           }
           
           if(maxscore< score)
           {
               maxscore=score;
           }
       }
       
       return maxscore;
    }
}