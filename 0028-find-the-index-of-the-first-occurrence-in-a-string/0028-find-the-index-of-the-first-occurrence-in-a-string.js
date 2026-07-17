var strStr = function(haystack, needle) {
    if (needle === "") return 0;
    return haystack.indexOf(needle);
};

// Test case
console.log(strStr("hello", "ll")); 
console.log(strStr("aaaaa", "bba")); 
console.log(strStr("", "")); 
 