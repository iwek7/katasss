package iwek

fun quickSort(arr: IntArray) {
    quickSort(arr, 0, arr.size - 1)
}

/**
 * Below code assumes that end is index of last position of array (not one beyond)
 */

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start < end) {
        val pivot = partition(arr, start, end)
        quickSort(arr, start, pivot - 1)
        quickSort(arr, pivot + 1, end)
    }
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[end]
    var p = start - 1
    for (j in start until end) {
        if (arr[j] <= pivot) {
            p++
            arr.swap(p, j)
        }
    }
    arr.swap(p + 1, end)
    return p + 1
}

fun IntArray.swap(x: Int, y: Int) {
    val tmp = this[x]
    this[x] = this[y]
    this[y] = tmp
}