import java.util.*;
public class bubblesort 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int ar[]= new int[8];
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<8;i++) 
        {
                
                ar[i]=sc.nextInt();
        }
        
                for(int i=0;i<7;i++)
                {
                
                    for(int j=0;j<8-i-1;j++)
                    {
                        
                    
                    if(ar[j]>ar[j+1])
                    {
                        int temp=ar[j];
                        ar[j]=ar[j+1];
                        ar[j+1]=temp;
                    
                    }
                }
                }
                for(int i=0;i<8;i++)
                {
                    System.out.print(ar[i]+" ");
                }
            }
        }

    

