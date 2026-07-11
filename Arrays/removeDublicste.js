// remove dublicate using for loop 



const arr  =  [ 1,1,2,3,4,5,6,5,4,3,3,5,3,3,2,2,5,4,4,4,7,5,6,6,6,8,];


let unique = [];
for(let item of arr){
    if(!unique.includes(item)){
        unique.push(item)
    }

}


console.log(unique);
