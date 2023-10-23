function quickSort(data) {
  if (data.length <= 1) return data;
  const pivot = data[0];
  const left = data.filter((x) => x < pivot);
  const right = data.filter((x) => x > pivot);

  return [...quickSort(left), pivot, ...quickSort(right)];
}
let arr = [28, 21, 4, 83, 5, 46, 95, 81, 23, 8, 53, 24, 9, 82, 98];
console.log(quickSort(arr));
