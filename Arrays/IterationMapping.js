const Products = [
    {
        name:"wireless Mouse" , price: 19.98 , inStock: true
    },
    {
        name:"keyboard" , price: 13.98 , inStock: true
    },
    {
        name:"Monitors " , price: 15.98 , inStock: false
    },
    {
        name:"USB Cables" , price: 16.98 , inStock: true
    },
    {
        name:"Printer " , price: 17.98 , inStock: false
    }

];



// for loop 

for(let i = 0 ; i < Products.length; i++){
    console.log(Products[i].name);
    console.log(Products[i].price);
    console.log(Products[i].inStock);
}


// for ..of 


for(const product of Products){
    console.log(product.name);
    console.log(product.price);
    console.log(product.inStock);

}


// for Each loops

Products.forEach((Product)=>{
    console.log(`product ${Product.name} is priced at ${Product.price}`);
    
})


// Map Method 

let newProducts = Products.map((product)=>
    product.name
// product.price
// product.inStock

)

console.log(newProducts);
