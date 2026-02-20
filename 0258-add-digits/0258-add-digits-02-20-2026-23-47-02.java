class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum =0 ;
            while(num>0){
                int digit = num % 10 ;
                sum += digit ;
                num =num/10 ;
            }
        num =sum ; ;
        }
        return num ;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in );
        System.out.println("enter the value of num ...");
        int num = sc.nextInt();
Solution obj = new Solution();
int res = obj.addDigits(num);
System.out.println(res);
    }
}