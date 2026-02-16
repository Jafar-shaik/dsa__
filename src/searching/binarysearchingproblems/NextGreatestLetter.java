package searching.binarysearchingproblems;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        findNextGreatestLetter(letters,'a');

    }

    public static void findNextGreatestLetter(char[] letters, char target){
        int n = letters.length;
        int left = 0, right = n -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        char ans = left < n ? letters[left] : letters[0];
        System.out.println(ans);
    }
}
