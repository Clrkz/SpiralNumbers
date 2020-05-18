import java.util.*;
import java.util.Scanner;
public class SpiralNumbers {
  public static void main(String[] args) {
Input();
}
static void Input(){
  Scanner sc = new Scanner(System.in);
  while(true){
    System.out.print("Size: ");
    Solution(sc.nextInt());
    System.out.println();
  }
}

static void Solution(int n){
   int l = (int) Math.sqrt(n), c, t=n;
  while(l*l < n || n%2==0){
     n++; l = (int) Math.sqrt(n);
   }
   c = l / 2;
   String[][] arr = new String[l][l];
   arr[c][c] = "1";
   int x = 2,y = 1,s = 2,row = c,col = c;
   while(true && t > 1){
   col++; arr[row][col] = (t<=1)? "*":s+""; s++;
     for(int i = 0; i < y ; i++){
       row++; arr[row][col] = (s<=t)?s+"":"*"; s++; 
     }
     for(int i = 0; i < x; i++){
       col--;arr[row][col] = (s<=t)?s+"":"*"; s++;
     }
     for(int i = 0; i< x; i++){
       row--; arr[row][col] = (s<=t)?s+"":"*"; s++;
     }
     for(int i = 0; i< x; i++){
       col++; arr[row][col] = (s<=t)?s+"":"*"; s++;
     }
     x=x+2;y=y+2;
     if(s>=n){break;}
   }
  for(int i= 0; i < l; i++){
     for(int j= 0; j < l; j++){
     System.out.printf("%-4s",arr[i][j]);
   }
   System.out.println();
   }
  }
}
