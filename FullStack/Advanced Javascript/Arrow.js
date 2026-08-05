// const add = (a,b)=>a+b
// console.log(add(5,7));

// const add=(a,b)=>{
//     return a+b;
// }
// const add = (a,b)=>{
// console.log(a+b);
// }
// add(5,7);
// const name = "Bala";
// const greeting = `Hello,${name}`;
// console.log(greeting);

// const a = 5;
// const b = 10;
// const c = a+b;
// console.log(`The addition of ${a} and ${b} is ${c}`);

// const message = `Hi,Hellow,
// How are you,
// Are you Happy`;
// console.log(message);

// const arr = [1,2,3,4];
// const copy = [...arr];
// copy.push(5,8);
// console.log(copy);

// const Boys = ["Aravindh","Antony"];
// const hero = ["hulk","thor"];
// const combined = [...Boys,...hero];
// console.log(combined);

// const arr = [1,2,3,4,5];
// // const[firstitem,...restitems] = arr;
// // console.log(firstitem);
// // console.log(restitems);
// b=[];
// for(i = 0;i<arr.length;i++){
//     b.push(arr[i]*2);
// }
// console.log(b);
// console.log(arr);

// const nums = [2,3,8,5,2];
// const doubled = nums.filter((num)=>num%2==0);
// console.log(doubled);

const num1 = [1,2,3,4,5,6,7,8,9];
const even = num1.filter(num =>{
    return num%2==0
});
console.log(even);