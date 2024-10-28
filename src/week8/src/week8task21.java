public class week8task21 {
    public static void main(String[] args) {
        int []list={2,4,7,10,11,45,50,59,60,66,69,70,79};
        int j =binarysearch(list,2);
        int k =binarysearch(list,1);
        System.out.println("Key index:"+j);
        System.out.println("Key index:"+k);
    }

    private static int binarysearch(int[] list, int i) {
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(i<list[mid]){
                high =mid-1;
            } else if (i==list[mid]) {
                return mid;
            }else{
                low=mid+1;
            }
        }
        return -low-1;
    }
}
