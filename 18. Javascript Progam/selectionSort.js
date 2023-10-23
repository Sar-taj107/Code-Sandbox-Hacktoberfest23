function selectionSort(data) {
    for (let i = 0; i < data.length; i++) {
        let min = i;
        for (let j = i + 1; j < data.length; j++) {
            if (data[j] < data[min]) {
                min = j
            }
            
        }
        if ( min !== i) [data[i], data[min]] = [data[min], data[i]]
    }
    return data
}
let arr = [28, 21, 4, 83, 5, 46, 95, 81, 23, 8, 53, 24, 9, 82, 98];
console.log(selectionSort(arr));
