package twopointers.oppositedirection;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        findMostWater(heights);
    }

//    static void findMostWater(int[] heights){
//        int left = 0, right = heights.length-1;
//        int area = Math.min(heights[left],heights[right]);
//
//        while(left < right){
//            int testArea = (right - left) * Math.min(heights[left], heights[right]);
//            if(area < testArea) area = testArea;
//            if(heights[left] < heights[right]) left++;
//            else right--;
//        }
//        System.out.println(area);
//    }

    static void findMostWater(int[] heights){
        int maxArea = 0;
        int left = 0, right = heights.length-1;

        while(left < right){
            if(heights[left] <= heights[right]){
                int tempArea = (right - left) * heights[left];
                maxArea = Math.max(maxArea,tempArea);
                left++;
            }else{
                int tempArea = (right - left) * heights[right];
                maxArea = Math.max(maxArea,tempArea);
                right--;
            }
        }
        System.out.println(maxArea);
    }
}


//                -- Brute force 🤮🤮--

//static void findContainer(int[] arr){
//    int maxArea = 0;
//    for(int i=0; i < arr.length-1; i++){
//        for(int j=i+1; j < arr.length; j++){
//            int height = Math.min(arr[i], arr[j]);
//            int width = j-i;
//            int area = height * width;
//            if(area > maxArea){
//                maxArea = area;
//            }
//        }
//    }
//    System.out.println(maxArea);
//}
