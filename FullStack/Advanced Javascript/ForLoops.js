const arr = [1,18,5,4,7,9];
// arr.forEach((num,index)=>{
//     console.log(`${num} : ${index}`);
// });

// const person = {
//     name : "Bala",
//     age : 21,
//     city : "Villupuram"
// }
// for(let key in person){
//     console.log(`${key} : ${person[key]}`);
// }
// const string  ="Balaganesh";
// for (const char of string){
//     console.log(char);
// }
// for(const num of arr){
//     console.log(num);
// }
// const[,two, ,four] = arr;
// console.log(two,four);

// console[two,...rest] = arr;
// console.log(first,rest);

const nums = [1, , 3];
const [a, b = 2, c] = nums;
console.log(a,b,c);