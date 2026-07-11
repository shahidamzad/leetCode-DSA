// HCL Tech =  coding  round

// input = [1,2,2,3,1]
// output = [1,2,3]

let arr = [1,2,2,3,1];


// using set  method
let result =[...new Set(arr)];

console.log(result);

// manual loop method

let unique = [];

for(let i of arr){
    if(!unique.includes(i)){
        unique.push(i)
    }
}

console.log(unique);
