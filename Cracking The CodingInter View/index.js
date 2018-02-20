//Bubble Sort
function bubbleSort(arr) {
    for (var i = 0; i < arr.length - 1; i++) {
        for (var j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);


            }
        }
    }
    console.log("Array is sorted in: " + count + " swaps");
    console.log("first element: " + arr[0]);
    console.log("last element: " + arr[arr.length - 1]);
    return arr;
}



function swap(arr, indexOne, indexTwo) {
    var temp = arr[indexOne];
    arr[indexOne] = arr[indexTwo];
    arr[indexTwo] = temp;
}

console.log(bubbleSort2([3, 2, 1]));