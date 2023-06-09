// https://leetcode.com/problems/can-place-flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;

        if(flowerbed.length == 1 && flowerbed[0] == 0) return true;
        
        for(int i =0; i< flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                if(i == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if(i == flowerbed.length-1 && flowerbed[i-1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if( i > 0 && i < flowerbed.length-2 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return (n <= 0)? true : false;
    }
}