package testProject;
class check_cons {
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   int k=0;
   System.out.println(arr.length);
   
       for(int i=2;i<=n;i++)
       {
           int flag=1;
           for(int j=2;j<=n/2;j++)
           {
               if(i%j==0)
               {
                   
                   flag=0;
               break;
               }
           }
           
           if(flag==1)
           {
               arr[k++]=(int)i;
               //k++;
               System.out.println(arr[k]);
           }
           //System.out.println(i);
       }
   


    int sum=0;
       int count1=0;
       int count2=0;

       for(int i=0;i<arr.length;i++)
       {
           sum+=arr[i];
       
       if(sum>3)
       {
           for(int j=2;j<=sum/2;j++)
           {
               if(sum%j==0)
               {
                   count1++;
                   
               }
           }

       if(count1==0 && sum<n)
           count2++;
       
       }    
       }
       System.out.println(count2);
       sc.close();

}
    }