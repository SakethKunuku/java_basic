package array_programs;

public class linear_search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 9;
        int found = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("key element : " +arr[i] + "found");
                found = 1;
                break;
            }
        }
        if(found == 1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
