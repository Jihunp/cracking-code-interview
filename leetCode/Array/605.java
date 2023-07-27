//Can place flowers
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = 0;
        int count = 1;
        int b = flowerbed.length;
        for(int i = 0; i < b; i++) {
            if(flowerbed[i] == 0) {
                count++;
            } else {
                flowers += (count-1) / 2;
                count = 0;
            }
        }
        if(count != 0) {
            flowers += count/2;
        }
        return flowers >= n;
    }
}

