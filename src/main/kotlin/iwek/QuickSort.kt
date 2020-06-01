package iwek

fun quickSort(arr: IntArray) {
    quickSort(arr, 0, arr.size - 1)
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start < end) {
        val p = partition(arr, start, end)
        quickSort(arr, 0, p - 1)
        quickSort(arr, p + 1, end)
    }
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[end]
    var pivotSeparator = start - 1

    for (j in start until end) {
        if (arr[j] <= pivot) {
            pivotSeparator++
            arr[j] = arr[pivotSeparator].also { arr[pivotSeparator] = arr[j] }
        }
    }
    arr[end] = arr[++pivotSeparator].also {arr[pivotSeparator] = arr[end]}
    return pivotSeparator
}

fun IntArray.swap(p1 : Int, p2 : Int) {
    val tmp = this[p1]
    this[p1] = this[p2]
    this[p2] = tmp
}
