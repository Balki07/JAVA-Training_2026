// using array function add the elements in the array
const arr = [1, 2, 3, 4, 5];
const sum = arr.reduce((i,j) => i + j, 0);
console.log(sum); 

//product using the reduce
const mul = arr.reduce((i,j) => i * j, 1);
console.log(mul);