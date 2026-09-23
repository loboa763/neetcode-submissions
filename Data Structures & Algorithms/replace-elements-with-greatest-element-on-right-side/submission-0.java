class Solution {
    public int[] replaceElements(int[] array){
    int maxNumber = array[array.length-1];
    int[] newArray = new int[array.length];
    newArray[array.length-1] = -1;
    for(int i = array.length-2; i>=0; i--){
      newArray[i] = maxNumber;
      if(array[i]>maxNumber){
          maxNumber = array[i];
        }
    }
    return newArray;
  }
}