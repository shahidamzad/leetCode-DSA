/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
   const map = new Map();

   // count frequecy 
   for(const ch of s){
    map.set(ch,(map.get(ch) || 0 ) + 1);
   }

   let length = 0;
   let hasOdd = false;

   for(const count of map.values()){
    if(count % 2 === 0){
        length += count;

    }else{
        length += count-1;
        hasOdd = true;
    }

   }
   
return hasOdd ? length + 1 : length;
};