function countIntegers(n, data) {
    let count = 0;
  
    for (let i = 0; i < data.length; i++) {
      if (Number.isInteger(data[i]) && data[i] >= 1 && data[i] <= n) {
        count++;
      }
    }
  
    return count;
  }
  
  const data = [5, 10, 15, 3, 6, 7, 14];
  console.log(countIntegers(5, data));