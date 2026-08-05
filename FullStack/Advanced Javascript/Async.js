async function fetchData() {
    try{
        const res = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await res.json();
        const names = data.map(user => user.name);
        console.log(names);
    }catch(err){
        console.log("Error : ",err);
    }finally{
        console.log("Fetch attempt finished.");
    }
}
fetchData();
//    }finally{
//        console.log("Fetch attempt finished.");
//    }
// }
// fetchData();

async function fetchData() {
    try{
        const res = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await res.json();
        const names = data.map(user => user.name);
        console.log(names);
    }catch(err){
        console.log("Error : ",err);
    }finally{
        console.log("Fetch attempt finished.");
    }
}
fetchData();