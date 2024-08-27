package DSA;

public class Bubblesort {


    public static void main(String[] args) {
        
        int nums[]={6,5,3,8,9,4};
        int size=nums.length;
        int temp=0;

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println();
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j]+ "  ");
            }
        }
    }
    
}
