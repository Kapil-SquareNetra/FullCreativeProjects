package com.example.kotlinexamples.SamplePrograms.SortingAlgorithmsPackage

class SortingClass {

    companion object{

        fun bubbleSort(arr : IntArray):IntArray{

            for(i in 0..arr.size-1)
                for(j in 0 until arr.size-1-i){

                    if (arr[j]>arr[j+1]){
                        var temp= arr[j]
                        arr[j]= arr[j+1]
                        arr[j+1]= temp
                    }

                }
            return arr

        }

        fun insertionSort(arr: IntArray): IntArray{
            for(i in 1..arr.size-1){
                var key= arr[i]
                var j=i-1
                while (j>=0 && arr[j]> key){
                    arr[j+1]= arr[j]
                    j-=1
                }
                arr[j+1]=key
            }
            return arr
        }

        fun selectionSort(arr: IntArray): IntArray{

            for(i in 0 until arr.size-1){
                var index=i
                for (j in i+1 until arr.size)
                    if (arr[j]<arr[index]) index=j

                var temp= arr[index]
                arr[index]= arr[i]
                arr[i]= temp

            }

            return arr
        }

    }
}