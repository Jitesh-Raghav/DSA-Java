package Replace_Elements_with_Greatest_Element_on_Right_Side;

public class OPTIMAL {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){

                int temp=max;       //IN OPTIMAL WE'LL BE REPLACING THE MAX ELEMENT IN ONE TRAVERASL ONLY,
                max=arr[i];         //SO MAX FIND KIYA THEN EVERY ELEMENT REPLACED BY MAX
                arr[i]=temp;        //https://www.youtube.com/watch?v=bLb8e83OK7o&ab_channel=GeeksforGeeks
                                    //SEE THIS VIDEO METHOD 2 IF NOT UNDERSTOOD THIS...SEE ITS THEORY ONLY, NOT CODE



            }
            else
                arr[i]=max;
        }
        return arr;
    }
}
