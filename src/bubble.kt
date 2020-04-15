fun bubbleSort(arr : Array<Int>) {
    val arrSize = arr.size
    for (pass in 1 until arrSize) {
        for (i in 0 until arrSize-pass) {
            if (arr[i] > arr[i+1]) {
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
            }
        }
    }
    println("After sorting :")
    arr.forEach {
        print("$it ")
    }
}

fun main() {
    val arr = arrayOf(5, 2, 4, 1, 8)
    bubbleSort(arr)
}