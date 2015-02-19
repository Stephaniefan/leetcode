package Array;
/*
 * 遍历数组 只用一个变量 index 指向重复两个后的第一个 A[index-2]为重复的元素
 * i 向前找到不相等的元素后赋给第一个不应该重复的元素
 * 重点就在于用一个指针指向 Unique 后一个然后将前面不相等的元素赋值到这个指针
 */
public class Solution80V2 {

	public int removeDuplicates(int[] A) {
        int len = A.length;
        if(len <=2 ) return len;
        int index = 2;
        for(int i = index; i < len; i++){
            if(A[i] != A[index-2]){
                A[index] = A[i];
                index++;
            }
        }
        return index;
    }

}
