import java.util.*;
class Even {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter the array");
    for(int i=0;i<5;i++){
      a[i]=s.nextInt();
    }
    System.out.println("prime number in array is:-");
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        System.out.println(a[i]);
      }
        
      }
      
    }
  }