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



// shorted Arr

const shortedProduct  = Products.slice().sort((a,b)=>a.price - b.price)

console.log(shortedProduct);


// Destructuring

