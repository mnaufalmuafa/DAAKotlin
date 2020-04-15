import kotlin.math.floor

fun insertionSort(A: ArrayList<Double>) {
    val n = A.size
    var i: Int
    for (j in 1 until n) {
        val key = A[j]
        i = j - 1
        while (i >= 0 && A[i] > key) {
            A[i + 1] = A[i]
            i--
        }
        A[i + 1] = key
    }
}

fun bucketSort(A:Array<Double>){
    val n=A.size
    val bucket = Array<ArrayList<Double>>(n) { ArrayList() }
    for(i in 0 until n){
        bucket[floor(n*A[i]).toInt()].add(A[i]) // add array element to bucket
    }
    for(i in 0 until n){
        insertionSort(bucket[i]) // sort each bucket
    }
    var j = 0
    for (i in 0 until n){
        for (k in 0 until bucket[i].size) {
            A[j] = bucket[i][k] // put all element back to array
            j++
        }
    }
    println("After sorting :")
    for (i in A)
    {
        print("$i ")
    }
}

fun main() {
    val num = arrayOf(0.52, 0.89, 0.76, 0.57, 0.18, 0.23, 0.78, 0.91, 0.12, 0.77)
    bucketSort(num)
}
