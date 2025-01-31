public class Pattern2 {
    public static void main(String[] args) {
        int n = 3; //Number of rows for the upper half
        //upper half of the diamond
        for(int i = 1; i<=n; i++){
            //print spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("");
            }
            //print stars
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half of the diamond
        for(int i = n-1; i>=1; i--){
            //Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
