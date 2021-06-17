import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.qr_1.level_3.lesson_6.Main;


class MainTest {
    Main main;

    @Test
    void arrayAfter4() {
        main = new Main();
        int[] arr1 = {1, 3, 34, 2, 4, 15, 3, 56};
        int[] arr2 = {1, 3, 34, 2, 4, 15, 3, 4};
        int[] arr3 = {1, 3, 4, 2};
        Assertions.assertArrayEquals(new int[]{15, 3, 56}, Main.arrayAfter4(arr1));
        Assertions.assertArrayEquals(new int[0], Main.arrayAfter4(arr2));
        Assertions.assertArrayEquals(new int[]{2}, Main.arrayAfter4(arr3));
    }

    @Test
    void checkArray() {
        int[] arr1 = {1, 4, 1, 1};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {1, 4, 3, 1};
        Assertions.assertEquals(true, Main.checkArray(arr1));
        Assertions.assertEquals(false, Main.checkArray(arr2));
        Assertions.assertEquals(false, Main.checkArray(arr3));

    }
}