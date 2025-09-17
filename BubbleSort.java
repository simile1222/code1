public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        // TODO: 버블 정렬 구현
        // 힌트: 인접 원소를 비교해 큰 값을 뒤로 보내는 패스(outer)와
        //       스왑을 수행하는 inner 루프를 작성하세요.
        //       최적화: 스왑이 없으면 조기 종료.
        for(int j=1;j<numbers.length;j++){
            for(int i=0;i<numbers.length-j;i++){
                if(numbers[i]>numbers[i+1]){
                    int firstNum = numbers[i];
                    int secondNum = numbers[i+1];
                    numbers[i] = secondNum;
                    numbers[i+1] = firstNum;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers= {4,3,5,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }
}
