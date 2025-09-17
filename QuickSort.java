import java.util.ArrayList;
import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        // TODO: 퀵 정렬(분할정복) 구현
        // 1) partition 피벗 기준 분할
        // 2) 좌/우 부분 배열 재귀 정렬
        // 피벗 선택은 고정(끝 원소) 또는 중간값 등 자유
        if(numbers.length==0){
            return;
        }
        int pivot = numbers[0];
        int bigSize=0;
        int smallSize=0;
        for(int i : numbers){
            if(i<pivot){
                smallSize++;
            }else if(i>pivot){
                bigSize++;
            }
        }
        int[] bigNumber = new int[bigSize];
        int[] smallNumber = new int[smallSize];
        int smallIndex=0;
        int bigIndex=0;
        
        for(int i : numbers){
            if(i<pivot){
                smallNumber[smallIndex]=i;
                smallIndex++;
            }else if(i>pivot){
                bigNumber[bigIndex]=i;
                bigIndex++;
            }
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(smallNumber);
        quickSort.sort(bigNumber);
        for(int i=0;i<smallSize+bigSize+1;i++){
            if(i<smallSize){
                numbers[i] = smallNumber[i];
            }else if (i==smallSize){
                numbers[i] = pivot;
            }else{
                numbers[i] = bigNumber[i-smallSize-1];
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers= {4,3,5,2,1};
        QuickSort bubbleSort = new QuickSort();
        bubbleSort.sort(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }
    // TODO(선택): 필요하면 아래 헬퍼를 추가하세요.
    // private void quick(int[] a, int lo, int hi) { ... }
    // private int partition(int[] a, int lo, int hi) { ... }
    // private void swap(int[] a, int i, int j) { ... }
}
