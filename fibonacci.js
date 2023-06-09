function fibonacci(n) {
    if (n <= 0) {
      return [];
    } else if (n === 1) {
      return [0];
    } else if (n === 2) {
      return [0, 1];
    } else {
      let seq = [0, 1];
      for (let i = 2; i < n; i++) {
        seq.push(seq[i - 1] + seq[i - 2]);
      }
      return seq;
    }
  }
  console.log(fibonacci(12));
