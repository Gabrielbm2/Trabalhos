function somatorio(nums) {
  let resultado = 0;
  for (let i = 0; i < nums.length; i++) {
    resultado += nums[i];
  }
  return resultado;
}
console.log(somatorio([10, 02, 20, 30,50]));