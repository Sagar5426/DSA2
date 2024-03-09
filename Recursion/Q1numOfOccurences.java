public class Q1numOfOccurences {
    public static void allOccurences(int arr[],int key,int index){
        if(index == arr.length){
            return;
        }
        if (arr[index] == key){
            System.out.print(index+" ");
        }
        allOccurences(arr,key,index+1);
    }
    public static void main(String[] args) {
        int numbers[] = {3,2,4,5,6,2,7,2,2};
        allOccurences(numbers,2,0);
    }
}
