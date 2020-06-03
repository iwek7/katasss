package iwek

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

class InsertionSortTest {

    @Test
    fun randomizedSorts() {
        for (i in 0..1) {
            testSort(IntArray(10) { Random().nextInt() })
        }
    }

    @Test
    fun alreadySorted() {
        testSort(intArrayOf(2, 3, 4, 5, 6, 7, 8, 9))
    }

    @Test
    fun reverseSorted() {
        testSort(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2))
    }

    @Test
    fun repeatedElement() {
        testSort(intArrayOf(2, 2, 2, 2, 2))
    }

    @Test
    fun singleElement() {
        testSort(intArrayOf(67))
    }

    private fun testSort(arr: IntArray) {
        val arrCpy = arr.copyOf()
        insertionSort(arr)
        arrCpy.sort()
        assertEquals(arrCpy.toList(), arr.toList())
    }
}
