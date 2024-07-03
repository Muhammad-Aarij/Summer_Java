public class Array {
    public static void main(String args[]) {
        int num[][] = new int[5][5]; // creates an array of size 5
        int a[] = { 1, 2, 2, 4 }; // creates and initializes an array

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                num[i][j]=(int)(Math.random()*15); // prints the element at index 1 of array a
            }
        }
    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(num[i][j]+"  "); // prints the element at index 1 of array a
            }
            System.out.println(); 
        }
        
        System.out.println(); 
        for(int i[]: num){
            for(int j: i){
                System.out.print(j+"  ");
            }
            System.out.println(); 
        }
    }
}
