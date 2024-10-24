package behaviouralDesignPatterns;


/*

Advantages of Strategy Pattern:
    1.Open/Close Pattern : You can add new strategies without modifying context.
    2.Encapsulation : Each algorithm is encapsulated in its own class
    3.Flexibility: The strategy can be changed dynamically at runtime based on the
                    situation

    Strategy pattern is a best choice when you have multiple related algorithms or behaviours
    and wants to switch between them dynamically or allow for an easy extension!

 */

interface SortStrategy{
    void sort(int [] numbers);
}

class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort");
    }
}

class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted using Quick Sort");
    }

    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pi = partition(numbers, low, high);
            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i++;
                // Swap numbers[i] and numbers[j]
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;
        return i + 1;
    }
}


class SortContext{
    private SortStrategy strategy;
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void sortArray(int [] numbers){
        if(strategy != null){
            strategy.sort(numbers);
            printArray(numbers);
        }else{
            System.out.println("No Sorting Strategy");
        }
    }
    public void printArray(int [] numbers){
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class StrategyPattern {
    public static void main(String[] args) {
        int [] numbers = {2 , 22 , 3 , 44 ,5 , 6 ,77 , 32};

        SortContext context = new SortContext();
        context.setStrategy(new BubbleSortStrategy());
        context.sortArray(numbers);


        context.setStrategy(new QuickSortStrategy());
        context.sortArray(numbers);
    }
}
