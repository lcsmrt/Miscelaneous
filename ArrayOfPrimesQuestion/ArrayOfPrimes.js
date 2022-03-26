const main = (params) => {
  let sumOfArrays = 0;
    
  for(let i = 0; i < params.length; i++) {
    sumOfArrays += params[i];
  }
  return sumOfArrays;
}

const arrayOfNumbers = [];

for(let i = 1; i <= 1000; i++) {
 arrayOfNumbers.push(i);   
}

function numberIsPrime(number) {
  if(number <= 1) return false;
  if(number == 2) return true;
  else {
    for(let i = 2; i < number; i++) {
      if(number % i == 0) {
        return false;
      }
      return true;
    }
  }
}

arrayOfPrimes = arrayOfNumbers.filter(numberIsPrime);

console.log(main(arrayOfPrimes));