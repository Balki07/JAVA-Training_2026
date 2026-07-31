let str1 = "bala";
let str2 = "ganesh";
// let str3 = str1.concat(str2);
// console.log(str3);
// console.log(str1+str2);
// console.log(str3.at(2));
text1 = "Please visit Chennai and Chennai";
// text = text1.replace("Chennai","Villupuram");
// console.log(text);
// text = text1.replaceAll("Chennai","Villupuram");
// console.log(text);
// console.log(text.substr(3,7));
// console.log(text.substring(0,6));
// let str3 = "Hello World";
// console.log(str1.padEnd(20,"*"));
// let pass = "9487";
// console.log(pass.padStart(10,"*"));
// let text = "a,b,c,d,e,f,g";
// console.log(text1.split("e"));
//object declaration
let student = {id : 101, name : "bala", age : 23 , dept : "CSE"};
// console.log(student.name);
// console.log(student.dept);
// console.log(student);
// student.mobile = 9876543210;
// console.log(student);
// student.age = 9876543210;
// console.log(student);
// delete student.age;
// console.log(student);
for(let key in student){
    console.log(key,student[key]);
}
let students = [{id : 101, name : "bala", age : 23 , dept : "CSE",mark : 55},
                {id : 102, name : "ganesh", age : 24 , dept : "ECE",mark : 60},
                {id : 103, name : "kumar", age : 25 , dept : "EEE",mark : 58},
                {id : 104, name : "raja", age : 26 , dept : "CSE",mark : 57},
                {id : 105, name : "karthi", age : 27 , dept : "CSE",mark : 59}
            ];
for(let student of students){
    console.log(student.name,student.dept,student.mark);
    if(student.mark>50){
        console.log(student.name,"is pass");
    }
}


// let total = 0;
// let highest = student[0];
// for(let student of students){
//     if(student.mark>highest.mark){
//         highest = student;
//     }
// }
// console.log(highest);

// for (let student of students) {
//     total += student.mark;
// }
// console.log(total);