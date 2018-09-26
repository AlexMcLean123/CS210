/**
 * @(#)sort.java
 *
 *
 * @author
 * @version 1.00 2017/11/10
 */


public class sort {
   public static String[] insertionSort(String[] arr) {
    for(int i=1;i<arr.length;i++) {
        int j = 0;
        for(;j<i;j++) {
            if(arr[j].length() > arr[j+1].length()) {
                String temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
}

}
public static String compareArrayElements(String[] arr)
{
    String temp = null;
    for(int i=0;i<arr.length-1;i++)
    {
        temp = new String();
        if(arr[i].length() > arr[i+1].length())
            temp = arr[i+1];
        else
            temp = arr[i];
    }
    return temp;
}

private static String[] sortArray(String[] arrString) {
    int length = arrString.length;
        String s;
        for (int i = 0; i < length ; i++) {
            s= new String();

          for(int j = 0; j < length; j++ ){
              if(arrString[i].length()< arrString[j].length()){
                  s = arrString[i];
                  arrString[i] = arrString[j];
                  arrString[j] = s;
              }
          }
        }


    return arrString;
}