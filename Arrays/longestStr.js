// find longrest string in arr 
// in Adobe coding round


const arr = [ "javaScript" , "isPalidrom" , " dbms"];

let longest= "";

for(let s of arr){
    if(s.length > longest.length) longest= s ;
}

console.log(longest);
