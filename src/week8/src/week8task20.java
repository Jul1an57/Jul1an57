public class week8task20 {
    public static void main(String[] args) {
        int[] list = {1,4,8,5,9,7};
        int i = linearsearch(list,8);
        System.out.println("THe key is found at index:"+i);
    }

    private static int linearsearch(int[] list, int i) {
        for (int j = 0; j < list.length; j++) {
            if(i==list[j]){
                return j;
            }
        }
        return -1;
    }
}
