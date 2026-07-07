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

// product name

const ProductName = Products.map((product)=>product.name);
console.log(ProductName);
 
// incrase value of price

const priceInc = Products.map((product)=>product.price = product.price  + 10 )

console.log(priceInc);


// filter method 

const inStockProduct  =  Products.filter((product)=>product.inStock)
console.log(inStockProduct);


// reducing method

const totalPrice  = Products.reduce((total , product)=>total + product.price,0)

console.log(totalPrice);
