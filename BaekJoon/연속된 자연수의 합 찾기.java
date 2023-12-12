

class 연속된_자연수의_합_찾기{
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        
        while(N != end_index){
            if(N==sum){
                count++;
                end_index++;
                sum += end_index;
            }
            else if(N<sum){
                sum -= start_index;
                start_index++;
            }
            else{
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}