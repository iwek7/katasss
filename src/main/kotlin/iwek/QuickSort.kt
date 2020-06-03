package iwek

fun quickSort(arr: IntArray) {
    quickSort(arr, 0, arr.size - 1)
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start < end) {
        val pivot = partition(arr, start, end)
        quickSort(arr, 0, pivot - 1)
        quickSort(arr, pivot + 1, end)
    }
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[end]
    var groupsSeparator = start - 1
    for (j in start until end) {
        if (arr[j] < pivot) {
            groupsSeparator++
            arr[j] = arr[groupsSeparator].also { arr[groupsSeparator] = arr[j] }
        }
    }
    arr[end] = arr[++groupsSeparator].also { arr[groupsSeparator] = arr[end] }
    return groupsSeparator
}

