
public class ps1_5 {

    int QuickMerge(int a[],int l,int r){
        int val=a[l];
        int j=l;
        int t;
        for(int i=l+1;i<a.length;i++){
           if(a[i]<=val){
               j=j+1;
               t=a[j];
               a[j]=a[i];
               a[i]=t;
           }
        }
        t=a[l];
        a[l]=a[j];
        a[j]=t;

        return j;
    }

    void QuickSort(int a[],int l,int r){
        if(l<r){
            int m=QuickMerge(a,l,r);
            QuickSort(a,l,m-1);
            QuickSort(a,m+1,r);
        }
    }
    public static void main(String args[]){
        int a[] = {29, 81, 92, 45, 18, 37, 6, 53, 64, 70};
        ps1_5 ob = new ps1_5();
        ob.QuickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");

    }
}
