class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int check = num / 2;
        int sum = 1;
        for(int i = 2; i < check; i++){
            if(num % i == 0){
                sum += i + num / i;
                check = num / i;
            }
        }
        return sum == num;
    }
}