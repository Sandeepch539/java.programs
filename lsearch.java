import java.util.scanner;
   class lsearch{
    public static void main(string args[]){
        scanner in=new scanner(system.in);
        system.out.println("enetr the size of array");
        int i=0;
        int n=in.nextInt();
        int[] arr=new int[n];
        for (i=0;i<n;i++)
            arr[i]=in.nextInt();
        system.out.println("enter the key to fint");
        int key=in.nextInt();
        int index=lsearch(arr,key);
        
        if(index<0)
            system.out.println("element is not found");
        else
            system.out.println("element is found at index"+index);
    }
    static int lsearch (int[] array,int num)
    {
        for(int i=0;i<array.length;i++)
         if(num==array[i])
         return i;
         return -1;
    }
 }
