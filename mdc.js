function mdc(a, b) {
  while (a != b) {
    if(a > b)
        a = a - b;
     else
        b = b - a;
  }

  return a;
  }
  
  console.log(mdc(150, 75));