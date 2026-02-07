import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/*
 This class tests the merge method in MergeSortedArrays.
 Each test checks if the result is correct for different cases.
*/
public class MergeSortedArraysTest {

    // Test merging two normal sorted arrays
    @Test
    public void testMergeNormalArrays() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] result = MergeSortedArrays.merge(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    // Test it when the first array is empty
    @Test
    public void testMergeWithFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};

        int[] expected = {1, 2, 3};

        int[] result = MergeSortedArrays.merge(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    // Test arrays with different lengths
    @Test
    public void testMergeDifferentSizes() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4, 5, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] result = MergeSortedArrays.merge(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    // Test when the arrays are already in order
    @Test
    public void testMergeAlreadySorted() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] result = MergeSortedArrays.merge(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    // Test arrays that contain duplicate numbers
    @Test
    public void testMergeWithDuplicates() {
        int[] arr1 = {1, 2, 2};
        int[] arr2 = {2, 3, 4};

        int[] expected = {1, 2, 2, 2, 3, 4};

        int[] result = MergeSortedArrays.merge(arr1, arr2);

        assertArrayEquals(expected, result);
    }
}
