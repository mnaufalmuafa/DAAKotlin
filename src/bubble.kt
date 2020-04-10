fun bubbleSort(arr : Array<Double>) {
    val arrSize = arr.size
    for (pass in 0 .. arrSize-2) {
        for (i in 0 .. arrSize-pass-2) {
            if (arr[i] > arr[i+1]) {
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
            }
        }
    }
    arr.forEach {
        println(it)
    }
}

fun main() {
    val arr = arrayOf(4.0, 9.5, 7.8, 5.4, 8.9)
    bubbleSort(arr)
}