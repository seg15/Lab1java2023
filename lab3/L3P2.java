package lab3;
//prime
public class L3P2{
    public static void main(String[] args){
        int[] arr = {97, 18, 2, 1, 15, 29,5};
        boolean prim=true;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0 || arr[i]==1){
                continue;
            }
            for (int d=2; d<=arr[i]/2; d++)
                if(arr[i]%d==0){
                    prim=false;
                    break;
                }
            if(prim)
                System.out.print(arr[i] + " ");
            prim=true;
        }
        System.out.println();
    }

}
