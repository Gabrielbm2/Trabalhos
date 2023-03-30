function quicksort(arr) {
    if (arr.length <= 1) {
      return arr;
    } else {
      const pivot = arr[0];
      const left = [];
      const right = [];
  
      for (let i = 1; i < arr.length; i++) {
        if (arr[i] < pivot) {
          left.push(arr[i]);
        } else {
          right.push(arr[i]);
        }
      }
  
      return quicksort(left).concat(pivot, quicksort(right));
    }
  }
  
  const arr = [5, 1];
  console.log(quicksort(arr));