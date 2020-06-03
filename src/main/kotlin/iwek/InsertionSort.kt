package iwek

fun insertionSort(arr: IntArray) {
    for (j in 1 until arr.size) {
        val key = arr[j]
        var i = j - 1
        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i]
            i--
        }
        arr[i + 1] = key
    }
}
