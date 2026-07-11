// IBM = Coding round

// Event loop (Deep Understanding)




// call Stack, bcz 
console.log("start");


// microtask Queue & Macrotask Queue
setTimeout(()=>{
 console.log("Timeout");
 
},0)

// microtask Queue & Macrotask Queue
Promise.resolve().then(()=>{
    console.log("Promise");
    
})

console.log("end");

