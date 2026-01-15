package algo.arrays.home_work_11_12_25;

public class Task3 {


    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1, 5, 2};
        int s = 7;

        solution2(arr, s);

    }

    /*
     * Задача: Найти НАИМЕНЬШУЮ длину подмассива, сумма которого >= S.
     *
     * Это пример ДИНАМИЧЕСКОГО скользящего окна!
     * Размер окна не фиксированный, а меняется.
     *
     * Пример: arr = [2, 1, 5, 2, 3, 2], S = 7
     * Ответ: 2 (подмассив [5, 2] или [2, 5])
     *
     * Алгоритм:
     * 1. Расширяем окно вправо, пока сумма < S
     * 2. Когда сумма >= S — пытаемся сжать окно слева
     * 3. Запоминаем минимальную длину
     */
//    static void solution(int[] arr, int s) {
//        int sum = 0;
//        int left = 0;
//        int right = 0;
//        int index1 = 0;
//        int index2;
//
//        while (sum < s) {
//            sum += arr[right];
//            right++;
//        }
//        right--;
//        index2 = right;
//        int result = right - left + 1;
//
//
//        while (right < arr.length) {
//            if (sum < s) {
//                if (right != arr.length - 1) {
//                    right++;
//                    sum += arr[right];
//                } else {
//                    break;
//                }
//            } else {
//                while (sum >= s) {
//                    if ((right - left + 1) < result) {
//                        result = right - left + 1;
//                        index1 = left;
//                        index2 = right;
//                    }
//                    sum -= arr[left];
//                    left++;
//                }
//            }
//
//        }
//
//
//        System.out.println("result(Сумма подмассивов):" + result + " left:" + index1 + " right: " + index2);
//        System.out.println("sum " + sum);
//
//    }

    static void solution2(int[] arr, int number) {
        int currentSum = 0;
        int left = 0;
        int minLen = arr.length + 1;
        int index1 = 0;
        int index2 = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum >= number) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    index1 = left;
                    index2 = right;
                }
                currentSum -= arr[left];
                left++;
            }
        }

        System.out.println("result(Сумма подмассивов):" + minLen + " left:" + index1 + " right: " + index2);

    }
}
